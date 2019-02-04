package com.example.formulario;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPais, btnEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPais = (Button) findViewById(R.id.btnPais);
        btnEmpresa = (Button) findViewById(R.id.btnEmpresa);
    }

    public void onPais(View vista) {
        Intent pais = new Intent(getApplicationContext(), Pias.class);
        startActivityForResult(pais, 100);
    }

    public void onEmpresa(View vista) {
        Intent empresa = new Intent(getApplicationContext(), Empresa.class);
        startActivityForResult(empresa, 200);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if( requestCode == 100 ){
            ClasePais retornoPais = (ClasePais) data.getExtras().getSerializable("retorno");
            btnPais.setText(retornoPais.getDetalle());
        } if( requestCode == 100 ){
            ClasePais retornoPais = (ClasePais) data.getExtras().getSerializable("retorno");
            btnEmpresa.setText(retornoPais.getDetalle());
        }
    }
}
