package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Pias extends AppCompatActivity {
    ListView listaPaises;
    ArrayList<ClasePais> arregloPais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pias);

        listaPaises = (ListView) findViewById(R.id.listaPaises);

        //Agregamos valores al arreglo
        arregloPais = new ArrayList<>();
        arregloPais.add(new ClasePais(1,"México"));
        arregloPais.add(new ClasePais(2,"EEUU"));
        arregloPais.add(new ClasePais(3,"Canadá"));
        arregloPais.add(new ClasePais(4,"Cuba"));
        arregloPais.add(new ClasePais(5,"Alemania"));

        ArrayAdapter<ClasePais> adaptadorPaises = new ArrayAdapter<ClasePais>(getApplicationContext(), android.R.layout.simple_list_item_1, arregloPais){
            @androidx.annotation.NonNull
            @Override
            public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
                View vista = super.getView(position, convertView, parent);
                TextView textoVista = (TextView) vista.findViewById(android.R.id.text1);
                textoVista.setText(arregloPais.get(position).getDetalle());
                return vista;
            }
        };

        listaPaises.setAdapter(adaptadorPaises);

        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClasePais retorno = arregloPais.get(position);

                Intent retornaPais = getIntent();
                retornaPais.putExtra("retorno", retorno);
                setResult(RESULT_OK, retornaPais);
                finish();
            }
        });
    }
}
