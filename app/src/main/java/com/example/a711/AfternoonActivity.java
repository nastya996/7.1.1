package com.example.a711;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AfternoonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afternoon_activity);
        Toast.makeText(this, "Добрый день!", Toast.LENGTH_LONG).show();
    }
}
