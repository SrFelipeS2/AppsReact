package TreCapas;

//ApplicationLayer.java
public class ApplicationLayer {
 public static void processInput(String input) {
     System.out.println("Mensaje recibido: " + input);

     // Llamada a la capa de persistencia
     PersistenceLayer.saveMessage(input);
 }
}
