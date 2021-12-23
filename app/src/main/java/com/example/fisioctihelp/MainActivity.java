package com.example.fisioctihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonAjusFreqResp, buttonAjusFIO2, tmpbuttonAjusFreqResp, tmpbuttonAjusFIO2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tmpbuttonAjusFreqResp = findViewById(R.id.buttonAjusFreqResp);
        tmpbuttonAjusFreqResp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityAjusFreqResp.class);
                startActivity(intent);
            }
        });

        buttonAjusFIO2 = findViewById(R.id.buttonAjusFIO2);
        buttonAjusFIO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivityAjusFreqResp.class);
                startActivity(intent);
            }
        });
    }
}