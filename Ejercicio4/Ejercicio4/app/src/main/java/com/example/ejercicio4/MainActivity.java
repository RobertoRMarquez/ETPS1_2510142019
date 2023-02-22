package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
    }
    public void Ejecutar(View view){
        String valor1 = et1.getText().toString();
        int n1 = Integer.parseInt(valor1);
        String res1 = "";
        String res2 = "";
        String res3 = "";
        int suma = n1 + 77;
        int resta = n1 - 3;
        int mult = n1 * 2;
        res1 = n1+" + 77 = "+suma;
        res2 = n1+" - 3 = "+resta;
        res3 = n1+" x 2 = "+mult;
        tv1.setText(res1);
        tv2.setText(res2);
        tv3.setText(res3);
    }
}