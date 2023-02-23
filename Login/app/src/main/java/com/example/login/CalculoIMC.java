package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class CalculoIMC extends AppCompatActivity {
    private EditText etpeso, etaltura;
    private TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculoimc);

        etpeso=findViewById(R.id.etpeso);
        etaltura=findViewById(R.id.etaltura);
        tvresultado=findViewById(R.id.tvresultado);
    }
    public void operar(View view){
        String v1 = etpeso.getText().toString();
        String v2 = etaltura.getText().toString();
        double peso = Double.parseDouble(v1);
        double altura = Double.parseDouble(v2);
        String r = "";

        double imc = peso/(altura*altura);
        if (imc < 10.5){
            r = "Críticamente Bajo de Peso";
        }
        else if (imc < 15.9) {
            r = "Severamente Bajo de Peso";
        }
        else if (imc < 18.5) {
            r = "Bajo de Peso";
        }
        else if (imc < 25) {
            r = "Normal (peso saludable)";
        }
        else if (imc < 30) {
            r = "Sobrepeso";
        }
        else if (imc < 35) {
            r = "Obesidad Clase 1 - Moderadamente Obeso";
        }
        else if (imc < 40) {
            r = "Obesidad Clase 2 - Severamente Obeso";
        }
        else {
            r = "Obesidad Clase 3 - Críticamente Obeso";
        }
        tvresultado.setText(r);
    }
}