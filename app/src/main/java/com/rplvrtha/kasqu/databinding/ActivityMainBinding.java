package com.rplvrtha.kasqu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rplvrtha.kasqu.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public final class ActivityMainBinding implements ViewBinding {
    public final View ellipse1;
    public final FooterBinding footer;
    public final LinearLayout header;
    public final FrameLayout mainContent;
    private final ConstraintLayout rootView;
    public final TextView user;
    public final View vector;
    public final TextView welcome;

    private ActivityMainBinding(ConstraintLayout rootView, View ellipse1, FooterBinding footer, LinearLayout header, FrameLayout mainContent, TextView user, View vector, TextView welcome) {
        this.rootView = rootView;
        this.ellipse1 = ellipse1;
        this.footer = footer;
        this.header = header;
        this.mainContent = mainContent;
        this.user = user;
        this.vector = vector;
        this.welcome = welcome;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityMainBinding bind(View rootView) {
        View footer;
        View vector;
        int id = R.id.ellipse_1;
        View ellipse1 = ViewBindings.findChildViewById(rootView, id);
        if (ellipse1 != null && (footer = ViewBindings.findChildViewById(rootView, (id = R.id.footer))) != null) {
            FooterBinding binding_footer = FooterBinding.bind(footer);
            id = R.id.header;
            LinearLayout header = (LinearLayout) ViewBindings.findChildViewById(rootView, id);
            if (header != null) {
                id = R.id.mainContent;
                FrameLayout mainContent = (FrameLayout) ViewBindings.findChildViewById(rootView, id);
                if (mainContent != null) {
                    id = R.id.user;
                    TextView user = (TextView) ViewBindings.findChildViewById(rootView, id);
                    if (user != null && (vector = ViewBindings.findChildViewById(rootView, (id = R.id.vector))) != null) {
                        id = R.id.welcome;
                        TextView welcome = (TextView) ViewBindings.findChildViewById(rootView, id);
                        if (welcome != null) {
                            return new ActivityMainBinding((ConstraintLayout) rootView, ellipse1, binding_footer, header, mainContent, user, vector, welcome);
                        }
                    }
                }
            }
        }
        String missingId = rootView.getResources().getResourceName(id);
        throw new NullPointerException("Missing required view with ID: ".concat(missingId));
    }
}
