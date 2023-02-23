package com.deepa.quickchange;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    RadioGroup radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radiogroup = findViewById(R.id.radio);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                switch (checked){
                    case R.id.btnBlue:
                        layout.setBackgroundColor(Color.parseColor("#3944F7"));
                        break;

                    case R.id.btnYellow:
                        layout.setBackgroundColor(Color.parseColor("#D9D55B"));
                        break;
                    case R.id.btnRed:
                        layout.setBackgroundColor(Color.parseColor("#BF3325"));
                        break;
                }
            }
        });
    }
}