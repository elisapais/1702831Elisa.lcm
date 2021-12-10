package com.example.restours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
    }
    public void sendAct3(View view) {
    }

    public void sendActv3(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
    }
}

