package com.example.reza.aplikasiportalberita.network;

import com.example.reza.aplikasiportalberita.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServices4 {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita4.php")

    Call<ResponseBerita> request_show_all_berita4();
    // <ModelData> nama_method()

}