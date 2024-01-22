package com.avalencia.app.hogar;

public class Persona {
//en este ejemplo lo que se hace es quitar la visibilidad al atributo
//dejando el atributo nombre sin el public, restringiendo asi su uso fuera del package: String nombre;
    private String nombre;
//aqui si se deja apellido con public si se puede acceder por fuera del package
    private  String apellido;
    private String colorPelo;


    public static final String GENERO_MASCULINO = "Hombre";
    public static final String GENERO_FEMENINO = "Mujer";


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String lanzarPelota(){
        return "Lanzar la pelota a Toby";
    }

    public static String saludar(){
        return "Hola Como esta?";
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public String getColorPelo() {
        return colorPelo;
    }

    public String getNombre() {
        return nombre;
    }
}
