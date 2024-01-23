package com.avalencia.pooclasesabstractas.form.elementos.select;

public class Opciones {
    private String valor;
    private String nombre;
    private boolean selected;

    public Opciones() {
    }

    public Opciones(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;

    }
    public Opciones setSelected() {
        this.selected = true;
        return this;
    }
}
