package Pila;
import java.util.ArrayList;

public class Pila {
    // las pilas se rigen por el concepto de FILO (First In Last Out)
    private ArrayList<Object> filo = new ArrayList<>();

    // este método sirve para agregar valores a la pila
    public void push(Object o) {
        filo.add(o); // agregamos el valor a la pila
    }

    // este método muestra el último valor y lo elimina
    public Object pop() {
        if (!filo.isEmpty()) {
            Object o = filo.get(filo.size() - 1);
            filo.remove(filo.size() - 1);
            return o; // devuelve el valor eliminado
        } else {
            return null;
        }
    }

    // este método muestra el último valor
    public Object peek() {
        if (!filo.isEmpty()) {
            return filo.get(filo.size() - 1);
        } else {
            return null;
        }
    }

    // este método identifica si la pila está vacía
    public Boolean empty() {
        return filo.isEmpty();
    }
}
