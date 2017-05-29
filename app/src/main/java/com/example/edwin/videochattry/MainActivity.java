package com.example.edwin.videochattry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startBroadCast(View view) {
        Intent intent = new Intent(this, BroadCast.class);
        startActivity(intent);
    }

    public void startReceiver(View view) {
        Intent intent = new Intent(this, Receiver.class);
        startActivity(intent);
    }
}