package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnC,btnM,btnD,btnS,btnR,btnP,btnI,btnB,btnUno,btnDos,btnCero,btnTres,btnCuatro,btnCinco,btnSeis,
    btnSiete,btnOcho,btnNueve;
    TextView respuesta;
    Double resul;
    String operacion, show, guarda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = (Button) findViewById(R.id.botonCleaner);
        btnM = (Button) findViewById(R.id.botonMulti);
        btnD = (Button) findViewById(R.id.botonDividir);
        btnS = (Button) findViewById(R.id.botonSuma);
        btnR = (Button) findViewById(R.id.botonMenos);
        btnP = (Button) findViewById(R.id.botonPunto);
        btnI = (Button) findViewById(R.id.botonIgual);
        btnB = (Button) findViewById(R.id.botonBorrar);
        btnCero = (Button) findViewById(R.id.botonCero);
        btnUno = (Button) findViewById(R.id.botonUno);
        btnDos = (Button) findViewById(R.id.botonDos);
        btnTres = (Button) findViewById(R.id.botonTres);
        btnCuatro = (Button) findViewById(R.id.botonCuatro);
        btnCinco = (Button) findViewById(R.id.botonCinco);
        btnSeis = (Button) findViewById(R.id.botonSeis);
        btnSiete = (Button) findViewById(R.id.botonSiete);
        btnOcho = (Button) findViewById(R.id.botonOcho);
        btnNueve = (Button) findViewById(R.id.botonNueve);
        respuesta = (TextView)findViewById(R.id.resul);


        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = "";
                respuesta.setText(show);
                guarda = "";
                operacion = "";
            }
        });


        btnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show.substring(0,show.length()-1);
                respuesta.setText(show);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + ".";
                respuesta.setText(show);
            }
        });


        btnCero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
               show = show + "0";
                respuesta.setText(show);
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "1";
                respuesta.setText(show);
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "2";
                respuesta.setText(show);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "3";
                respuesta.setText(show);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "4";
                respuesta.setText(show);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "5";
                respuesta.setText(show);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "6";
                respuesta.setText(show);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "7";
                respuesta.setText(show);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "8";
                respuesta.setText(show);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                show = respuesta.getText().toString();
                show = show + "9";
                respuesta.setText(show);
            }
        });


        btnD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                guarda = respuesta.getText().toString();
                operacion = "/";
                respuesta.setText("");
            }
        });

        btnM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                guarda = respuesta.getText().toString();
                operacion = "*";
                respuesta.setText("");
            }
        });

        btnR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                guarda = respuesta.getText().toString();
                operacion = "-";
                respuesta.setText("");
            }
        });

        btnS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                guarda = respuesta.getText().toString();
                operacion = "+";
                respuesta.setText("");
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show = respuesta.getText().toString();
                show = show + "1";

                switch (operacion){
                    case "+" :
                        resul = Double.parseDouble(guarda) + Double.parseDouble(respuesta.getText().toString());
                        respuesta.setText(String.valueOf(resul));
                        break;


                }
            }
        });

    }
}