package com.example.david.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    StringBuffer txtDisplayString = new StringBuffer("");
    float resultado;
    int operacion;
    boolean sePuedePulsarIgual = false;
    boolean esPrimerOperador = true;
    boolean limpiar = false;
    TextView txtDisplay;

    Button boton0;
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;
    Button botonPunto;
    Button botonSuma;
    Button botonResta;
    Button botonMultiplicacion;
    Button botonDivision;
    Button botonIgual;
    Button botonBorrar;
    Button botonLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtDisplay = (TextView) findViewById(R.id.display);
        boton0 = (Button) findViewById(R.id.btn0);
        boton1 = (Button) findViewById(R.id.btn1);
        boton2 = (Button) findViewById(R.id.btn2);
        boton3 = (Button) findViewById(R.id.btn3);
        boton4 = (Button) findViewById(R.id.btn4);
        boton5 = (Button) findViewById(R.id.btn5);
        boton6 = (Button) findViewById(R.id.btn6);
        boton7 = (Button) findViewById(R.id.btn7);
        boton8 = (Button) findViewById(R.id.btn8);
        boton9 = (Button) findViewById(R.id.btn9);
        botonSuma = (Button) findViewById(R.id.btnSumar);
        botonResta = (Button) findViewById(R.id.btnRestar);
        botonMultiplicacion = (Button) findViewById(R.id.btnMultiplicar);
        botonDivision = (Button) findViewById(R.id.btnDividir);
        botonPunto = (Button) findViewById(R.id.btnPunto);
        botonIgual = (Button) findViewById(R.id.btnIgual);
        botonBorrar = (Button) findViewById(R.id.btnBorrar);
        botonLimpiar = (Button) findViewById(R.id.btnLimpiar);



        // ------------------- 0 ---------------------------
        boton0.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if(!txtDisplayString.toString().isEmpty())
                {
                    txtDisplayString.append("0");
                    txtDisplay.setText(txtDisplayString);
                }
            }
        });

        // ------------------- 1 ---------------------------
        boton1.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("1");
                txtDisplay.setText(txtDisplayString);
            }
        });

        // ------------------- 2 ---------------------------
        boton2.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("2");
                txtDisplay.setText(txtDisplayString);
            }
        });


        // ------------------- 3 ---------------------------
        boton3.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("3");
                txtDisplay.setText(txtDisplayString);
            }
        });


        // ------------------- 4 ---------------------------
        boton4.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("4");
                txtDisplay.setText(txtDisplayString);
            }
        });


        // ------------------- 5 ---------------------------
        boton5.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("5");
                txtDisplay.setText(txtDisplayString);
            }
        });


        // ------------------- 6 ---------------------------
        boton6.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("6");
                txtDisplay.setText(txtDisplayString);
            }
        });


        // ------------------- 7 ---------------------------
        boton7.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("7");
                txtDisplay.setText(txtDisplayString);
            }
        });



        // ------------------- 8 ---------------------------
        boton8.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("8");
                txtDisplay.setText(txtDisplayString);
            }
        });



        // ------------------- 9 ---------------------------
        boton9.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                txtDisplayString.append("9");
                txtDisplay.setText(txtDisplayString);
            }
        });


        // ------------------- . ---------------------------
        botonPunto.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if(!txtDisplayString.toString().contains(".")) {
                    txtDisplayString.append(".");
                    txtDisplay.setText(txtDisplayString);
                }
            }
        });

        // ------------------- Borrar ---------------------------
        botonBorrar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if(txtDisplayString.length() > 0) {
                    txtDisplayString = txtDisplayString.deleteCharAt(txtDisplayString.length() - 1);
                    System.out.println(txtDisplayString);
                    txtDisplay.setText(txtDisplayString);

                }
                else
                {
                    txtDisplay.setHint("Calculadora ACME");
                }
            }
        });


        // ------------------- Limpiar ---------------------------
        botonLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                resultado = 0.0f;
                txtDisplayString = new StringBuffer("");
                txtDisplay.setText("");
                txtDisplay.setHint("Calculadora ACME");
                operacion = 0;
                sePuedePulsarIgual = true;
                limpiar = false;
            }
        });

        // ------------------- suma ---------------------------
        botonSuma.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if(txtDisplayString.length() > 0)
                    resultado += Float.valueOf(txtDisplayString.toString());

                txtDisplayString = new StringBuffer("");
                txtDisplay.setText("");
                txtDisplay.setHint(String.valueOf(resultado));
                operacion = 1;
                sePuedePulsarIgual = true;
            }
        });


        // ------------------- resta ---------------------------
        botonResta.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if(txtDisplayString.length() > 0)
                    resultado -= Float.valueOf(txtDisplayString.toString());

                txtDisplayString = new StringBuffer("");
                txtDisplay.setText("");
                txtDisplay.setHint(String.valueOf(resultado));
                operacion = 2;
                sePuedePulsarIgual = true;
            }
        });

        // ------------------- multiplicacion ---------------------------
        botonMultiplicacion.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if(esPrimerOperador && !limpiar)
                {
                    resultado = 1;
                    esPrimerOperador = false;
                }

                if(txtDisplayString.length() > 0)
                    resultado *= Float.valueOf(txtDisplayString.toString());

                txtDisplayString = new StringBuffer("");
                txtDisplay.setText("");
                txtDisplay.setHint(String.valueOf(resultado));
                operacion = 3;
                sePuedePulsarIgual = true;
                esPrimerOperador = false;
                limpiar = true;
            }
        });

        // ------------------- division ---------------------------
        botonDivision.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                if(esPrimerOperador)
                {
                    resultado = Float.valueOf(txtDisplay.getText().toString());
                }

                if(txtDisplayString.length() > 0 && !esPrimerOperador)
                    resultado /= Float.valueOf(txtDisplayString.toString());

                txtDisplayString = new StringBuffer("");
                txtDisplay.setText("");
                txtDisplay.setHint(String.valueOf(resultado));
                operacion = 4;
                sePuedePulsarIgual = true;
                esPrimerOperador = false;
            }
        });

        // ------------------- resultado ---------------------------
        botonIgual.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            {
                switch(operacion)
                {
                    case 1:
                        if(!txtDisplay.getText().toString().isEmpty() && sePuedePulsarIgual)
                            resultado += Float.valueOf(txtDisplayString.toString());
                        txtDisplay.setText(String.valueOf(resultado));
                        sePuedePulsarIgual = false;
                        txtDisplayString = new StringBuffer("");
                        break;

                    case 2:
                        if(!txtDisplay.getText().toString().isEmpty() && sePuedePulsarIgual)
                            resultado -= Float.valueOf(txtDisplayString.toString());
                        txtDisplay.setText(String.valueOf(resultado));
                        sePuedePulsarIgual = false;
                        txtDisplayString = new StringBuffer("");
                        break;

                    case 3:
                        if(!txtDisplay.getText().toString().isEmpty() && sePuedePulsarIgual)
                            resultado *= Float.valueOf(txtDisplayString.toString());
                        txtDisplay.setText(String.valueOf(resultado));
                        sePuedePulsarIgual = false;
                        txtDisplayString = new StringBuffer("");
                        esPrimerOperador = true;
                        break;

                    case 4:
                        if(!txtDisplay.getText().toString().isEmpty() && sePuedePulsarIgual)
                            resultado /= Float.valueOf(txtDisplayString.toString());
                        txtDisplay.setText(String.valueOf(resultado));
                        sePuedePulsarIgual = false;
                        txtDisplayString = new StringBuffer("");
                        esPrimerOperador = true;
                        break;
                }
            }
        });




    }


}
