package com.rplvrtha.kasqu.interfaces;

import com.rplvrtha.kasqu.models.Denda;
import com.rplvrtha.kasqu.models.Kas;
import com.rplvrtha.kasqu.models.TotalKas;
import com.rplvrtha.kasqu.models.TotalPemasukan;
import com.rplvrtha.kasqu.models.TotalPengeluaran;
import com.rplvrtha.kasqu.models.Transaksi;
import com.rplvrtha.kasqu.models.User;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public interface ClientInterface {
    @GET("data/find/denda/")
    Call<Denda> getDenda();

    @GET("data/find/kas/")
    Call<Kas> getKas();

    @GET("transaksi/find/user/{user_id}")
    Call<List<Transaksi>> getKas(@Path("user_id") String str);

    @GET("user/find/{user_id}")
    Call<User> getLogin(@Path("user_id") String str);

    @GET("transaksi/saldo/{user_id}")
    Call<TotalKas> getSaldoUser(@Path("user_id") String str);

    @GET("riwayat/pemasukan/")
    Call<TotalPemasukan> getTotalPemasukan();

    @GET("riwayat/pengeluaran/")
    Call<TotalPengeluaran> getTotalPenngeluaran();
}
