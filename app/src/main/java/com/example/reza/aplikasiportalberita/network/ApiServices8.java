package com.example.reza.aplikasiportalberita.network;

import com.example.reza.aplikasiportalberita.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServices8 {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita8.php")

    Call<ResponseBerita> request_show_all_berita8();
    // <ModelData> nama_method()

}