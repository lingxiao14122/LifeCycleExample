package com.example.android.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private final String TAG = "xiao secondary activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.v(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy: ");
    }
}