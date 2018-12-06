package com.example.reza.aplikasiportalberita.network;

import com.example.reza.aplikasiportalberita.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServices9 {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita9.php")

    Call<ResponseBerita> request_show_all_berita9();
    // <ModelData> nama_method()

}