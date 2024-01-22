package com.avalencia.app.jardin;
//Aqui importamos la clase Persona
import com.avalencia.app.hogar.ColorPelo;
import com.avalencia.app.hogar.Persona;
//Aqui importamos todas las clases dentro del package hogar, no afecta en memoria ni en rendimiento
import com.avalencia.app.jardin.Perro;
//Aqui indicamos que vamos a importar un miembro estatico de la clase puede ser un metodo o un atributo
import static com.avalencia.app.hogar.Persona.saludar;
import static com.avalencia.app.hogar.Persona.GENERO_MASCULINO;
import static com.avalencia.app.hogar.Persona.GENERO_FEMENINO;
//usando el * importamos todos los miembros de la clase Persona, metodos atributos estaticos
import static com.avalencia.app.hogar.Persona.*;
import static com.avalencia.app.hogar.ColorPelo.CAFE;

public class EjemploPaquetes {
    public static void main(String[] args) {

    //como la clase persona esta dentro de un package
    //y no es esta importando se debe acceder asi: com.avalencia.app.hogar.Persona p = new com.avalencia.app.hogar.Persona();
    //se debe ser demasiado explicito al momento de acceder a estas clases es mas facil usar import.

   //Aqui usamos la clase persona por que ya tenemos definido el import
    Persona p = new Persona();
    p.setNombre("Andres ");
    p.setApellido("Valencia");
    p.setColorPelo(String.valueOf(CAFE));

        System.out.println(p.getNombre() + " "+ p.getApellido());
    //en esta instancia no es necesario importar la clase perro esto por que esta dentro del mismo package
    Perro perro = new Perro();
    perro.nombre = "Toby";
    perro.raza = "Bordercoli";

    String jugando = perro.jugar(p);
    System.out.println("jugando = " + jugando);


    String saludo = saludar();
        System.out.println("saludo = " + saludo);

    String generoMujer = GENERO_FEMENINO;
    String generoHombre = GENERO_MASCULINO;


    }

}
