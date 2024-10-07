package com.rplvrtha.kasqu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rplvrtha.kasqu.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public final class FragmentHomeBinding implements ViewBinding {
    public final RelativeLayout dendaCard;
    public final RelativeLayout dendaTitle;
    public final TextView dendamu;
    public final TextView dendatotal;
    public final TextView kasmu;
    public final TextView kastotal;
    public final RelativeLayout methodTitle;
    public final TextView methodmu;
    public final TextView pemasukan;
    public final RelativeLayout pemasukanCard;
    public final TextView pemasukanNom;
    public final TextView pemasukanTotal;
    public final TextView pengeluaran;
    public final RelativeLayout pengeluaranCard;
    public final TextView pengeluaranNom;
    public final TextView pengeluaranTotal;
    public final ImageView qr;
    private final NestedScrollView rootView;
    public final RelativeLayout tagihan;
    public final RelativeLayout total;
    public final TextView totalKas;
    public final TextView yourKasTh;

    private FragmentHomeBinding(NestedScrollView rootView, RelativeLayout dendaCard, RelativeLayout dendaTitle, TextView dendamu, TextView dendatotal, TextView kasmu, TextView kastotal, RelativeLayout methodTitle, TextView methodmu, TextView pemasukan, RelativeLayout pemasukanCard, TextView pemasukanNom, TextView pemasukanTotal, TextView pengeluaran, RelativeLayout pengeluaranCard, TextView pengeluaranNom, TextView pengeluaranTotal, ImageView qr, RelativeLayout tagihan, RelativeLayout total, TextView totalKas, TextView yourKasTh) {
        this.rootView = rootView;
        this.dendaCard = dendaCard;
        this.dendaTitle = dendaTitle;
        this.dendamu = dendamu;
        this.dendatotal = dendatotal;
        this.kasmu = kasmu;
        this.kastotal = kastotal;
        this.methodTitle = methodTitle;
        this.methodmu = methodmu;
        this.pemasukan = pemasukan;
        this.pemasukanCard = pemasukanCard;
        this.pemasukanNom = pemasukanNom;
        this.pemasukanTotal = pemasukanTotal;
        this.pengeluaran = pengeluaran;
        this.pengeluaranCard = pengeluaranCard;
        this.pengeluaranNom = pengeluaranNom;
        this.pengeluaranTotal = pengeluaranTotal;
        this.qr = qr;
        this.tagihan = tagihan;
        this.total = total;
        this.totalKas = totalKas;
        this.yourKasTh = yourKasTh;
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_home, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentHomeBinding bind(View rootView) {
        int id = R.id.dendaCard;
        RelativeLayout dendaCard = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
        if (dendaCard != null) {
            id = R.id.dendaTitle;
            RelativeLayout dendaTitle = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
            if (dendaTitle != null) {
                id = R.id.dendamu;
                TextView dendamu = (TextView) ViewBindings.findChildViewById(rootView, id);
                if (dendamu != null) {
                    id = R.id.dendatotal;
                    TextView dendatotal = (TextView) ViewBindings.findChildViewById(rootView, id);
                    if (dendatotal != null) {
                        id = R.id.kasmu;
                        TextView kasmu = (TextView) ViewBindings.findChildViewById(rootView, id);
                        if (kasmu != null) {
                            id = R.id.kastotal;
                            TextView kastotal = (TextView) ViewBindings.findChildViewById(rootView, id);
                            if (kastotal != null) {
                                id = R.id.methodTitle;
                                RelativeLayout methodTitle = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
                                if (methodTitle != null) {
                                    id = R.id.methodmu;
                                    TextView methodmu = (TextView) ViewBindings.findChildViewById(rootView, id);
                                    if (methodmu != null) {
                                        id = R.id.pemasukan;
                                        TextView pemasukan = (TextView) ViewBindings.findChildViewById(rootView, id);
                                        if (pemasukan != null) {
                                            id = R.id.pemasukanCard;
                                            RelativeLayout pemasukanCard = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
                                            if (pemasukanCard != null) {
                                                id = R.id.pemasukanNom;
                                                TextView pemasukanNom = (TextView) ViewBindings.findChildViewById(rootView, id);
                                                if (pemasukanNom != null) {
                                                    id = R.id.pemasukanTotal;
                                                    TextView pemasukanTotal = (TextView) ViewBindings.findChildViewById(rootView, id);
                                                    if (pemasukanTotal != null) {
                                                        id = R.id.pengeluaran;
                                                        TextView pengeluaran = (TextView) ViewBindings.findChildViewById(rootView, id);
                                                        if (pengeluaran != null) {
                                                            id = R.id.pengeluaranCard;
                                                            RelativeLayout pengeluaranCard = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
                                                            if (pengeluaranCard != null) {
                                                                id = R.id.pengeluaranNom;
                                                                TextView pengeluaranNom = (TextView) ViewBindings.findChildViewById(rootView, id);
                                                                if (pengeluaranNom != null) {
                                                                    id = R.id.pengeluaranTotal;
                                                                    TextView pengeluaranTotal = (TextView) ViewBindings.findChildViewById(rootView, id);
                                                                    if (pengeluaranTotal != null) {
                                                                        id = R.id.qr;
                                                                        ImageView qr = (ImageView) ViewBindings.findChildViewById(rootView, id);
                                                                        if (qr != null) {
                                                                            id = R.id.tagihan;
                                                                            RelativeLayout tagihan = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
                                                                            if (tagihan != null) {
                                                                                id = R.id.total;
                                                                                RelativeLayout total = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
                                                                                if (total != null) {
                                                                                    id = R.id.total_kas;
                                                                                    TextView totalKas = (TextView) ViewBindings.findChildViewById(rootView, id);
                                                                                    if (totalKas != null) {
                                                                                        id = R.id.your_kas_th;
                                                                                        TextView yourKasTh = (TextView) ViewBindings.findChildViewById(rootView, id);
                                                                                        if (yourKasTh != null) {
                                                                                            return new FragmentHomeBinding((NestedScrollView) rootView, dendaCard, dendaTitle, dendamu, dendatotal, kasmu, kastotal, methodTitle, methodmu, pemasukan, pemasukanCard, pemasukanNom, pemasukanTotal, pengeluaran, pengeluaranCard, pengeluaranNom, pengeluaranTotal, qr, tagihan, total, totalKas, yourKasTh);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
