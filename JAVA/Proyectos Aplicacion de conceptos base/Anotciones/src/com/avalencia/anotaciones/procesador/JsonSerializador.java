package com.avalencia.anotaciones.procesador;

import com.avalencia.anotaciones.AnotationInit;
import com.avalencia.anotaciones.JsonAtributo;
import com.avalencia.anotaciones.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonSerializador {
    public static void inicializarObjeto(Object object) {

        if (Objects.isNull(object)) {
            throw new JsonSerializadorException("El Objeto a serializar no puede se null!");
        }
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(AnotationInit.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException("error al serializar, no se puede inicializar objeto");
                    }
                });
    }

    public static String convertirJson(Object object) {


        if (Objects.isNull(object)) {
            throw new JsonSerializadorException("El Objeto a serializar no puede se null!");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();

        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);
                        if (f.getAnnotation(JsonAtributo.class).capitalizar() &&
                                valor instanceof String) {
                            String nuevoValor = (String) valor;
                            nuevoValor = Arrays
                                    .stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0, 1)
                                            .toUpperCase() + palabra
                                            .substring(1)
                                            .toLowerCase())
                                    .collect(Collectors.joining(" "));
                            f.set(object, nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializal a json: " + e.getMessage());
                    }

                })
                .reduce("{", (a, b) -> {
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;

                }).concat("}");
    }
}
/*
* // Obtiene todos los atributos de la clase Producto mediante reflexión
    Field[] atributos = p.getClass().getDeclaredFields();

    // Realiza la serialización a JSON
    String json = Arrays.stream(atributos)
        // Filtra los atributos que tienen la anotación JsonAtributo
        .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
        .map(f -> {
            // Hace que el atributo sea accesible
            f.setAccessible(true);

            // Obtiene el nombre del atributo desde la anotación o el nombre del campo
            String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                    ? f.getName()
                    : f.getAnnotation(JsonAtributo.class).nombre();

            try {
                // Obtiene el valor del atributo y lo convierte a formato JSON
                return "\"" + nombre + "\":\"" + f.get(p) + "\"";
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error al serializal a json: " + e.getMessage());
            }
        })
        // Concatena todos los campos serializados en un solo string
        .reduce("{", (a, b) -> {
            if ("{".equals(a)) {
                return a + b;
            }
            return a + ", " + b;
        }).concat("}");
        *
        * - `Field`: Es una clase de Java que representa un campo (variable) de una clase. Se utiliza aquí para acceder a los campos de la clase `Producto` y obtener sus valores mediante reflexión.
- `LocalDate`: Es una clase de Java que representa una fecha sin zona horaria. Se utiliza aquí para representar la fecha en la que se creó el producto.
- `Arrays.stream(atributos)`: Convierte el arreglo de atributos en un flujo de datos para poder filtrarlos y mapearlos.
- `.filter(f -> f.isAnnotationPresent(JsonAtributo.class))`: Filtra solo los campos que tienen la anotación `JsonAtributo`.
- `.map(f -> { ... })`: Mapea cada campo a un string JSON.
- `f.setAccessible(true)`: Hace que el campo sea accesible, incluso si es privado.
- `f.getAnnotation(JsonAtributo.class)`: Obtiene la anotación `JsonAtributo` del campo.
- `f.getName()`: Obtiene el nombre del campo.
- `f.get(p)`: Obtiene el valor del campo para la instancia `p`.
- `.reduce("{", (a, b) -> { ... })`: Reduce los strings JSON mapeados en uno solo.
- `.concat("}")`: Agrega el corchete de cierre al final del JSON.*/