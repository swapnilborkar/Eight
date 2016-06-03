package com.swapnilborkar.demo.eight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = getClass().getSimpleName();
    private final Random randomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Random random = new Random();
        TextView result = (TextView) findViewById(R.id.textView2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(view ->
                Toast.makeText(this, "Check Verbose Log Messages", Toast.LENGTH_SHORT).show());
        Log.d(LOG_TAG, "Button clicked!");

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Toast.makeText(this, "Check Verbose Log Messages", Toast.LENGTH_SHORT).show();
            Runnable runnable = () -> Log.d(LOG_TAG, "Log from a Runnable with a Lambda");
            runnable.run();
        });


        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(view -> {

            Calculator c = (a, b) -> a + b;
            int R1 = random.nextInt(10000);
            int R2 = random.nextInt(10000);
            result.setText(String.valueOf(c.calculate(R1, R2)));
        });


    }

    @FunctionalInterface
    private interface Calculator {
        int calculate(int a, int b);

    }

}
