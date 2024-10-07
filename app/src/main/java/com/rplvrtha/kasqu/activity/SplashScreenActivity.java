package com.rplvrtha.kasqu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.rplvrtha.kasqu.R;
import com.rplvrtha.kasqu.session.SessionManager;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class SplashScreenActivity extends AppCompatActivity {
    SessionManager sessionManager;

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        this.sessionManager = new SessionManager(this);
        handler.postDelayed(new Runnable() { // from class: com.rplvrtha.kasqu.activity.SplashScreenActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SplashScreenActivity.this.m0lambda$onCreate$0$comrplvrthakasquactivitySplashScreenActivity();
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$0$com-rplvrtha-kasqu-activity-SplashScreenActivity  reason: not valid java name */
    public /* synthetic */ void m0lambda$onCreate$0$comrplvrthakasquactivitySplashScreenActivity() {
        if (!this.sessionManager.isLoggedIn()) {
            Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(i);
            finish();
            return;
        }
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}
