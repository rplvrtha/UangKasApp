package com.rplvrtha.kasqu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.rplvrtha.kasqu.R;
import com.rplvrtha.kasqu.helper.Helper;
import com.rplvrtha.kasqu.models.Transaksi;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class TransaksiAdapter extends RecyclerView.Adapter<TransaksiAdapter.MyViewHolder> {
    private Context context;
    private List<Transaksi> location;

    public TransaksiAdapter(List<Transaksi> location, Context context) {
        this.location = location;
        this.context = context;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        Helper helper = new Helper();
        holder.hari.setText(helper.dayFormat(this.location.get(position).getTanggal()));
        holder.tanggal.setText(helper.dateFormat(this.location.get(position).getTanggal()));
        holder.nominal.setText(helper.formatRupiah(this.location.get(position).getNominal()));
    }

    public int getItemCount() {
        return this.location.size();
    }

    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView hari;
        TextView nominal;
        TextView tanggal;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.hari = (TextView) itemView.findViewById(R.id.hari);
            this.tanggal = (TextView) itemView.findViewById(R.id.tanggal);
            this.nominal = (TextView) itemView.findViewById(R.id.nominal);
        }
    }
}
