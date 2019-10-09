package com.example.a711;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EveningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evening_activity);
        Toast.makeText(this, "Добрый вечер!", Toast.LENGTH_LONG).show();
    }
}
