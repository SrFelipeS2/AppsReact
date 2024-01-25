package com.avalencia.poointerfacesimplementadas.imprenta.modelo;

public interface Imprimible {

    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    //el default permite que sea opcional la implementacion de esta funcionalidad
    //es decir la clase que implemente Imprimible puede o no implementar el sigueinte metodo
    // si quisieramos que fuese obligatorio, debeiramos de dejarlo asi public String imprimir();
    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    //esto es un metodo estatico, estos metodos le pertenecen a la interface
    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
