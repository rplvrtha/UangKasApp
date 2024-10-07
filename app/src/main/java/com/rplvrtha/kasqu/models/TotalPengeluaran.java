package com.rplvrtha.kasqu.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class TotalPengeluaran {
    @SerializedName("total_pengeluaran")
    private Integer total_pengeluaran;

    public TotalPengeluaran() {
    }

    public TotalPengeluaran(Integer total_pengeluaran) {
        this.total_pengeluaran = total_pengeluaran;
    }

    public Integer getTotal_pengeluaran() {
        return this.total_pengeluaran;
    }
}
