package com.dk.pedra_papel_tesoura;

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
        setContentView(R.layout.activity_main);
    }
        public void selecionadoPedra(View view){
            this.opcaoSelecionada("Pedra");        }

        public void selecionadoPapel(View view){
            this.opcaoSelecionada("Papel");
        }

        public void selecionadoTesoura(View view){
            this.opcaoSelecionada("Tesoura");
        }


        public void opcaoSelecionada(String opcaoUsuario){

            ImageView resultadoApp = findViewById(R.id.resultadoApp);
            TextView textoResultado = findViewById(R.id.resuldado);

            int numero = new Random().nextInt(3);
            String [] opcoes = {"Pedra", "Papel", "Tesoura"};
            String opcaoApp = opcoes[numero];
            switch (opcaoApp){
                case "Pedra":
                    resultadoApp.setImageResource(R.drawable.pedra);
                    break;
                case "Papel":
                    resultadoApp.setImageResource(R.drawable.papel);
                    break;
                case "Tesoura":
                    resultadoApp.setImageResource(R.drawable.tesoura);
                    break;
            }
            //App Ganha
            if(
                    (opcaoApp == "Tesoura" &&  opcaoUsuario == "Papel") ||
                    (opcaoApp == "Papel" && opcaoUsuario == "Pedra") ||
                    (opcaoApp == "Pedra" && opcaoUsuario == "Tesoura")

            ){textoResultado.setText("O App ganhou!!! :(");
            //Usuario Ganha
            }else if(
                    (opcaoApp == "Tesoura" &&  opcaoUsuario == "Pedra") ||
                    (opcaoApp == "Papel" && opcaoUsuario == "Tesoura") ||
                    (opcaoApp == "Pedra" && opcaoUsuario == "Papel")
            ){textoResultado.setText("Voce  ganhou!!! :)");
            //Empate
            }else{
                textoResultado.setText("Empate!!! ;)");
            }
        }


}