package com.example.daggerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerapplication.model.Motor;

public class MainActivity extends AppCompatActivity {

    Motor motor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateDaggerCode();
    }

    private void generateDaggerCode() {
    }
}