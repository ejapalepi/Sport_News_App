package com.example.reza.aplikasiportalberita.network;

import com.example.reza.aplikasiportalberita.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServices7 {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita7.php")

    Call<ResponseBerita> request_show_all_berita7();
    // <ModelData> nama_method()

}