package com.rplvrtha.kasqu.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class User {
    @SerializedName("email")
    private String email;
    @SerializedName("level")
    private String level;
    @SerializedName("nama")
    private String nama;
    @SerializedName("no_induk")
    private String no_induk;
    @SerializedName("password")
    private String password;
    @SerializedName("status")
    private String status;
    @SerializedName("telp")
    private String telp;
    @SerializedName("username")
    private String username;

    public User() {
    }

    public User(String no_induk, String username, String password, String nama, String email, String telp, String status, String level) {
        this.no_induk = no_induk;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.email = email;
        this.telp = telp;
        this.status = status;
        this.level = level;
    }

    public String getNo_induk() {
        return this.no_induk;
    }

    public void setNo_induk(String no_induk) {
        this.no_induk = no_induk;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return this.telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
