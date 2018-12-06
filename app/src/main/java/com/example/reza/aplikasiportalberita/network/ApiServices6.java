package com.example.reza.aplikasiportalberita.network;

import com.example.reza.aplikasiportalberita.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServices6 {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita6.php")

    Call<ResponseBerita> request_show_all_berita6();
    // <ModelData> nama_method()

}