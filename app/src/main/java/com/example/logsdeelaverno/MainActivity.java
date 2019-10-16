package com.example.logsdeelaverno;

import  androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;


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

    public boolean onTouchEvent (MotionEvent event){
        int action = MotionEventCompat.getActionMasked(event);
        switch(action){
            case(MotionEvent.ACTION_DOWN) :
                Log.d("yes", "Action was down");
                return true;
            case(MotionEvent.ACTION_MOVE) :
                Log.d("yes", "Action was Move");
                return true;
            case(MotionEvent.ACTION_UP) :
                Log.d("yes", "Action was Up");
                return true;
            case(MotionEvent.ACTION_CANCEL) :
                Log.d("yes", "Action was Cancel");
                return true;
            case(MotionEvent.ACTION_OUTSIDE) :
                Log.d("yes", "Movement occurred outside bounds \" +\n" +
                        "                    \"of current screen element\"");
                return true;
            default :
                return super.onTouchEvent(event);
        }

    }

}
