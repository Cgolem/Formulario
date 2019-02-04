package com.example.formulario;

import java.io.Serializable;

public class ClaseEmpresa implements Serializable {
    int Id;
    String Titulo;
    String Detalle;

    public ClaseEmpresa(int id, String titulo, String detalle) {
        Id = id;
        Titulo = titulo;
        Detalle = detalle;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }
}
