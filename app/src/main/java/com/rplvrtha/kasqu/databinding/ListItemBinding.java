package com.rplvrtha.kasqu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rplvrtha.kasqu.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public final class ListItemBinding implements ViewBinding {
    public final View div;
    public final View divider;
    public final TextView hari;
    public final TextView nominal;
    private final ConstraintLayout rootView;
    public final TextView tanggal;

    private ListItemBinding(ConstraintLayout rootView, View div, View divider, TextView hari, TextView nominal, TextView tanggal) {
        this.rootView = rootView;
        this.div = div;
        this.divider = divider;
        this.hari = hari;
        this.nominal = nominal;
        this.tanggal = tanggal;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ListItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ListItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.list_item, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ListItemBinding bind(View rootView) {
        View divider;
        int id = R.id.div;
        View div = ViewBindings.findChildViewById(rootView, id);
        if (div != null && (divider = ViewBindings.findChildViewById(rootView, (id = R.id.divider))) != null) {
            id = R.id.hari;
            TextView hari = (TextView) ViewBindings.findChildViewById(rootView, id);
            if (hari != null) {
                id = R.id.nominal;
                TextView nominal = (TextView) ViewBindings.findChildViewById(rootView, id);
                if (nominal != null) {
                    id = R.id.tanggal;
                    TextView tanggal = (TextView) ViewBindings.findChildViewById(rootView, id);
                    if (tanggal != null) {
                        return new ListItemBinding((ConstraintLayout) rootView, div, divider, hari, nominal, tanggal);
                    }
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
