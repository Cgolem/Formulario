package com.example.formulario;

import java.io.Serializable;

public class ClasePais implements Serializable {
    int id;
    String detalle;

    public ClasePais(int id, String detalle) {
        this.id = id;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
