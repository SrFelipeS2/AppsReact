import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];

        int total = productos.length;

        productos[0] = "Kingston Pendrive";
        productos[1] = "Samsung galaxy";
        productos[2] = "SSd Esterno 1 TB";
        productos[3] = "Estanteria";
        productos[4] = "Peluche";
        productos[5] = "Macbook m3 Max";
        productos[6] = "Nintendo Swithc";

        Arrays.sort(productos);
        System.out.println("========= Usando for ========");
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }
        System.out.println("========= Usando forEach ========");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("========= Usando while ========");
        int i = 0;
        while (i < total){
            System.out.println("Para el indice " + i + " : " + productos[i]);
            i++;
        }
        System.out.println("========= Usando  Do while ========");
        int j = 0;
        do {
            System.out.println("Para el indice " + j + " : " + productos[j]);
            j++;
        } while(j < total);

        int[] numeros = new int[10];
        int total1 = numeros.length;

        for (int k = 0; k<total1;k++){
            numeros[k]=k*3;
        }

        for (int k = 0; k<total1;k++){
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
