package com.avalencia.PooHerencia;

public final class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("Inicializando constructor de Alumno Internacional");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + " soy de " + this.getPais() + " y curso en: " + this.getInstitucion();
    }

    @Override
    public double calcularPromedio() {
       // System.out.println("calcularPromedio " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio() * 3) + this.getNotaIdiomas()) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +  "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas ;
    }
}
