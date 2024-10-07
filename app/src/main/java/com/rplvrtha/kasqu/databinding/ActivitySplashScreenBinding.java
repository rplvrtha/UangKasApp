package com.rplvrtha.kasqu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import com.rplvrtha.kasqu.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public final class ActivitySplashScreenBinding implements ViewBinding {
    private final RelativeLayout rootView;

    private ActivitySplashScreenBinding(RelativeLayout rootView) {
        this.rootView = rootView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySplashScreenBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivitySplashScreenBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_splash_screen, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivitySplashScreenBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        return new ActivitySplashScreenBinding((RelativeLayout) rootView);
    }
}
