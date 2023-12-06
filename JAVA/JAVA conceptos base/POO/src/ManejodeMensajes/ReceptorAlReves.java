package ManejodeMensajes;

//Archivo: ReceptorAlReves.java
public class ReceptorAlReves implements ReceptorMensajeAlReves {
 @Override
 public String recibirMensajeAlReves(String mensaje) {
     return new StringBuilder(mensaje).reverse().toString();
 }
}

