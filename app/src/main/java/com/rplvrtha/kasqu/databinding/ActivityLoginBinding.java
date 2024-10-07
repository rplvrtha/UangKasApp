package com.rplvrtha.kasqu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rplvrtha.kasqu.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public final class ActivityLoginBinding implements ViewBinding {
    public final View ellipse1;
    public final View ellipse2;
    public final View ellipse3;
    public final View ellipse4;
    public final View ellipse5;
    public final TextView indukText;
    public final RelativeLayout loading;
    public final Button loginBtn;
    public final TextView loginText;
    public final EditText nis;
    public final EditText password;
    public final TextView passwordText;
    public final ProgressBar progress;
    private final RelativeLayout rootView;
    public final CheckBox showPass;

    private ActivityLoginBinding(RelativeLayout rootView, View ellipse1, View ellipse2, View ellipse3, View ellipse4, View ellipse5, TextView indukText, RelativeLayout loading, Button loginBtn, TextView loginText, EditText nis, EditText password, TextView passwordText, ProgressBar progress, CheckBox showPass) {
        this.rootView = rootView;
        this.ellipse1 = ellipse1;
        this.ellipse2 = ellipse2;
        this.ellipse3 = ellipse3;
        this.ellipse4 = ellipse4;
        this.ellipse5 = ellipse5;
        this.indukText = indukText;
        this.loading = loading;
        this.loginBtn = loginBtn;
        this.loginText = loginText;
        this.nis = nis;
        this.password = password;
        this.passwordText = passwordText;
        this.progress = progress;
        this.showPass = showPass;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.activity_login, parent, false);
        if (attachToParent) {
            parent.addView(root);
        }
        return bind(root);
    }

    public static ActivityLoginBinding bind(View rootView) {
        View ellipse2;
        View ellipse3;
        View ellipse4;
        View ellipse5;
        int id = R.id.ellipse_1;
        View ellipse1 = ViewBindings.findChildViewById(rootView, id);
        if (ellipse1 != null && (ellipse2 = ViewBindings.findChildViewById(rootView, (id = R.id.ellipse_2))) != null && (ellipse3 = ViewBindings.findChildViewById(rootView, (id = R.id.ellipse_3))) != null && (ellipse4 = ViewBindings.findChildViewById(rootView, (id = R.id.ellipse_4))) != null && (ellipse5 = ViewBindings.findChildViewById(rootView, (id = R.id.ellipse_5))) != null) {
            id = R.id.indukText;
            TextView indukText = (TextView) ViewBindings.findChildViewById(rootView, id);
            if (indukText != null) {
                id = R.id.loading;
                RelativeLayout loading = (RelativeLayout) ViewBindings.findChildViewById(rootView, id);
                if (loading != null) {
                    id = R.id.loginBtn;
                    Button loginBtn = (Button) ViewBindings.findChildViewById(rootView, id);
                    if (loginBtn != null) {
                        id = R.id.loginText;
                        TextView loginText = (TextView) ViewBindings.findChildViewById(rootView, id);
                        if (loginText != null) {
                            id = R.id.nis;
                            EditText nis = (EditText) ViewBindings.findChildViewById(rootView, id);
                            if (nis != null) {
                                id = R.id.password;
                                EditText password = (EditText) ViewBindings.findChildViewById(rootView, id);
                                if (password != null) {
                                    id = R.id.passwordText;
                                    TextView passwordText = (TextView) ViewBindings.findChildViewById(rootView, id);
                                    if (passwordText != null) {
                                        id = R.id.progress;
                                        ProgressBar progress = (ProgressBar) ViewBindings.findChildViewById(rootView, id);
                                        if (progress != null) {
                                            id = R.id.show_pass;
                                            CheckBox showPass = (CheckBox) ViewBindings.findChildViewById(rootView, id);
                                            if (showPass != null) {
                                                return new ActivityLoginBinding((RelativeLayout) rootView, ellipse1, ellipse2, ellipse3, ellipse4, ellipse5, indukText, loading, loginBtn, loginText, nis, password, passwordText, progress, showPass);
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
