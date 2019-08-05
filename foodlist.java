package com.example.chamod.bookeasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class foodlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
    }
    public void menu(View viwe){
        Intent intent2= new Intent(this,foodmenu.class);
        startActivity(intent2);
    }
}
