package com.avalencia.poointerfaces.imprenta;

import com.avalencia.poointerfaces.imprenta.modelo.*;
import com.avalencia.poointerfaces.imprenta.modelo.Genero.*;

import static com.avalencia.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral....","Jhon Doe","Ingeniero de sistemas");
        cv.addExperiencias("eh trabajado en Amazon").addExperiencias("Eh trabajdo en google");
        cv.addHanilidades("Sprognframework").addHanilidades("Angular").addHanilidades("Desarrollador fullStack");

        Libro libro = new Libro("Erich Gamma","Patrones de diseños: Elementos Reusables POO", PROGRAMACION);
        libro.addPAgina(new Pagina("Patron SImple"))
                .addPAgina(new Pagina("Patron Observer"))
                .addPAgina(new Pagina("Patron Factory"))
                .addPAgina(new Pagina("Patron Singleton"));

       //comop podemos notar es esta parte, no podemos imprimir un libro por que no hereda de Hoja, Hoja es la que tiene el contrato
        //de implementacion para imprimir, pero como la clase libro es un conjunto de paginas que a su vez  forman Hojas
        //por este motivo es mejor implementar interfaces que permite la implementacion de contratos sin importar el tipo
        //solo importa la funcionalidad.
        imprimir(libro);
        Infomre informe = new Infomre("Etudio sobre microsevicios", "Matrin Fowler", "James");
        imprimir(cv);
        imprimir(informe);
    }

    //esto es un contrato, aqui implementamos la funcion que esta en la clase Hoja
    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
