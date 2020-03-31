package com.example.timerdemo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Sekunden übrig ", String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                Log.i("Wir sind durch", "Der Countdown ist vollendet");
            }
        }.start();

        //Timer 1. Variante
        /*final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey wir sinds", "Eine Sekunde ist vergangen");

                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);
        */

    }
}
