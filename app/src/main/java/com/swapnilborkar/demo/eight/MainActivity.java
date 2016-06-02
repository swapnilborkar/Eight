package com.swapnilborkar.demo.eight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = getClass().getSimpleName();
    private final Random randomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(view -> Log.d(LOG_TAG, "Button clicked!"));

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Runnable runnable = () -> Log.d(LOG_TAG, "Log from a Runnable with a Lambda");
            runnable.run();
        });

    }

}
