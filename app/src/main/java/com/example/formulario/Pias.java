package com.example.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Pias extends AppCompatActivity {
    ListView listaPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pias);

        listaPaises = (ListView) findViewById(R.id.listaPaises);

        //Generamos un arrayList y le agregamos nuestra clasePais
        final ArrayList<ClasePais> arregloPais = new ArrayList<ClasePais>();

        //Agregamos valores al arreglo
        arregloPais.add(new ClasePais(1,"México"));
        arregloPais.add(new ClasePais(1,"EEUU"));
        arregloPais.add(new ClasePais(1,"Canadá"));
        arregloPais.add(new ClasePais(1,"Cuba"));
        arregloPais.add(new ClasePais(1,"Alemania"));

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
    }
}
