package com.avalencia.ejemplo;

import com.avalencia.PooHerencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("==============Creando la Instancia de la clase Alumno ==============");
        //esta es la manera correcta de usra la case Alumno
        Alumno alumno = new Alumno();
        alumno.setNombre("Pepito");
        alumno.setApellido("Perez");
        alumno.setInstitucion("Instituto Tecnico San Rafael");
        alumno.setNotaEspañol(6.6);
        alumno.setNotaIngles(4.9);
        alumno.setNotaMatematica(8.6);
        //pero tambien puedo hacer lo siguiente:
        //Persona alumno2 = new Alumno();
        //aqui estoy llamando a la clase persona y le estoy pasando un Alumno
        //pero no puedo acceder a losatributos y metodos de Alumno por que es de clase Persona
        //si quisera acceder a los attributos y metodos debo de hacerle un casteo a alumno2
        //para que JAVA reconozca alumno2 como tipo Alumno
        //((Alumno)alumno2).setInstitucion("Instituto Tecnico San Rafael");

        System.out.println("==============Creando la Instancia de la clase Alumno Internacional ==============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Petter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(16);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.2);
        alumnoInt.setNotaEspañol(6.6);
        alumnoInt.setNotaIngles(4.9);
        alumnoInt.setNotaMatematica(8.6);

        System.out.println("==============Creando la Instancia de la clase Profesor ==============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Alan");
        profesor.setApellido("Brito");
        profesor.setAsignatura("Matematicas");

        System.out.println("===========================");


        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion()
        );

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais()
                + " " + alumno.getNotaIngles()
        );

        System.out.println("Profesor de " + profesor.getAsignatura() +" : " + profesor.getNombre() + " " + profesor.getApellido() );

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass()!=null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre );
            clase =  clase.getSuperclass();
        }
    }
}
