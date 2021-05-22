package com.mybaker.bakerhouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cake();
        Cookie();
        //Biscuit();


    }

    private void Cookie() {
        CardView cookie = (CardView) findViewById(R.id.cookie);
        cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cookie.class);
                startActivity(intent);
            }
        });
    }

    private void Cake() {
        CardView cake = (CardView) findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cake.class);
                startActivity(intent);
            }
        });
    }
      /*private void  Biscuit(){
        CardView biscuit = (CardView) findViewById(R.id.biscuit);
        biscuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Biscuit.class);
                startActivity(intent);
            }
        });
        }*/

    }




