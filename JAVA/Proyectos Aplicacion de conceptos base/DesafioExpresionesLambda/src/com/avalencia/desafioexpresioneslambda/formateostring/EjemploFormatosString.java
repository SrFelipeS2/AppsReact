package com.avalencia.desafioexpresioneslambda.formateostring;

public class EjemploFormatosString {
    public static void main(String[] args) {
        FormateoString formatoDefinido1 = (a)->{
            return a.replaceAll("[ ,.]", "").toUpperCase();
        };

        FormateoString formatoDefinido2 = (a)->{
            return a.replaceAll("[ ,.]", "").replaceAll("[ñÑ]","n").toUpperCase();
        };

        FormatoFrases formatoPreDefinido = new FormatoFrases();
        System.out.println(formatoDefinido1.formateo("Esto Es Una Frase COn FOrmato Extraño,  Que Sera  Organizada Con Un Formato Especifico"));
        FormatoFrases formatoSinÑ = new FormatoFrases();
        System.out.println(formatoDefinido2.formateo("esto es una frase, la funcion elimina espacios eñes y pone todo en mayusculas, ademas elimina puintos. y comas,"));
    }

}
