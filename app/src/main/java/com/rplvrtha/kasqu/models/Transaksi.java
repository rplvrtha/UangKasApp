package com.rplvrtha.kasqu.models;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class Transaksi {
    @SerializedName("id_trx")
    private String id_trx;
    @SerializedName("keterangan")
    private String keterangan;
    @SerializedName("no_induk")
    private String no_induk;
    @SerializedName("nominal")
    private Integer nominal;
    @SerializedName("tanggal")
    private Date tanggal;
    @SerializedName("total_transaksi")
    private String total_transaksi;

    public Transaksi() {
    }

    public Transaksi(String id_trx, String no_induk, Date tanggal, Integer nominal, String keterangan, String total_transaksi) {
        this.id_trx = id_trx;
        this.no_induk = no_induk;
        this.tanggal = tanggal;
        this.nominal = nominal;
        this.keterangan = keterangan;
        this.total_transaksi = total_transaksi;
    }

    public String getId_trx() {
        return this.id_trx;
    }

    public String getNo_induk() {
        return this.no_induk;
    }

    public Date getTanggal() {
        return this.tanggal;
    }

    public Integer getNominal() {
        return this.nominal;
    }

    public String getKeterangan() {
        return this.keterangan;
    }
}
