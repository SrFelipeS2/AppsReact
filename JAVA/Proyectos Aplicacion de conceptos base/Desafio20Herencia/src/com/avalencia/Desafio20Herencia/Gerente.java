package com.avalencia.Desafio20Herencia;

public class Gerente extends Empleado{

    public  Gerente(){

    }
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    private double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public double aumentarRemuneracion(int porcentaje) {
        double aumento = super.aumentarRemuneracion(porcentaje);
        // Suma 100.000 al aumento por tener un cargo mayor
        return aumento + 100000;
    }

    @Override
    public String toString() {
        return super.toString() +
                " presupuesto: " + presupuesto;
    }
}
