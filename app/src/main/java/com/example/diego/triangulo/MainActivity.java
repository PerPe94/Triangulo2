package com.example.diego.triangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Triangulo obj=new Triangulo();
    Button btnCalculo;
    Button btnSemi;
    Button btnPeri;
    EditText txta;
    EditText txtb;
    EditText txtc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculo=(Button)findViewById(R.id.btnCalculo);
        btnPeri=(Button)findViewById(R.id.btnPeri);
        btnSemi=(Button)findViewById(R.id.btnSemi);
        txta = (EditText) findViewById(R.id.txt1) ;
        txtb = (EditText) findViewById(R.id.txt2) ;
        txtc = (EditText) findViewById(R.id.txt3) ;

        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Declaracion de variables
                double a = Double.parseDouble(txta.getText().toString());
                double b = Double.parseDouble(txtb.getText().toString());
                double c = Double.parseDouble(txtc.getText().toString());

                //Enviar datos al objeto
                obj.setLado1(a);
                obj.setLado2(b);
                obj.setLado3(c);

                mensajeToast("El area es igual a:" + obj.area());

            }
        });

        btnPeri.setOnClickListener(new View.OnClickListener(){ @Override
        public void onClick(View v) {
            //Declaracion De Variables
            double a = Double.parseDouble(txta.getText().toString());
            double b = Double.parseDouble(txtb.getText().toString());
            double c = Double.parseDouble(txtc.getText().toString());
            //Enviar datos al objeto
            obj.setLado1(a);
            obj.setLado2(b);
            obj.setLado3(c);
            //Calculo de Perimetro
            mensajeToast("El perimetro es igual a:" + obj.PerimetroTriaguno());
        }});

        btnSemi.setOnClickListener(new View.OnClickListener(){ @Override
        public void onClick(View v) {
            //Declaracion De Variables

            double a = Double.parseDouble(txta.getText().toString());
            double b = Double.parseDouble(txtb.getText().toString());
            double c = Double.parseDouble(txtc.getText().toString());
            //Enviar datos al objeto

            obj.setLado1(a);
            obj.setLado2(b);
            obj.setLado3(c);
            //Calculo del SemiPerimetro

            mensajeToast("El Semi perimetro es igual a:" + obj.SemiPerimetroTriaguno());
        }});
    }

    public  void mensajeToast(String Mensaje)
    {
        Toast.makeText(this, Mensaje , Toast.LENGTH_SHORT).show();
    }
}
