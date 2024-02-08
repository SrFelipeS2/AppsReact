package com.avalencia.anotaciones;

import com.avalencia.anotaciones.models.Producto;
import com.avalencia.anotaciones.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa De Centro");
        p.setPrecio(1999L);


        System.out.println("json = " + JsonSerializador.convertirJson(p));

    }


}
/*
* El código que has proporcionado es un ejemplo de serialización de un objeto Java a formato JSON utilizando anotaciones y reflexión. Explicaré el código línea por línea:

```java
public static void main(String[] args) {
    // Crea una instancia de la clase Producto
    Producto p = new Producto();

    // Establece la fecha actual en el Producto
    p.setFecha(LocalDate.now());

    // Establece el nombre del Producto
    p.setNomnbre("Mesa De Centro");

    // Establece el precio del Producto
    p.setPrecio(1999L);



    // Imprime el JSON resultante
    System.out.println("json = " + json);
}
```

- `Producto`: Es una clase que probablemente tenga campos como fecha, nombre y precio.
- `JsonAtributo`: Es una anotación personalizada que se utiliza para marcar los campos que se deben incluir en la serialización JSON.
- `System.out.println("json = " + json);`: Imprime el JSON resultante en la consola.

Este código utiliza reflexión para obtener los campos de un objeto, filtra solo los campos que tienen una anotación específica (`JsonAtributo`), y luego los convierte en una cadena JSON. La idea es proporcionar una forma genérica de serializar objetos a JSON sin tener que escribir un método específico para cada clase.
* */

