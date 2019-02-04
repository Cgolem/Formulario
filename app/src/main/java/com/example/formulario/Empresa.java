package com.example.formulario;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Empresa extends AppCompatActivity {
    ListView listaEmpresas;
    ArrayList<ClaseEmpresa> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        listaEmpresas = (ListView) findViewById(R.id.listaEmpresas);

        datos = new ArrayList<>();
        datos.add(new ClaseEmpresa(1,"Stefanini", "Consultora"));
        datos.add(new ClaseEmpresa(2,"Walmart", "Super mercado"));
        datos.add(new ClaseEmpresa(3,"Soriana", "Super mercado"));
        datos.add(new ClaseEmpresa(4,"Albo", "Fintech"));
        datos.add(new ClaseEmpresa(5,"Praxis", "Consultora"));

        ArrayAdapter<ClaseEmpresa> adaptador = new ArrayAdapter<ClaseEmpresa>(getApplicationContext(), R.layout.listviewpropio, datos) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View vista = super.getView(position, convertView, parent);
                TextView titulo = (TextView) vista.findViewById(R.id.txtTituloEmpresas);
                TextView detalle = (TextView) vista.findViewById(R.id.txtDetalleEmpresa);

                titulo.setText(datos.get(position).getTitulo());
                detalle.setText(datos.get(position).getDetalle());

                titulo.setTextColor(Color.BLACK);
                detalle.setTextColor(Color.GREEN);
                return vista;
            }
        };

        listaEmpresas.setAdapter(adaptador);

        listaEmpresas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClaseEmpresa retorno = datos.get(position);

                Intent retornaPais = getIntent();
                retornaPais.putExtra("retorno", retorno);
                setResult(RESULT_OK, retornaPais);
                finish();
            }
        });
    }
}
