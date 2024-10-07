package com.rplvrtha.kasqu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rplvrtha.kasqu.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public final class FragmentRiwayatBinding implements ViewBinding {
    public final RecyclerView listItem;
    private final SwipeRefreshLayout rootView;
    public final SwipeRefreshLayout swipe;

    private FragmentRiwayatBinding(SwipeRefreshLayout rootView, RecyclerView listItem, SwipeRefreshLayout swipe) {
        this.rootView = rootView;
        this.listItem = listItem;
        this.swipe = swipe;
    }

    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRiwayatBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentRiwayatBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_riwayat, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FragmentRiwayatBinding bind(View rootView) {
        int id = R.id.list_item;
        RecyclerView listItem = ViewBindings.findChildViewById(rootView, id);
        if (listItem != null) {
            SwipeRefreshLayout swipe = (SwipeRefreshLayout) rootView;
            return new FragmentRiwayatBinding((SwipeRefreshLayout) rootView, listItem, swipe);
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
