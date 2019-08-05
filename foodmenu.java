package com.example.chamod.bookeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class foodmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodmenu);
    }
    public void buger1(View viwe){
        Intent intent2= new Intent(this,burger.class);
        startActivity(intent2);
    }
}
