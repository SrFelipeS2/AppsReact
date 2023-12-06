package ManejodeMensajes;
//Archivo: Emisor.java
import java.util.ArrayList;
import java.util.List;

public class Emisor {
 private List<ReceptorMensaje> receptoresMensaje = new ArrayList<>();
 private List<ReceptorMensajeAlReves> receptoresMensajeAlReves = new ArrayList<>();

 public void agregarReceptor(ReceptorMensaje receptor) {
     receptoresMensaje.add(receptor);
 }

 public void agregarReceptorAlReves(ReceptorMensajeAlReves receptor) {
     receptoresMensajeAlReves.add(receptor);
 }

 public void enviarMensaje(String contenido) {
     Mensaje mensaje = new Mensaje(contenido);

     for (ReceptorMensaje receptor : receptoresMensaje) {
         receptor.recibirMensaje(mensaje);
     }

     for (ReceptorMensajeAlReves receptor : receptoresMensajeAlReves) {
         String mensajeAlReves = receptor.recibirMensajeAlReves(contenido);
         System.out.println("Mensaje al revés recibido: " + mensajeAlReves);
     }
 }
}
