import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive","Samsung galaxy",
                            "SSd Esterno 1 TB","Peluche","Estanteria",
                            "Macbook m3 Max","Nintendo Swithc"
                            };

        int total = productos.length;

//        productos[0] = "Kingston Pendrive";
//        productos[1] = "Samsung galaxy";
//        productos[2] = "SSd Esterno 1 TB";
//        productos[3] = "Estanteria";
//        productos[4] = "Peluche";
//        productos[5] = "Macbook m3 Max";
//        productos[6] = "Nintendo Swithc";

        Arrays.sort(productos);
        System.out.println("========= Usando for ========");
        for (int i = 0; i < total; i++){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }
        System.out.println("========= Usando for Mostrando de Forma Inversa ========");

        for(int i =0; i<total; i++){
            System.out.println("Para i = " + (total-1-i) + " Valor: " + productos[total-1-i]);
        }
        System.out.println("========= Usando for Mostrando de Forma Inversa 2 ========");

        for(int i =total-1; i>=0; i--){
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

    }
}
