package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.yellow));
            }
        });

    }
}