package com.example.comp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public class splash extends AppCompatActivity {
        TextView t;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            t = (TextView) findViewById(R.id.my);
            Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Young Vigor.ttf");
            t.setTypeface(myCustomFont);
            Thread obj = new Thread() {
                @Override
                //run is a entry point for a thread
                public void run() {
                    try {
                        sleep(3000);//suspend a thread for period of time

                    } catch (Exception t) {
                        Toast.makeText(splash.this, "Error " + t, Toast.LENGTH_LONG).show();

                    } finally {
                        // d.dismiss();
                        Intent i = new Intent(splash.this, login.class);
                        startActivity(i);
                        finish();
                    }
                }
            };
            obj.start();// its start a thread by calling its run() method
        }
    }
}
