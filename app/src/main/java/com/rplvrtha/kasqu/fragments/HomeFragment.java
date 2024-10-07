package com.rplvrtha.kasqu.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.rplvrtha.kasqu.R;
import com.rplvrtha.kasqu.helper.Helper;
import com.rplvrtha.kasqu.helper.UserHelper;
import com.rplvrtha.kasqu.interfaces.ClientInterface;
import com.rplvrtha.kasqu.models.Denda;
import com.rplvrtha.kasqu.models.Kas;
import com.rplvrtha.kasqu.models.TotalKas;
import com.rplvrtha.kasqu.models.TotalPemasukan;
import com.rplvrtha.kasqu.models.TotalPengeluaran;
import com.rplvrtha.kasqu.services.ClientService;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class HomeFragment extends Fragment {
    ClientInterface clientInterface;
    Helper helper = new Helper();
    TextView kasMingguan;
    TextView totalDenda;
    TextView totalKas;
    TextView totalPemasukan;
    TextView totalPengeluaran;
    UserHelper userHelper;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        this.clientInterface = (ClientInterface) ClientService.getService().create(ClientInterface.class);
        this.totalKas = (TextView) view.findViewById(R.id.total_kas);
        this.totalPemasukan = (TextView) view.findViewById(R.id.pemasukanNom);
        this.totalPengeluaran = (TextView) view.findViewById(R.id.pengeluaranNom);
        this.totalDenda = (TextView) view.findViewById(R.id.dendatotal);
        this.kasMingguan = (TextView) view.findViewById(R.id.kastotal);
        this.userHelper = new UserHelper(requireContext());
        kas();
        pemasukan();
        pengeluaran();
        denda();
        kasm();
        return view;
    }

    private void kasm() {
        Call<Kas> kas = this.clientInterface.getKas();
        kas.enqueue(new Callback<Kas>() { // from class: com.rplvrtha.kasqu.fragments.HomeFragment.1
            public void onResponse(Call<Kas> call, Response<Kas> response) {
                HomeFragment.this.kasMingguan.setText(HomeFragment.this.helper.formatRupiah(((Kas) response.body()).getJumlah().intValue()));
            }

            public void onFailure(Call<Kas> call, Throwable t) {
            }
        });
    }

    private void denda() {
        Call<Denda> kas = this.clientInterface.getDenda();
        kas.enqueue(new Callback<Denda>() { // from class: com.rplvrtha.kasqu.fragments.HomeFragment.2
            public void onResponse(Call<Denda> call, Response<Denda> response) {
                HomeFragment.this.totalDenda.setText(HomeFragment.this.helper.formatRupiah(((Denda) response.body()).getJumlah().intValue()));
            }

            public void onFailure(Call<Denda> call, Throwable t) {
            }
        });
    }

    private void pengeluaran() {
        Call<TotalPengeluaran> kas = this.clientInterface.getTotalPenngeluaran();
        kas.enqueue(new Callback<TotalPengeluaran>() { // from class: com.rplvrtha.kasqu.fragments.HomeFragment.3
            public void onResponse(Call<TotalPengeluaran> call, Response<TotalPengeluaran> response) {
                HomeFragment.this.totalPengeluaran.setText(HomeFragment.this.helper.formatMoney(((TotalPengeluaran) response.body()).getTotal_pengeluaran().intValue()));
            }

            public void onFailure(Call<TotalPengeluaran> call, Throwable t) {
            }
        });
    }

    private void pemasukan() {
        Call<TotalPemasukan> kas = this.clientInterface.getTotalPemasukan();
        kas.enqueue(new Callback<TotalPemasukan>() { // from class: com.rplvrtha.kasqu.fragments.HomeFragment.4
            public void onResponse(Call<TotalPemasukan> call, Response<TotalPemasukan> response) {
                HomeFragment.this.totalPemasukan.setText(HomeFragment.this.helper.formatMoney(((TotalPemasukan) response.body()).getTotal_pemasukan().intValue()));
            }

            public void onFailure(Call<TotalPemasukan> call, Throwable t) {
            }
        });
    }

    private void kas() {
        Call<TotalKas> kas = this.clientInterface.getSaldoUser(this.userHelper.getNo_induk());
        kas.enqueue(new Callback<TotalKas>() { // from class: com.rplvrtha.kasqu.fragments.HomeFragment.5
            public void onResponse(Call<TotalKas> call, Response<TotalKas> response) {
                totalKas.setText(helper.formatRupiah(response.body().getTotal_transaksi() == null ? 0 : response.body().getTotal_transaksi()));
            }

            public void onFailure(Call<TotalKas> call, Throwable t) {
            }
        });
    }
}
