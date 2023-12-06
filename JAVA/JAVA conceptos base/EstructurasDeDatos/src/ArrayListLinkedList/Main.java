package ArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
        List<Persona> listaArray = new ArrayList<Persona>();
       
        //Agregamos elementos al ArrayList
        listaArray.add(new Persona ("Juan", 25));
        listaArray.add(new Persona ("María", 30));
        
        //Removemos elementos al Arraylist        
        listaArray.remove(0);
        
        //verifico que si se haya eliminado
        System.out.println("-----LUEGO DE ELIMINAR ArrayList-------");
        
        for(Persona personaerecorrer : listaArray) {
        	System.out.println(personaerecorrer.getNombre());
        	System.out.println(personaerecorrer.getEdad());
        }
        
        //para saber el tamaño de ArrayList       
        System.out.println("-----TAMAÑO DEL ARRAYLIST-------");
        System.out.println(listaArray.size());
        
        //para borrar toda el contenido del arrayList       
        listaArray.clear();
        System.out.println("-----contenido del ArrayList eliminado-------");
        
        //para saber si esta vacio el LinkedList
        System.out.println("-----el ArrayList esta vacio?-------");
        System.out.println(listaArray.isEmpty());

        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        
        //Agregamos elementos al LinkedList
        listaLinked.add(new Persona ("Andres", 25));
        listaLinked.add(new Persona ("Andrea", 30));
        listaLinked.add(new Persona ("Alejandro", 80));
        
        //Removemos elementos al Linkedist, lo que se hace es establecer el nombre que se
        //desea eliminar en una variable, se establece un ciclo para iterar por la linkedList
        // y se da la condicion para eliminar el nodo de persona que coincida con el nombre.
        String nombreBorrar = "Andres";
        for(Persona personaeliminar : listaLinked) {
        	if(personaeliminar.getNombre().equals(nombreBorrar)) {
        		listaLinked.remove(personaeliminar);
        		break;
        	}
        }
        
        //verifico que si se haya eliminado
        System.out.println("-----LUEGO DE ELIMINAR LinkedList-------");
        
        for(Persona personaerecorrer2 : listaLinked) {
        	System.out.println(personaerecorrer2.getNombre());
        	System.out.println(personaerecorrer2.getEdad());
        }
        
        //para saber el tamaño de ArrayList       
        System.out.println("-----TAMAÑO DEL LINKEDLIST-------");
        System.out.println(listaLinked.size());	
        
        //PARA OBTENER EL PRIMER NODO DE LA LISTA Y EL ULTIMO DE LA LISTA ESTO SOLO PARA LINKEDLIST
        System.out.println("-----Primero de la LinkedList-------");
        System.out.println(listaLinked.getFirst().toString());	
        System.out.println("-----Ultimo de la LinkedList-------");
        System.out.println(listaLinked.getLast().toString());
        
        
        //para borrar toda el contenido del LinkedList       
        listaLinked.clear();
        System.out.println("-----contenido del ArrayList eliminado-------");
        
        //para saber si esta vacio el LinkedList
        System.out.println("-----el Linked List esta vacio?-------");
        System.out.println(listaLinked.isEmpty());
    }
}

