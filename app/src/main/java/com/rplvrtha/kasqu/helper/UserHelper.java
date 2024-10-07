package com.rplvrtha.kasqu.helper;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class UserHelper {
    private static final String KEY_ID = "no_induk";
    private static final String KEY_LVL = "level";
    private static final String KEY_MAIL = "email";
    private static final String KEY_NAMA = "nama";
    private static final String KEY_STS = "status";
    private static final String KEY_TEL = "telp";
    private static final String PREF_NAME = "user_helper";
    private Context context;
    private SharedPreferences.Editor editor;
    private SharedPreferences pref;

    public UserHelper(Context context) {
        this.context = context;
        this.pref = context.getSharedPreferences(PREF_NAME, 0);
        this.editor = this.pref.edit();
    }

    public void setUserHelper(String no_induk, String nama, String email, String telp, String status, String level) {
        this.editor.putString(KEY_ID, no_induk);
        this.editor.putString(KEY_NAMA, nama);
        this.editor.putString(KEY_MAIL, email);
        this.editor.putString(KEY_TEL, telp);
        this.editor.putString(KEY_STS, status);
        this.editor.putString(KEY_LVL, level);
        this.editor.apply();
    }

    public String getNo_induk() {
        return this.pref.getString(KEY_ID, null);
    }

    public String getNama() {
        return this.pref.getString(KEY_NAMA, null);
    }

    public String getEmail() {
        return this.pref.getString(KEY_MAIL, null);
    }

    public String getTelp() {
        return this.pref.getString(KEY_TEL, null);
    }

    public String getStatus() {
        return this.pref.getString(KEY_STS, null);
    }

    public String getLevel() {
        return this.pref.getString(KEY_LVL, null);
    }
}
