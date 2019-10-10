package com.example.logsdeelaverno;

import  androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("yes", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yes", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yes", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yes", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("yes", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("yes", "onPause");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("yes", "-------");
        Log.d("yes", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
