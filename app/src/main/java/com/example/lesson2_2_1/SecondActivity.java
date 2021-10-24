package com.example.lesson2_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);


        textView.append("onCreate " + "\n");
    }


    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart " +"\n");


    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("onResume " +"\n");

    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.append("onPause " +"\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.append("onStop " +"\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("onDestroy " +"\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("onRestart " +"\n");
    }
}












