package com.mybaker.bakerhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class Cookie extends AppCompatActivity {

TextView tv1,tv2,tv3;
Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

        tv1=findViewById(R.id.tv1);
        button1=findViewById(R.id.sp1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
            }
        });

        tv2=findViewById(R.id.tv2);
        button2=findViewById(R.id.sp2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setVisibility(View.VISIBLE);
                tv1.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
            }
        });

        tv3=findViewById(R.id.tv3);
        button3=findViewById(R.id.sp3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.GONE);
                tv1.setVisibility(View.GONE);
            }
        });
    }


}
