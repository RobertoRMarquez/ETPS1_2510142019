package sv.edu.utec.mensajedebienvenida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String miNombre = "Jhony alexi";
        String mensajeBienvenido = "Bienvenido " + miNombre;

        TextView tvwMensaje = findViewById(R.id.tvwMensaje);
        tvwMensaje.setText(mensajeBienvenido);

    }
}