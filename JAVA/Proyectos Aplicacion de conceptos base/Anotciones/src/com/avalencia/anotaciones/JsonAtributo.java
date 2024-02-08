package com.avalencia.anotaciones;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    //las anotaciones tambien poueden tener atributos de esta metadata con valores por defecto
    String nombre() default "";
    boolean capitalizar() default false;
    //convirtiendo una clase a un json

}
