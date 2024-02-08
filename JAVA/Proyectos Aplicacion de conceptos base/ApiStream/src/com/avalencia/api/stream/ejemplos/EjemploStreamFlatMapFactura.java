package com.avalencia.api.stream.ejemplos;

import com.avalencia.api.stream.ejemplos.models.Factura;
import com.avalencia.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario  u1 = new Usuario("Jhon", "Doe");
        Usuario u2 = new Usuario("Pepe", "Perez");
        u1.addFactura(new Factura("Esto es una factura de compra de un Smart TV"));
        u1.addFactura(new Factura("Muebles"));

        u2.addFactura(new Factura("Bicicleta"));
        u2.addFactura(new Factura("Notebook"));

        List<Usuario> usuarios = Arrays.asList(u1,u2);
        //Sin usar api Stream
        for(Usuario u: usuarios){
            for (Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }
        //usando el api Stream
        //1 Convertimos la lista a un Stream
        usuarios.stream()
                //2 usamos el FlatMap para obtener las facturas de cada usuario
                .flatMap(u->u.getFacturas().stream())
                //3 Recorremos las facturas para obetener la descripcion de cada una y las imprimimos
                .forEach(f-> System.out.println(f.getDescripcion()
                        //4 como tenemos una relacion entre usuario factura y factura usuario podemos
                        //traer tambien los usuarios relacionados a estas fcturas como tal:
                        .concat(" Cliente: ")
                        .concat(f.getUsuario().toString())));
        //queda mas legible el codigo y ademas de esto eliminamos for anidados lo que le quita complejidad
        // a nuestro codigo


        //Otra manera de hacerlo:
        System.out.println("------------------");
        usuarios.stream()
                //convierte la lista de usuarios a un Stream del tipo List de factura
                .map(Usuario::getFacturas)
                //Luego convertimos esta lista de facturas a un Stream de factura
                .flatMap(List::stream)
                .forEach(f-> System.out.println(f.getDescripcion()
                        .concat(" Cliente: ")
                        .concat(f.getUsuario().toString())));


    }
}
