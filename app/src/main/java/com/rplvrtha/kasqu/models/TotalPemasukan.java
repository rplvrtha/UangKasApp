package com.rplvrtha.kasqu.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class TotalPemasukan {
    @SerializedName("total_pemasukan")
    private Integer total_pemasukan;

    public TotalPemasukan() {
    }

    public TotalPemasukan(Integer total_pemasukan) {
        this.total_pemasukan = total_pemasukan;
    }

    public Integer getTotal_pemasukan() {
        return this.total_pemasukan;
    }
}
