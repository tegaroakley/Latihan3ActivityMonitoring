package com.example.latihan3activitymonitoring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

// Tanggal Pengerjaan : 04 Mei 2021
// Deskripsi Pekerjaan :
// NIM : 10118066
// Nama : Tegar Lucky Oakley
// Kelas : IF-2

public class VerifyCodeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);
    }

    public void actIn(View view) {
        Intent intent = new Intent(this, PersonalFormActivity.class);
        startActivity(intent);
    }
}
