package com.app.usuario;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText UsuarioText;
    private EditText passwordText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsuarioText = findViewById(R.id.UsuarioText);
        passwordText = findViewById(R.id.passwordText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = UsuarioText.getText().toString();
                String password = passwordText.getText().toString();

                // Validar las credenciales
                if (validarCredenciales(username, password)) {
                    enviaDatos(username, password);
                } else {
                    Toast.makeText(MainActivity.this, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validarCredenciales(String username, String password) {
        // Validar que el nombre de usuario y la contraseña no estén vacíos
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        // Verificar si las credenciales son correctas (nombre de usuario "usuario" y contraseña "contraseña")
        if (username.equals("irygoren") && password.equals("eternocampeon91")) {
            return true;
        }
        return false;
    }
    public void enviaDatos(String username, String password) {
        // Enviar datos a la actividad MainActivity
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("username", username);
        intent.putExtra("password", password);
        startActivity(intent);
    }
}

