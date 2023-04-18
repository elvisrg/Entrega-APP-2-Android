package com.movilespascual.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Mensaje extends AppCompatActivity {

    TextView Nom, emaill, ciudadd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        Nom=findViewById(R.id.nombre);
        ciudadd=findViewById(R.id.ciudad);
        emaill=findViewById(R.id.correo);

        String name=getIntent().getStringExtra("name");
        Nom.setText(name);

        String ciudad=getIntent().getStringExtra("ciudad");
        ciudadd.setText(ciudad);

        String email=getIntent().getStringExtra("mail");
        emaill.setText(email);


    }
}