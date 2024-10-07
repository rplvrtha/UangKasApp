package com.rplvrtha.kasqu.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class Kas {
    @SerializedName("jumlah")
    private Integer jumlah;

    public Kas() {
    }

    public Kas(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Integer getJumlah() {
        return this.jumlah;
    }
}
