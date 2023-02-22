package sv.edu.utec.preciodeunproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtPrice;
    private Button btnCalcular;
    private TextView txvResultado;

    private final double IVA = 1.13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrice = findViewById(R.id.edtPrice);
        btnCalcular = findViewById(R.id.btnCalcular);
        txvResultado = findViewById(R.id.txvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String priceString = edtPrice.getText().toString();
                if (priceString.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa el precio del producto", Toast.LENGTH_SHORT).show();
                } else {
                    double price = Double.parseDouble(priceString);
                    double priceWithIVA = price * IVA;
                    txvResultado.setText("Precio final con IVA: $" + String.format("%.2f", priceWithIVA));
                }
            }
        });
    }
}

