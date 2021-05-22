package com.mybaker.bakerhouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Cake extends AppCompatActivity {
Button btn,btn2,btn3,btn4,btn5,btn6;
TextView textView,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);

        ImageView cakep=(ImageView)findViewById(R.id.cakep);
        textView=findViewById(R.id.tv1);
        btn=findViewById(R.id.sp1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
            }
        });

   tv2=findViewById(R.id.tv2);
    btn2=findViewById(R.id.sp2);
    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tv2.setVisibility(View.VISIBLE);
            textView.setVisibility(View.GONE);
            tv3.setVisibility(View.GONE);

        }
    });

    tv3=findViewById(R.id.tv3);
    btn3=findViewById(R.id.sp3);
    btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tv3.setVisibility(View.VISIBLE);
            tv2.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);
            tv4.setVisibility(View.GONE);
            tv5.setVisibility(View.GONE);
            tv6.setVisibility(View.GONE);
        }
    });

        tv4=findViewById(R.id.tv4);
        btn4=findViewById(R.id.sp4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv4.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                tv2.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
            }
        });

        tv5=findViewById(R.id.tv5);
        btn5=findViewById(R.id.sp5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv5.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                tv2.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
            }
        });

        tv6=findViewById(R.id.tv6);
        btn6=findViewById(R.id.sp6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv6.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.GONE);
                tv4.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                tv2.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
            }
        });


    }



}
