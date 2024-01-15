import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive","Samsung galaxy",
                            "SSd Esterno 1 TB","Peluche","Estanteria",
                            "Macbook m3 Max","Nintendo Swithc"
                            }; 

        int total = productos.length;

        Arrays.sort(productos);
        System.out.println("========= Antes de llamar a la funcion arregloInverso ========");
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }
        //Implementacion de manera manual
        // arregloInverso(productos);
        // Implementacion con la api de Collections de java, para esto reverse necesita una List no un Array
        //entonces se usa la clase Arrays.asList(productos) para convertir el arreglo en una lista.
        //el resultado es el mismo reversa todos los elementos del arreglo, cambiando el ultimo por el primero, dentro del arreglo
        Collections.reverse(Arrays.asList(productos));

        System.out.println("========= Usando for ========");
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

    }
}
