package Map;

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar contactos
        Map<String, String> agendaTelefonica = new HashMap<>();

        // Agregar contactos al mapa
        agendaTelefonica.put("Juan", "123-456-7890");
        agendaTelefonica.put("María", "987-654-3210");
        agendaTelefonica.put("Carlos", "555-123-4567");

        // Acceder a un número de teléfono mediante el nombre del contacto
        String numeroDeJuan = agendaTelefonica.get("Juan");
        System.out.println("Número de Juan: " + numeroDeJuan);

        // Imprimir la lista de contactos
        System.out.println("Lista de Contactos:");
        for (Map.Entry<String, String> entry : agendaTelefonica.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        //Para insertar un nuvo ocntacto
        agendaTelefonica.put("NuevoContacto", "999-888-7777");
        
        //Para eliminar un contacto
        agendaTelefonica.remove("Juan");
        
        //Para verificar que un contacto exista
        boolean existeJuan = agendaTelefonica.containsKey("Juan");
        System.out.println(existeJuan);
        
        //para obtener el numero telefonico de un contacto
        String numeroDeMaria = agendaTelefonica.get("María");
        System.out.println("Numero de Maria "+numeroDeMaria);
        
        //para modificar un numero de contacto
        agendaTelefonica.put("María", "111-222-3333");

        //para obtener el tamaño de hasmap
        int tamaño = agendaTelefonica.size();
        System.out.println("Tamaño de la agenda: " + tamaño);

        //para verificar si el hasmap esta vacio
        boolean estaVacio = agendaTelefonica.isEmpty();
        System.out.println("el Map esta vacio?: "+ estaVacio);
        
        //para iterar sobre las claves
        for (String nombre : agendaTelefonica.keySet()) {
            System.out.println("Iteracion 1 Nombre: " + nombre);
        }
        
        //para iterar sobre los valores
        for (String numero : agendaTelefonica.values()) {
            System.out.println("Iteracion 2 numero: " + numero);
        }

        //para iterar soblre clave - valor
        for (Map.Entry<String, String> entry : agendaTelefonica.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }






    }
}

