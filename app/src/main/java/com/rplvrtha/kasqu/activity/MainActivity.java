package com.rplvrtha.kasqu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rplvrtha.kasqu.R;
import com.rplvrtha.kasqu.databinding.ActivityMainBinding;
import com.rplvrtha.kasqu.fragments.HomeFragment;
import com.rplvrtha.kasqu.fragments.RiwayatFragment;
import com.rplvrtha.kasqu.helper.UserHelper;
import com.rplvrtha.kasqu.session.SessionManager;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    LinearLayout header;
    SessionManager sessionManager;
    TextView tvUser;
    UserHelper userHelper;

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());
        this.userHelper = new UserHelper(this);
        this.tvUser = (TextView) findViewById(R.id.user);
        this.header = (LinearLayout) findViewById(R.id.header);
        this.sessionManager = new SessionManager(this);
        this.tvUser.setText(this.userHelper.getNama());
        loadFragment(new HomeFragment());
        this.binding.footer.navBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.rplvrtha.kasqu.activity.MainActivity.1
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int item = menuItem.getItemId();
                if (item == R.id.nav_home) {
                    return MainActivity.this.loadFragment(new HomeFragment());
                }
                if (item == R.id.nav_file) {
                    return MainActivity.this.loadFragment(new RiwayatFragment());
                }
                if (item == R.id.nav_logout) {
                    Intent intent = new Intent(MainActivity.this.getApplicationContext(), SplashScreenActivity.class);
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.finish();
                    return MainActivity.this.sessionManager.logout();
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.mainContent, fragment).commit();
            return true;
        }
        return false;
    }
}
