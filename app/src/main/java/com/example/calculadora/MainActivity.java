package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private Button btn_borrar;
    private Button btn_dividir;
    private Button btn_siete;
    private Button btn_ocho;
    private Button btn_multiplicar;
    private Button btn_cuatro;
    private Button btn_cinco;
    private Button btn_seis;
    private Button btn_menos;
    private Button btn_uno;
    private Button btn_dos;
    private Button btn_tres;
    private Button btn_cero;
    private Button btn_punto;
    private Button btn_igual;
    private Button btn_nueve;
    private Button btn_suma;

    private TextView result;
    private double n1 = 0.0;
    private double n2 = 0.0;
    String opera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result = findViewById(R.id.result);
        btn_borrar = findViewById(R.id.btn_borrar);
        btn_borrar.setOnClickListener((v) -> {result.setText("");} );
        btn_cero = findViewById(R.id.btn_cero);
        btn_cero.setOnClickListener((v) -> {result.setText(result.getText()+"0");});


        btn_cero = findViewById(R.id.btn_cero);
        btn_cero.setOnClickListener((v) ->{result.setText(result.getText()+"0");} );

        btn_uno = findViewById(R.id.btn_uno);
        btn_uno.setOnClickListener((v) ->{result.setText(result.getText()+"1"); } );


        btn_dos = findViewById(R.id.btn_dos);
        btn_dos.setOnClickListener((v) ->{result.setText(result.getText()+"2"); } );

        btn_tres = findViewById(R.id.btn_tres);
        btn_tres.setOnClickListener((v) ->{result.setText(result.getText()+"3"); } );

        btn_cuatro = findViewById(R.id.btn_cuatro);
        btn_cuatro.setOnClickListener((v) ->{result.setText(result.getText()+"4"); } );

        btn_cinco = findViewById(R.id.btn_cinco);
        btn_cinco.setOnClickListener((v) ->{result.setText(result.getText()+"5"); } );

        btn_seis = findViewById(R.id.btn_seis);
        btn_seis.setOnClickListener((v) ->{result.setText(result.getText()+"6"); } );

        btn_siete = findViewById(R.id.btn_siete);
        btn_siete.setOnClickListener((v) ->{result.setText(result.getText()+"7"); } );

        btn_ocho = findViewById(R.id.btn_ocho);
        btn_ocho.setOnClickListener((v) ->{result.setText(result.getText()+"8"); } );

        btn_nueve = findViewById(R.id.btn_nueve);
        btn_nueve.setOnClickListener((v) ->{result.setText(result.getText()+"9"); } );

        btn_punto = findViewById(R.id.btn_punto);
        btn_punto.setOnClickListener((v) ->{result.setText(result.getText()+"."); } );

        btn_suma = findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener((v) ->
        { opera = "+"; n1 = Integer.parseInt(result.getText().toString());result.setText("");} );

        btn_menos = findViewById(R.id.btn_menos);
        btn_menos.setOnClickListener((v) ->
        { opera = "-"; n1 = Integer.parseInt(result.getText().toString());result.setText("");} );



        btn_dividir = findViewById(R.id.btn_dividir);
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opera = "/";
                n1 = Integer.parseInt(result.getText().toString());
                result.setText("");
            }
        });

        btn_multiplicar = findViewById(R.id.btn_multiplicar);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opera = "*";
                n1 = Integer.parseInt(result.getText().toString());
                result.setText("");
            }
        });

        btn_punto = findViewById(R.id.btn_punto);
        btn_punto.setOnClickListener((v) -> { result.setText(result.getText()+".");});


        btn_igual = findViewById(R.id.btn_igual);
        btn_igual.setOnClickListener((v) -> {n2 = Integer.parseInt(result.getText().toString());


        double op1;

        if (opera == "+"){

            op1 = Suma((n1),(n2));
            result.setText(op1+"");

        }
        else if (opera == "-"){

            op1 = Resta((n1),(n2));
            result.setText(op1+"");

        }

        else if ( opera == "/"){

            op1 = Division((n1),(n2));
            result.setText(op1+"");
        }

        else if ( opera == "*"){

            op1 = Multiplicacion((n1),(n2));
            result.setText(op1+"");
        }



        } );


    }

    public double Suma (double n1, double n2){


        Double e;
        e = n1+n2;
        return e;

    }


    public double Resta (double n1, double n2){


        Double e;
        e = n1-n2;
        return e;

    }

    public double Multiplicacion (double n1, double n2){


        Double e;
        e = n1*n2;
        return e;

    }

    public double Division (double n1, double n2){


        Double e;
        e = n1/n2;
        return e;

    }


    }


