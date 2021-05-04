package com.example.latihan3activitymonitoring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// Tanggal Pengerjaan : 04 Mei 2021
// Deskripsi Pekerjaan :
// NIM : 10118066
// Nama : Tegar Lucky Oakley
// Kelas : IF-2

public class PersonalFormActivity extends AppCompatActivity {

    public static final String INPUT_NICKNAME = "com.example.latihan3activitymonitoring.INPUT_NICKNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_form);
    }

    public void actNext(View view) {
        EditText nickName = (EditText) findViewById(R.id.fieldNickName);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, com.example.latihan3activitymonitoring.FinishActivity.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);
    }
}
