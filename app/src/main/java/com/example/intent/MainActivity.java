package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "..." ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void buka(View view) {
        String url = "..." ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
    public void tentang(View view) {
        Intent tentang = new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }
    public void clear(View view) {
        Intent clear = new Intent(MainActivity.this, Clear.class);
        startActivity(clear);
    }
    public void bio(View view) {
        Intent bio = new Intent(MainActivity.this, Biodata.class);
        startActivity(bio);
    }
    public void kalkulator(View view) {
        Intent kalkulator = new Intent(MainActivity.this, Kalkulator.class);
        startActivity(kalkulator);
    }
}
