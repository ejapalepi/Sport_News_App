package com.example.reza.aplikasiportalberita.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InitRetrofit {
    // URL Server API
    public static String API_URL = "http://192.168.42.196:8080/portal_berita/";

    public static Retrofit setInit() {
        return new Retrofit.Builder().baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getInstance() {
        return setInit().create(ApiServices.class);
    }

    public static ApiServices2 getInstance2() {
        return setInit().create(ApiServices2.class);
    }

    public static ApiServices3 getInstance3() {
        return setInit().create(ApiServices3.class);
    }

    public static ApiServices4 getInstance4() {
        return setInit().create(ApiServices4.class);
    }

    public static ApiServices5 getInstance5() {
        return setInit().create(ApiServices5.class);
    }

    public static ApiServices6 getInstance6() {
        return setInit().create(ApiServices6.class);
    }

    public static ApiServices7 getInstance7() {
        return setInit().create(ApiServices7.class);
    }

    public static ApiServices8 getInstance8() {
        return setInit().create(ApiServices8.class);
    }

    public static ApiServices9 getInstance9() {
        return setInit().create(ApiServices9.class);
    }

}
