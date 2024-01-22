package org.avalencia.appfacturas;

import org.avalencia.appfacturas.domain.*;


import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Pepito Perez");
        cliente.setRut("98665-54");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        Factura factura = new Factura(s.nextLine(),cliente);

        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese Producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura);
    }
}
