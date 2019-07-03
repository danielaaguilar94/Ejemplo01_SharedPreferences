package com.example.ejemplo01_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ConsultaPreferencias extends AppCompatActivity {

    TextView tvmostrarUsuario, tvmostrarContraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_preferencias);

        tvmostrarUsuario = findViewById(R.id.tvUsuariomostrado);
        tvmostrarContraseña = findViewById(R.id.tvContraseñamostrada);


        Bundle bundle = this.getIntent().getExtras();

        if(bundle!=null)
        {
            String usuario = bundle.getString("user");
            String contraseña = bundle.getString("pass");
            tvmostrarUsuario.setText("Usuario ingresado: "+usuario);
            tvmostrarContraseña.setText("Contraseña ingresada: "+contraseña);


        }






    }
}
