package com.example.uas_akb_10118457_fixxxxxxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    //Tanggal   : 10 Agustus 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, PagerActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}