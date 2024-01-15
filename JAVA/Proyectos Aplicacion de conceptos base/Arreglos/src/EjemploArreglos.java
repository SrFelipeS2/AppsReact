import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive";
        productos[1] = "Samsung galaxy";
        productos[2] = "SSd Esterno 1 TB";
        productos[3] = "Estanteria";
        productos[4] = "Peluche";
        productos[5] = "Macbook m3 Max";
        productos[6] = "Nintendo Swithc";

        Arrays.sort(productos);

        System.out.println("Productos[0] " + productos[0]);
        System.out.println("Productos[1] " + productos[1]);
        System.out.println("Productos[2] " + productos[2]);
        System.out.println("Productos[2] " + productos[3]);
        System.out.println("Productos[2] " + productos[4]);
        System.out.println("Productos[2] " + productos[5]);
        System.out.println("Productos[2] " + productos[6]);

        int[] numeros = new int[4];

        numeros[0] = 54;
        //a continuacion un auto unmboxing, o desempaquetado de un entero primitivo del pbjeto integer
        numeros[1] = Integer.valueOf("68");
        //a continucacion un casteo de Long a entero
        //numeros[2] = (int)3L;
        numeros[2] = 2;
        numeros[3] = 69;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
