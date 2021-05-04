package com.example.latihan3activitymonitoring;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Tanggal Pengerjaan : 04 Mei 2021
// Deskripsi Pekerjaan :
// NIM : 10118066
// Nama : Tegar Lucky Oakley
// Kelas : IF-2

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        String nickName = getIntent().getStringExtra(PersonalFormActivity.INPUT_NICKNAME);

        String text = getString(R.string.finish_text_message).toString();
        TextView finishTextMessage = (TextView)findViewById(R.id.finishTextMessage);

        finishTextMessage.setText(String.format(text, nickName).toString());
    }

    public void actFinish(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }

}
