package com.rplvrtha.kasqu.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class TotalKas {
    @SerializedName("saldo_user")
    private Integer total_transaksi;

    public TotalKas() {
    }

    public TotalKas(Integer total_transaksi) {
        this.total_transaksi = total_transaksi;
    }

    public Integer getTotal_transaksi() {
        return this.total_transaksi;
    }
}
