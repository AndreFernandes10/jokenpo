package com.example.joquemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

        public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }
         public void selecionadoPaper(View view){
        this.opcaoSelecionada("papel");
    }
        public void selecionadoTesou(View view){
        this.opcaoSelecionada("tesoura");
    }


      public void opcaoSelecionada( String opcaoSelecionada){

          ImageView imageResult = findViewById(R.id.imagemResult);
          TextView textoMudado = findViewById(R.id.textoMudado);
          
        System.out.println(opcaoSelecionada);
        int numero = new Random().nextInt(3);//0,1,2
          String[] opçoes = {"pedra", "papel", "tesoura"};
            String opçoesApp = opçoes[numero];
          switch ( opçoesApp ){
              case "pedra":
                  imageResult.setImageResource(R.drawable.pedra);

                  break;
              case "papel":
                  imageResult.setImageResource(R.drawable.papel);

                  break;
                  case "tesoura":
                  imageResult.setImageResource(R.drawable.tesoura);

                  break;
          }
           if(
                   (opçoesApp == "tesoura" && opcaoSelecionada =="papel") ||
                           (opçoesApp == "papel" && opcaoSelecionada =="pedra" ) ||
                           (opçoesApp == "pedra" && opcaoSelecionada =="tesoura") ){
               textoMudado.setText("Você é perdeu :( ");


           } else if(
                   (opcaoSelecionada== "tesoura" && opçoesApp =="papel") ||
                           (opcaoSelecionada == "papel" && opçoesApp =="pedra" ) ||
                           (opcaoSelecionada == "pedra" && opçoesApp =="tesoura") ){
               textoMudado.setText("PARABÉNS você ganhou :)  ");

           } else{
               textoMudado.setText("Empatou  ");

           }

          System.out.println("item selecionado: " + opçoesApp);



    }
}