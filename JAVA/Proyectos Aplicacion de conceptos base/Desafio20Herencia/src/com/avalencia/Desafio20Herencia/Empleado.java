package com.avalencia.Desafio20Herencia;

public class Empleado extends Persona{

    private double remuneracion;
    private int empleadoId;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public double aumentarRemuneracion(int porcentaje){
        return remuneracion += remuneracion * (porcentaje / 100.0);
        //return remuneracion += remuneracion * (porcentaje / 100.0);
    }

    @Override
    public String toString() {
        return super.toString() +
                "remuneracion='" + remuneracion + '\'' +
                ", empleadoId='" + empleadoId + '\'' +
                "aumentarRemuneracion " + this.aumentarRemuneracion(10);

    }
}
