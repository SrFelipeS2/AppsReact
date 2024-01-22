package com.avalencia.PooHerencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaEspañol;
    private double notaIngles;

    public Alumno() {
        System.out.println("Inicializanco constructor alumno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        this(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica, double notaEspañol, double notaIngles) {
        this(nombre, apellido, edad, institucion);
        this.notaEspañol = notaEspañol;
        this.notaMatematica = notaMatematica;
        this.notaIngles = notaIngles;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaEspañol() {
        return notaEspañol;
    }

    public void setNotaEspañol(double notaEspañol) {
        this.notaEspañol = notaEspañol;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + " soy " + this.getNombre() + " y soy un alumno ";
    }

    public double calcularPromedio() {
       // System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
        return (this.getNotaIngles() + this.getNotaEspañol() + this.getNotaMatematica() / 3);
    }

    @Override
    public String toString() {
        return super.toString() + "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaEspañol=" + notaEspañol +
                ", notaIngles=" + notaIngles +
                ", promedio= "+ this.calcularPromedio();
    }
}
