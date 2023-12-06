package Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un HashSet para almacenar los "me gusta"
        Set<String> likes = new HashSet<>();

        // Método add: Agregar usuarios que dan "me gusta" a una publicación
        likes.add("Usuario1");
        likes.add("Usuario2");
        likes.add("Usuario3");

        // Método contains: Verificar si un usuario ya dio "me gusta"
        String nuevoUsuario = "Usuario2";
        if (likes.contains(nuevoUsuario)) {
            System.out.println(nuevoUsuario + " ya dio 'me gusta'.");
        } else {
            // Método add: Agregar un nuevo usuario que dio "me gusta"
            likes.add(nuevoUsuario);
            System.out.println(nuevoUsuario + " dio 'me gusta' con éxito.");
        }

        // Método size: Obtener el número de usuarios que dieron "me gusta"
        int numeroDeLikes = likes.size();
        System.out.println("Número de 'me gusta': " + numeroDeLikes);

        // Método isEmpty: Verificar si el conjunto de "me gusta" está vacío
        boolean estaVacio = likes.isEmpty();
        System.out.println("¿El conjunto de 'me gusta' está vacío? " + estaVacio);

        // Método remove: Eliminar a un usuario que dio "me gusta"
        String usuarioARemover = "Usuario1";
        likes.remove(usuarioARemover);

        // Imprimir la lista de usuarios que dieron "me gusta"
        System.out.println("Usuarios que dieron 'me gusta': " + likes);
    }
}
