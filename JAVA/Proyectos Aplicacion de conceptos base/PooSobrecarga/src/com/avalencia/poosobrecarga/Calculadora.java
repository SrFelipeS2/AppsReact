package com.avalencia.poosobrecarga;

//Esto es un ejemplo de sobrecarga de metodos
//distintos metodos, con comportamientos similares pero implementados de manera diferente

public class Calculadora {
    private Calculadora() {
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int sumar(int... argumentos){
        int total = 0;
        for(int i : argumentos){
            total+=i;
        }
        return total;
    }

    public static float sumar(float a, int... argumentos){
        float total = a;
        for(int i : argumentos){
            total+=i;
        }
        return total;
    }
    public static long sumar(long a, long b) {
        return a + b;
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float sumar(int a, float b) {
        return a + b;
    }

    public static float sumar(float a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }
    public static int sumar(String a, String b) {
        int resultado;
        try{
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch(Exception e){
            resultado = 0;
        }
        return resultado;
    }
    public static int sumar (int a, int b, int c){
        return a + b + c;
    }

}
