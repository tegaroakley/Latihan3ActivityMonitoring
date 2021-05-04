package com.example.latihan3activitymonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Tanggal Pengerjaan : 04 Mei 2021
// Deskripsi Pekerjaan :
// NIM : 10118066
// Nama : Tegar Lucky Oakley
// Kelas : IF-2

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actStart(View view) {
        Intent intent = new Intent(this, com.example.latihan3activitymonitoring.VerifyCodeActivity.class);
        startActivity(intent);
    }
}