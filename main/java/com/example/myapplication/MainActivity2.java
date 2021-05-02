package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
        Random numeroAleatorio = new Random();
        int jogador;
        int computador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void sair(View view){
        Intent salta = new Intent(this,MainActivity3.class);
        startActivity(salta);}
    public void sai(View view){
        Intent salta = new Intent(this,MainActivity2.class);
        startActivity(salta);}
    public  void pedra (View view){
        jogador=1;
        Resultado();

    }
    public  void papel (View view){
        jogador=2;
        Resultado();

    }
    public  void tesoura (View view){
        jogador=3;
        Resultado();
    }
    public  void Resultado (){
        computador =numeroAleatorio.nextInt(3)+1;
        TextView resultado = findViewById(R.id.textView3);
        if(jogador==computador){
            resultado.setText("Empatou");
        }
        if(jogador== 1 && computador==2){
            resultado.setText("você perdeu!");
        }
        if(jogador== 1 && computador==3){
            resultado.setText("você ganhou!!");
        }
        if(jogador== 2 && computador==3){
            resultado.setText("você perdeu!");
        }
        if(jogador== 2 && computador==1){
            resultado.setText("você ganhou!!");
        }
        if(jogador== 3 && computador==1){
            resultado.setText("você perdeu!");
        }
        if(jogador== 3 && computador==2){
            resultado.setText("você ganhou!!");
        }
        if (computador==1){
            ImageView img =(ImageView)findViewById(R.id.imageView);
            img.setImageResource(R.drawable.pedra);
        }
         else if (computador==2){
            ImageView img =(ImageView)findViewById(R.id.imageView);
            img.setImageResource(R.drawable.papel);
        }
         else if (computador==3){
            ImageView img =(ImageView)findViewById(R.id.imageView);
            img.setImageResource(R.drawable.tesoura);

        }
    }
}