package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void jogar(View view){
        Intent salta = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(salta);
    }
    public void sair(View view){
        Intent salta = new Intent(this,MainActivity3.class);
        startActivity(salta);}
}