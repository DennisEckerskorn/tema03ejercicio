package com.denniseckerskorn.tema03ejercicio01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Asignar layout correspondiente a la actividad
        setContentView(R.layout.activity_main);

        //Enlaces para mostrar las etiquetas:
        TextView tvGreeting = findViewById(R.id.tvGreeting);
        EditText edName = findViewById(R.id.edName);
        EditText edSurname = findViewById(R.id.edSurname);
        Button bHello = findViewById(R.id.bHello);

        //Comportamiento al hacer click en el boton:
        bHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = getString(R.string.hello) + " " + edName.getText() + " " + edSurname.getText();

                //Toast para mostrar un mensaje en una ventana emergente:
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

    }
}