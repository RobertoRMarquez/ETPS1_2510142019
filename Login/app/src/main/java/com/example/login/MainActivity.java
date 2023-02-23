package com.example.login;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etusuario, etpassword;
    private Button btnentrar;
    private TextView tvfailed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusuario=findViewById(R.id.etusuario);
        etpassword=findViewById(R.id.etpassword);
        btnentrar= findViewById(R.id.btn1);

    }
    private void login(){
        String usuario = etusuario.getText().toString();
        String contra = etpassword.getText().toString();

        if (usuario.equals("parcialETps1") && contra.equals("p4rC14l#tp$")){
            startActivity(new Intent(MainActivity.this, CalculoIMC.class));
        }else{
            this.tvfailed.setText("Contraseña y usuario invalidos");
        }
    }
}