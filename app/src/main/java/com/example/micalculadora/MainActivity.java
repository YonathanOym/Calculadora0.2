package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    Button sumar;
    TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.numero1);
        Resultado = (TextView) findViewById (R.id.Resultado);
        sumar = (Button) findViewById (R.id.Sumar);

        //funcion CLICK

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = double.parsedouble(num1.getText().toString());
                double sumatoria = numero1 + 10;
                Resultado.setText(Double.toString(sumatoria));


            }
        });

    }
}