package com.example.a711;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
     Button synchronization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        synchronization = findViewById(R.id.btn_synchronization);

    }
    public void synchronization (View view) {
    Intent intent = new Intent(Intent.ACTION_SYNC);

    GregorianCalendar calendar = new GregorianCalendar();
        int time = calendar.get(Calendar.HOUR_OF_DAY);
        if (time >= 6 && time < 14) {
            intent.setData(Uri.parse("http://morning"));
        } else if (time >= 14 && time < 15) {
            intent.setData(Uri.parse("http://afternoon"));
        } else {
            intent.setData(Uri.parse("http://evening"));
        }
        startActivity(intent);
    }
}
