package com.lepii.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("Welcome");

        tvNama = findViewById(R.id.tv_nama);

        Intent terima = getIntent();
        String terimaNama = terima.getStringExtra("inputNama");

        tvNama.setText(terimaNama);
    }
}