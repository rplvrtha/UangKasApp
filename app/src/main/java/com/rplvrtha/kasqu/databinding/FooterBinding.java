package com.rplvrtha.kasqu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rplvrtha.kasqu.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public final class FooterBinding implements ViewBinding {
    public final BottomNavigationView navBottom;
    private final BottomNavigationView rootView;

    private FooterBinding(BottomNavigationView rootView, BottomNavigationView navBottom) {
        this.rootView = rootView;
        this.navBottom = navBottom;
    }

    public BottomNavigationView getRoot() {
        return this.rootView;
    }

    public static FooterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FooterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.footer, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static FooterBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        BottomNavigationView navBottom = (BottomNavigationView) rootView;
        return new FooterBinding((BottomNavigationView) rootView, navBottom);
    }
}
