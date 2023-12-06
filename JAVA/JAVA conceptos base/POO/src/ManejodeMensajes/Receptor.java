package ManejodeMensajes;

//Archivo: Receptor.java
public class Receptor implements ReceptorMensaje {
 @Override
 public void recibirMensaje(Mensaje mensaje) {
     System.out.println("Mensaje recibido: " + mensaje.getContenido());
 }
}
