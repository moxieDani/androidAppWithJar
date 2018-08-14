package com.nexstreaming.app.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nexstreaming.app.example.helloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld test = new helloWorld();
        test.showMyToast(this);
    }
}
