package com.example.formulario;

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

    }

    public void onEmpresa(View vista) {

    }
}
