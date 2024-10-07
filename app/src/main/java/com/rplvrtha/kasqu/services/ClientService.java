package com.rplvrtha.kasqu.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class ClientService {
    private static final String BASE_URL = "http://192.168.48.88:8080/";
    private static Retrofit retrofit;

    public static Retrofit getService() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
