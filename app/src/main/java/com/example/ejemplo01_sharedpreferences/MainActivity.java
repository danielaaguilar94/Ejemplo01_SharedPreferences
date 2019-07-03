package com.example.ejemplo01_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_usuario,et_contraseña;
    TextView tv_usuario, tv_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_usuario = findViewById(R.id.etUsuario);
        et_contraseña = findViewById(R.id.etContraseña);
        tv_usuario = findViewById(R.id.tvUsuario);
        tv_contraseña = findViewById(R.id.tvContraseña);

        cargarPreferencias();

    }

    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnCargar:
                Intent intent = new Intent(this, ConsultaPreferencias.class);

                Bundle miBundle = new Bundle();
                String user= tv_usuario.getText().toString();
                String pass= tv_contraseña.getText().toString();
                miBundle.putString("user",user);
                miBundle.putString("pass",pass);
                intent.putExtras(miBundle);
                startActivity(intent);
                break;

            case  R.id.btnGuardar:
                guardarPreferencias();
                break;
        }
    }

    private void cargarPreferencias() {
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String usuario = preferences.getString("usuario","No existe información");
        String contraseña= preferences.getString("contraseña","No existe información");

        tv_usuario.setText(usuario);
        tv_contraseña.setText(contraseña);

    }

    private void guardarPreferencias() {
        //creación de SharedPreferences                             //nombre del archivo    modo de seguridad
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String usuario=et_usuario.getText().toString();
        String contraseña=et_contraseña.getText().toString();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("usuario",usuario);
        editor.putString("contraseña",contraseña);

        tv_usuario.setText(usuario);
        tv_contraseña.setText(contraseña);

        editor.commit();
    }
}
