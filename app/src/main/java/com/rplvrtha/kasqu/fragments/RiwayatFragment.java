package com.rplvrtha.kasqu.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.rplvrtha.kasqu.R;
import com.rplvrtha.kasqu.adapter.TransaksiAdapter;
import com.rplvrtha.kasqu.helper.UserHelper;
import com.rplvrtha.kasqu.interfaces.ClientInterface;
import com.rplvrtha.kasqu.models.Transaksi;
import com.rplvrtha.kasqu.services.ClientService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class RiwayatFragment extends Fragment {
    ClientInterface clientInterface;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView listView;
    TransaksiAdapter transaksiAdapter;
    UserHelper userHelper;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_riwayat, container, false);
        this.listView = view.findViewById(R.id.list_item);
        this.layoutManager = new LinearLayoutManager(getContext());
        this.listView.setLayoutManager(this.layoutManager);
        this.listView.setHasFixedSize(true);
        this.userHelper = new UserHelper(getContext());
        getJson(this.userHelper.getNo_induk());
        final SwipeRefreshLayout dorefresh = view.findViewById(R.id.swipe);
        dorefresh.setColorSchemeResources(new int[]{R.color.firstPrimaryColor, R.color.secondPrimaryColor, R.color.thirdPrimaryColor});
        dorefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.rplvrtha.kasqu.fragments.RiwayatFragment.1
            public void onRefresh() {
                refreshItem();
            }

            void refreshItem() {
                RiwayatFragment.this.getJson(RiwayatFragment.this.userHelper.getNo_induk());
                onItemLoad();
            }

            void onItemLoad() {
                dorefresh.setRefreshing(false);
            }
        });
        return view;
    }

    public void getJson(String id) {
        this.clientInterface = (ClientInterface) ClientService.getService().create(ClientInterface.class);
        Call<List<Transaksi>> call = this.clientInterface.getKas(id);
        call.enqueue(new Callback<List<Transaksi>>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<List<Transaksi>> call, Response<List<Transaksi>> response) {
                Log.d("tes", response.body().toString());
                transaksiAdapter = new TransaksiAdapter(response.body(), getContext());
                listView.setAdapter(transaksiAdapter);
                transaksiAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Transaksi>> call, Throwable t) {
                RiwayatFragment.this.listView.setVisibility(View.GONE);
                Log.d("Errornya", "ini", t);
                Toast.makeText(getContext(), "No Data Found.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
