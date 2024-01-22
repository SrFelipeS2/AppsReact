package com.avalencia.main;


import com.avalencia.almacenyverduleria.*;

public class Main {
    public static void main(String[] args) {
        // Crear arreglo de productos
        Producto[] productos = new Producto[8];  // 2 frutas + 2 lácteos

        // Crear objetos de frutas
        Fruta manzana = new Fruta("Manzana", 3400.0, 1, "Rojo");
        Fruta banano = new Fruta("Banano", 2400.0, 1, "Amarillo");
        Lacteo leche = new Lacteo("Leche", 5400.0, 1, 450);
        Lacteo yogurt = new Lacteo("Yogurt", 6400.0, 1, 850);
        Limpieza cloro = new Limpieza("Cloro", 3600.0, "Cloro y mas quimicos", 3);
        Limpieza aromatizante = new Limpieza("Aromatizante", 8400.0, "Alcohol, esencia de limon, antibacterial", 3);
        NoPercibible noPercibible1 = new NoPercibible("Miel", 10400.0, 1, 1000);
        NoPercibible noPercibible2 = new NoPercibible("Atun en lata", 8800.0, 1, 600);


        productos[0] = manzana;
        productos[1] = banano;
        productos[2] = leche;
        productos[3] = yogurt;
        productos[4] = cloro;
        productos[5] = aromatizante;
        productos[6] = noPercibible1;
        productos[7] = noPercibible2;


        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());

            if (producto instanceof Fruta) {
                System.out.println("Peso en KG: " + ((Fruta) producto).getPeso());
                System.out.println("color: " + ((Fruta) producto).getColor());
                Fruta fruta = (Fruta) producto;
                System.out.println("Tipo de producto = " + fruta.getClass().getSimpleName());
            } else if (producto instanceof Lacteo) {
                System.out.println("cantidad: " +  ((Lacteo) producto).getCantidad());
                System.out.println("proteinas: " +  ((Lacteo) producto).getProteinas());
                Lacteo lacteo = (Lacteo) producto;
                System.out.println("Tipo de producto: " + lacteo.getClass().getSimpleName());
            } else if (producto instanceof Limpieza) {
                System.out.println("Litros: " + ((Limpieza) producto).getLitros());
                System.out.println("componentes: " +((Limpieza) producto).getComponentes());
                Limpieza limpieza = (Limpieza) producto;
                System.out.println("Tipo de producto: " + limpieza.getClass().getSimpleName());
            } else if (producto instanceof NoPercibible) {
                System.out.println("Contenido: " + ((NoPercibible) producto).getContenido());
                System.out.println("calorias: " + ((NoPercibible) producto).getCalorias());
                NoPercibible noPercibible = (NoPercibible) producto;
                System.out.println("Tipo de producto: " + noPercibible.getClass().getSimpleName());
            }

            System.out.println();  // Separador entre productos
        }
    }
}


