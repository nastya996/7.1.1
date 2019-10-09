package com.example.a711;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MorningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morning_activity);
        Toast.makeText(this, "Доброе утро!", Toast.LENGTH_LONG).show();
    }
}
