package com.avalencia.app.jardin;

import com.avalencia.app.hogar.Persona;

public class Perro {

    //Aqui en este ejemplo se dejan los atributos con el modificador por defecto
    //como esta clase esta dentro del mismo package que Ejemplopaquetes, no hay inconvenietes a la
    //hora de acceder a estos, es decir que se pueden usar en las clases que estan dentro del mismo paquete.

      String nombre;
      String raza;

      String jugar(Persona persona){
       return persona.lanzarPelota();
      }

      public static String saludar(){
          return "El perroe esta moviendo la cola";
      }
}
