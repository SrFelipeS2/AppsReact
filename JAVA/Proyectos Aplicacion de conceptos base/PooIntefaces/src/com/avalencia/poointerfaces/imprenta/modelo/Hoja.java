package com.avalencia.poointerfaces.imprenta.modelo;

abstract public class Hoja {
    protected String contenido;
    abstract public String imprimir();

    public Hoja(String contenido) {
        this.contenido = contenido;
    }
}
