package com.rplvrtha.kasqu.session;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class SessionManager {
    private static final String KEY_IS_LOGGED_IN = "isloggedIn";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_USERNAME = "username";
    private static final String PREF_NAME = "user_helper";
    private Context context;
    private SharedPreferences.Editor editor;
    private SharedPreferences pref;

    public SessionManager(Context context) {
        this.context = context;
        this.pref = context.getSharedPreferences(PREF_NAME, 0);
        this.editor = this.pref.edit();
    }

    public void setLogin(boolean isLoggedIn, String username, String password) {
        this.editor.putBoolean(KEY_IS_LOGGED_IN, isLoggedIn);
        this.editor.putString(KEY_USERNAME, username);
        this.editor.putString(KEY_PASSWORD, password);
        this.editor.apply();
    }

    public boolean isLoggedIn() {
        return this.pref.getBoolean(KEY_IS_LOGGED_IN, false);
    }

    public String getUsername() {
        return this.pref.getString(KEY_USERNAME, null);
    }

    public String getPassword() {
        return this.pref.getString(KEY_PASSWORD, null);
    }

    public boolean logout() {
        this.editor.clear();
        this.editor.apply();
        return true;
    }
}
