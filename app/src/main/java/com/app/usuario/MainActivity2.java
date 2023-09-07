package com.app.usuario;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends AppCompatActivity {

    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView3 = findViewById(R.id.textView3);

        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("username");
            String password = intent.getStringExtra("password");

            // Mostrar los datos en un TextView
            String userData = "Welcome " + username ;
            textView3.setText(userData);

            // Mostrar los datos en un Toast
            Toast.makeText(this, userData, Toast.LENGTH_SHORT).show();
        }
    }
}