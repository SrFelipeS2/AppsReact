package com.avalencia.pooclasesabstractas.form;

import com.avalencia.pooclasesabstractas.form.elementos.*;
import com.avalencia.pooclasesabstractas.form.elementos.select.Opciones;
import com.avalencia.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm pasword = new InputForm("clave", "password");
        pasword.addValidador(new RequeridoValidador()).addValidador(new LargoValidador(6, 12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador()).addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new RequeridoValidador()).addValidador(new NumeroValidador());
        TextareaForm experiencia = new TextareaForm("exp", 5, 9);
        experiencia.addValidador(new NoNulloValidador());

        SelectForm lenguaje = new SelectForm("Lenguaje");
        Opciones java = new Opciones("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opciones("2", "Python"))
                .addOpcion(new Opciones("3", "JavaScript").setSelected())
                .addOpcion(new Opciones("4", "TypeScript"))
                .addOpcion(new Opciones("5", "PHP"));
        lenguaje.addValidador(new NoNulloValidador());

        ElementosForm saludar = new ElementosForm() {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };
        saludar.setValor("Hola que tal este campo esta deshabilitado");
        username.setValor("Jhon.doe");
        pasword.setValor("123456");
        email.setValor("Jhon@gmail.com");
        edad.setValor("28");
        experiencia.setValor("mas de 10 años de experiencia desarrollando en JAva");
        //java.setSelected(true);

        List<ElementosForm> elementos = Arrays.asList(username
                , pasword
                , email
                , edad
                , experiencia
                , lenguaje
                , saludar);


        //esto es una manera de recorrer el arreglo con la api stream, se usa una funcion lambda
        //un arrow function
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if (!e.esValido()) {
                //esto es un metodo de referenciado "System.out::println" y es lo mismo que esto:
                // "err -> System.out.println(err);"
               //esta es una manera de implementar una expresion lamda con stream e.getErrores().forEach(err -> System.out.println(e.getNombre() + ": " + err));
                //como se optimizo el codigo para sacar un error mas especifico y detallado desde el ElementoForm se implementaria asi:
                e.getErrores().forEach(System.out::println);
            }
        });

    }
}
