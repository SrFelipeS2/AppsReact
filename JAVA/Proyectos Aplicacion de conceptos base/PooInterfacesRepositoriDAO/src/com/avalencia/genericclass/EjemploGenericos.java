package com.avalencia.genericclass;

public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Juan", "Caballo"));
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Libardo", "Caballo"));
        transporteCaballos.add(new Animal("Zeus", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Raton", "Caballo"));
        //transporteCaballos.add(new Animal("Raton", "Caballo"));
        imprimir(transporteCaballos);


        System.out.println("-----------------------------------");

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Buldocer"));
        transMaquinas.add(new Maquinaria("Grua"));
        transMaquinas.add(new Maquinaria("Perforadora"));
        imprimir(transMaquinas);


        System.out.println("-----------------------------------");

        Camion<Automovil> transAuto= new Camion<>(3);
        transAuto.add(new Automovil("Mercedes"));
        transAuto.add(new Automovil("Audi"));
        transAuto.add(new Automovil("BMW"));
        imprimir(transAuto);


        //nota: como se implementa la iterfaz iterator en la clase Camion, este se puede iterar como
        // si fuera un arreglo o una lista, es por la api de coleccion de JAVA


    }
    public static <T>void imprimir(Camion<T> camion){
        for(T a: camion){
            if(a instanceof Animal){
                System.out.println (((Animal)a).getNombre() + " Tipo: " +  ((Animal)a).getTipo());
            } else if (a instanceof Maquinaria) {
                System.out.println("Tipo: " + ((Maquinaria)a).getTipo());
            }else {
                System.out.println("marca: " + ((Automovil)a).getMarca());
            }
        }
    }
}
