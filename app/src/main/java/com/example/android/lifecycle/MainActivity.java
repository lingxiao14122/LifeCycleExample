package com.example.android.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "xiao main activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "onCreate: ");

        TextView tv_hello = findViewById(R.id.tv_hello);

        tv_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
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