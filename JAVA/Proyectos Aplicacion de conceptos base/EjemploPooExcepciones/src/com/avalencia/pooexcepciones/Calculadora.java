package com.avalencia.pooexcepciones;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivisionPorceroException {
        if(divisor == 0 ){
            throw new DivisionPorceroException("No se púede dividir por cero");
        }
        return numerador/(double)divisor;
    }

    public double dividir(String numerador, String divisor) throws DivisionPorceroException,
            FormatoNumeroException{
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        }catch (NumberFormatException e){
            throw new FormatoNumeroException("Debe ingresar un unmero en el numerador y divisor");
        }
    }
}
