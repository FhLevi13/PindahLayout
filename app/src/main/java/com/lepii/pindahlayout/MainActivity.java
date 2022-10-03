package com.lepii.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    TextView tvSelamatDatang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSelamatDatang = findViewById(R.id.tv_selamat_datang);
        btnPindah = findViewById(R.id.btn_pindah);

        btnPindah.setOnClickListener(view -> {
            Intent pindah = new Intent(MainActivity.this, Second.class);
            startActivity(pindah);
        });
    }
}