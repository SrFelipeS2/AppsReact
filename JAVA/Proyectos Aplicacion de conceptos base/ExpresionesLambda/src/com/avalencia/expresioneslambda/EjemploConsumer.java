package com.avalencia.expresioneslambda;

import com.avalencia.expresioneslambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        //method reference, atajo para expresar un lambda que solamente llama a un metodo sencillo:
        //sigue siendo una expresion lambda o expresion anonima que se pasa por argumento
        //estas se usan en el apiStream y muchas mas!
        Consumer<String> consumidor = System.out::println;
        consumidor.accept("Hola mundo lambda");


        Consumer<Date> consumidorDate = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidorDate.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (Nombre, Edad)->System.out.println(Nombre + " Tiene " + Edad + " Años");

        consumidorBi.accept("Pepe", 30);
        //uso del lambda en for each:
        List<String> nombres = Arrays.asList("andres", "Pepe", "Adrea");
        nombres.forEach(consumidor);

        Supplier<Usuario> creaUsuario = Usuario::new;
        //otro ejemplo de method reference
        Usuario usuario = creaUsuario.get();
        //aqui se asume que el segundoi argumento se pasa por parametro para el metodo de la clase en este caso setNombre
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andres");
        System.out.println("Nombre de usuario = "+ usuario.getNombre());


        //esto es otra expresion lambda Suplier, no recibe ningun argumento solamente devuelve
        Supplier<String> proveedor = () -> "Hola Mundo";
        System.out.println(proveedor.get());

    }
}
