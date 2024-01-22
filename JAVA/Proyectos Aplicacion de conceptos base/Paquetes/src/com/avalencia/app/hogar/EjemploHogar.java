package com.avalencia.app.hogar;

import com.avalencia.app.jardin.Perro;
import static com.avalencia.app.hogar.Persona.*;


public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }
}
