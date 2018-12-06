package com.example.reza.aplikasiportalberita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.reza.aplikasiportalberita.network.ApiServices;
import com.example.reza.aplikasiportalberita.network.ApiServices2;
import com.example.reza.aplikasiportalberita.network.ApiServices3;
import com.example.reza.aplikasiportalberita.network.ApiServices4;
import com.example.reza.aplikasiportalberita.network.ApiServices5;
import com.example.reza.aplikasiportalberita.network.ApiServices6;
import com.example.reza.aplikasiportalberita.network.ApiServices7;
import com.example.reza.aplikasiportalberita.network.ApiServices8;
import com.example.reza.aplikasiportalberita.network.ApiServices9;
import com.example.reza.aplikasiportalberita.network.InitRetrofit;
import com.example.reza.aplikasiportalberita.response.BeritaItem;
import com.example.reza.aplikasiportalberita.response.ResponseBerita;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private String KEY_NAME = "NAMA";
    private String nama;
    // Deklarasi Widget
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisialisasi Widget
        recyclerView = (RecyclerView) findViewById(R.id.rvListBerita);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);

        // RecyclerView harus pakai Layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Eksekusi method
        if(nama.equals("archary")) {
        tampilBerita();}
        else if (nama.equals("basket")){
            tampilBerita2();}
        else if (nama.equals("bowling")) {
            tampilBerita3();}
        else if (nama.equals("boxing")) {
            tampilBerita4();}
        else if (nama.equals("football")) {
            tampilBerita5();}
        else if (nama.equals("tenis")) {
            tampilBerita6();}
        else if (nama.equals("tenis_meja")) {
            tampilBerita7();}
        else if (nama.equals("voli")) {
            tampilBerita8();}
        else if (nama.equals("beban")) {
            tampilBerita9();}
        else { }
    }

    private void tampilBerita() {
        ApiServices api = InitRetrofit.getInstance();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita2() {
        ApiServices2 api = InitRetrofit.getInstance2();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita2();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita3() {
        ApiServices3 api = InitRetrofit.getInstance3();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita3();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita4() {
        ApiServices4 api = InitRetrofit.getInstance4();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita4();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita5() {
        ApiServices5 api = InitRetrofit.getInstance5();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita5();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita6() {
        ApiServices6 api = InitRetrofit.getInstance6();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita6();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita7() {
        ApiServices7 api = InitRetrofit.getInstance7();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita7();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita8() {
        ApiServices8 api = InitRetrofit.getInstance8();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita8();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }

    private void tampilBerita9() {
        ApiServices9 api = InitRetrofit.getInstance9();
        // Siapkan request
        Call<ResponseBerita> beritaCall = api.request_show_all_berita9();
        // Kirim request
        beritaCall.enqueue(new Callback<ResponseBerita>() {
            @Override
            public void onResponse(Call<ResponseBerita> call, Response<ResponseBerita> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<BeritaItem> data_berita = response.body().getBerita();
                    boolean status = response.body().isStatus();
                    // Kalau response status nya = true
                    if (status){
                        // Buat Adapter untuk recycler view
                        AdapterBerita adapter = new AdapterBerita(MainActivity.this, data_berita);
                        recyclerView.setAdapter(adapter);
                    } else {
                        // kalau tidak true
                        Toast.makeText(MainActivity.this, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBerita> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }
}