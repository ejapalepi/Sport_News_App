package com.example.reza.aplikasiportalberita;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {
public LinearLayout archary, basket, bowling, boxing, football, tenis, tenis_meja, voli, beban;
    Dialog myDialog;
    private String KEY_NAME = "NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        myDialog = new Dialog(this);
        archary = (LinearLayout) findViewById(R.id.archary);
        basket = (LinearLayout) findViewById(R.id.basket);
        bowling = (LinearLayout) findViewById(R.id.bowling);
        boxing = (LinearLayout) findViewById(R.id.boxing);
        football = (LinearLayout) findViewById(R.id.football);
        tenis = (LinearLayout) findViewById(R.id.tenis);
        tenis_meja = (LinearLayout) findViewById(R.id.tenis_meja);
        voli = (LinearLayout) findViewById(R.id.voli);
        beban = (LinearLayout) findViewById(R.id.beban);

        archary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "archary";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "basket";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        bowling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "bowling";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        boxing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "boxing";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "football";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        tenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "tenis";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        tenis_meja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "tenis_meja";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        voli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "voli";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

        beban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = "beban";
                    if (nama != null && nama != ""){
                        Intent i = new Intent(MainMenu.this, MainActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);

                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                    }

                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
                }

            }
        });

    }
    public void ShowPopup(View v) {
        TextView txtclose;
        //Button fbapp;
        ImageView fbapp, igapp, ytapp;
        myDialog.setContentView(R.layout.activity_about_me);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        fbapp = (ImageView) myDialog.findViewById(R.id.facebook);
        igapp = (ImageView) myDialog.findViewById(R.id.instagram);
        ytapp = (ImageView) myDialog.findViewById(R.id.youtube);
        //btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);

        igapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://instagram.com/_u/ejapalepi");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try
                {
                    Toast.makeText(MainMenu.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e)
                {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/ejapalepi")));
                }
            }
        });

        fbapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                Toast.makeText(MainMenu.this, "Facebook", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://web.facebook.com/reza.pahllevi"));
                startActivity(intent);
            }
        });

        ytapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                Toast.makeText(MainMenu.this, "Youtube", Toast.LENGTH_SHORT).show();
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCcVFQ_Ua_CBuWSS5CGRIvqQ?view_as=subscriber"));
                startActivity(intent);
            }
        });

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

       /* btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainMenu.this, "You're Followed Me", Toast.LENGTH_SHORT).show();
            }
        }); */
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
