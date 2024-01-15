import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for(int i=0; i< total2; i++ ){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void  sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total -1 ; i++){
            for (int j = 0; j < arreglo.length-1 -i; j++){
                //para que sea de manera ascendente se cambia el simbolo < o > en el condicional dependiendo de las necesidades
                if (((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive","Samsung galaxy",
                            "SSd Esterno 1 TB","Peluche","Estanteria",
                            "Macbook m3 Max","Nintendo Swithc"
                            }; 

        int total = productos.length;

        sortBurbuja(productos);
//esta es una manera de hacer manualmente el sort:
//        System.out.println("========= Este es un algoritmo para organizar el arreglo, muy parecido al SORT() ========");
//        for (int i = 0; i < total; i++){
//            for (int j = 0; j < total; j++){
//                if (productos[i].compareTo(productos[j]) < 0) {
//                    String auxiliar = productos[i];
//                    productos[i] = productos[j];
//                    productos[j] = auxiliar;
//                }
//                contador++;
//            }
//        }

//esta es la segunda manera de hacer manuamlmente el sort, o de ordenar el arreglo (metodo burbuja)
//        System.out.println("========= Este es un algoritmo para organizar el arreglo, muy parecido al SORT() ========");
//        for (int i = 0; i < total -1 ; i++){
//
//            for (int j = 0; j < total-1 -i; j++){
//                if (productos[j+1].compareTo(productos[j]) < 0) {
//                    String auxiliar = productos[j];
//                    productos[j] = productos[j+1];
//                    productos[j+1] = auxiliar;
//                }
//                contador++;
//            }
//        }
        System.out.println("========= Usando for ========");
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 54;
        //a continuacion un auto unmboxing, o desempaquetado de un entero primitivo del pbjeto integer
        numeros[1] = Integer.valueOf("68");
        //a continucacion un casteo de Long a entero
        //numeros[2] = (int)3L;
        numeros[2] = 2;
        numeros[3] = 69;

        //A continuacion el mismo Algoritmo antes visto (burbuja) pero en  un metodo para su reutilizacion

        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Para el indice " + i + " : " + numeros[i]);
        }



    }
}
