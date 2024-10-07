package com.rplvrtha.kasqu.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.rplvrtha.kasqu.R;
import com.rplvrtha.kasqu.helper.Helper;
import com.rplvrtha.kasqu.helper.UserHelper;
import com.rplvrtha.kasqu.interfaces.ClientInterface;
import com.rplvrtha.kasqu.models.User;
import com.rplvrtha.kasqu.services.ClientService;
import com.rplvrtha.kasqu.session.SessionManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class LoginActivity extends AppCompatActivity {
    CheckBox checkBox;
    ClientInterface clientInterface;
    Helper helper = new Helper();
    TextView induk;
    RelativeLayout loading;
    Button logBtn;
    EditText nisEdt;
    EditText passEdt;
    SessionManager sessionManager;
    TextView signText;
    TextView tvPass;
    UserHelper userHelper;

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.nisEdt = (EditText) findViewById(R.id.nis);
        this.passEdt = (EditText) findViewById(R.id.password);
        this.logBtn = (Button) findViewById(R.id.loginBtn);
        this.induk = (TextView) findViewById(R.id.indukText);
        this.tvPass = (TextView) findViewById(R.id.passwordText);
        this.checkBox = (CheckBox) findViewById(R.id.show_pass);
        this.signText = (TextView) findViewById(R.id.loginText);
        this.loading = (RelativeLayout) findViewById(R.id.loading);
        this.clientInterface = (ClientInterface) ClientService.getService().create(ClientInterface.class);
        this.sessionManager = new SessionManager(this);
        this.userHelper = new UserHelper(this);
        this.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.rplvrtha.kasqu.activity.LoginActivity.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    LoginActivity.this.passEdt.setInputType(145);
                } else {
                    LoginActivity.this.passEdt.setInputType(129);
                }
                LoginActivity.this.passEdt.setSelection(LoginActivity.this.passEdt.getText().length());
            }
        });
        this.logBtn.setOnClickListener(new View.OnClickListener() { // from class: com.rplvrtha.kasqu.activity.LoginActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                LoginActivity.this.login();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void login() {
        String nis = this.nisEdt.getText().toString();
        final String pass = this.passEdt.getText().toString();
        this.loading.setVisibility(View.VISIBLE);
        if (TextUtils.isEmpty(nis)) {
            this.loading.setVisibility(View.GONE);
            Toast.makeText((Context) this, (CharSequence) "Enter Your NIS!", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(pass)) {
            this.loading.setVisibility(View.GONE);
            Toast.makeText((Context) this, (CharSequence) "Enter Your Password!", Toast.LENGTH_SHORT).show();
        } else if (!nis.isEmpty() && nis.length() != 0 && !pass.isEmpty() && pass.length() != 0) {
            Call<User> login = this.clientInterface.getLogin(nis);
            login.enqueue(new Callback<User>() { // from class: com.rplvrtha.kasqu.activity.LoginActivity.3
                public void onResponse(Call<User> call, Response<User> response) {
                    Log.d("tes",response.toString());
                    LoginActivity.this.loading.setVisibility(View.GONE);
                    if (((User) response.body()).getNo_induk() == null) {
                        Toast.makeText(LoginActivity.this.getApplicationContext(), "NIS/Password Salah!", Toast.LENGTH_SHORT).show();
                        LoginActivity.this.nisEdt.setText("");
                        LoginActivity.this.passEdt.setText("");
                    } else if (response.isSuccessful()) {
                        if (!((User) response.body()).getPassword().toString().equals(LoginActivity.this.helper.getMD5(pass).toString())) {
                            Toast.makeText(LoginActivity.this.getApplicationContext(), "NIS/Password Salah!", Toast.LENGTH_SHORT).show();
                            LoginActivity.this.nisEdt.setText("");
                            LoginActivity.this.passEdt.setText("");
                        } else if (((User) response.body()).getPassword().toString().equals(LoginActivity.this.helper.getMD5(pass).toString())) {
                            Intent intent = new Intent(LoginActivity.this.getApplicationContext(), MainActivity.class);
                            LoginActivity.this.startActivity(intent);
                            LoginActivity.this.finish();
                            LoginActivity.this.sessionManager.setLogin(true, ((User) response.body()).getUsername(), ((User) response.body()).getPassword());
                            LoginActivity.this.userHelper.setUserHelper(((User) response.body()).getNo_induk(), ((User) response.body()).getNama(), ((User) response.body()).getEmail(), ((User) response.body()).getTelp(), ((User) response.body()).getStatus(), ((User) response.body()).getLevel());
                        }
                    }
                }

                public void onFailure(Call<User> call, Throwable t) {
                    LoginActivity.this.loading.setVisibility(View.GONE);
                    Log.d("Error here", "Error here", t);
                    t.printStackTrace();
                    Log.d("Error here", "Error here2", t);
                }
            });
        }
    }
}
