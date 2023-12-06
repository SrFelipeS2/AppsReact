package ManejodeMensajes;

//Archivo: Main.java
public class Main {
 public static void main(String[] args) {
     Emisor emisor = new Emisor();
     Receptor receptor = new Receptor();
     ReceptorAlReves receptorAlReves = new ReceptorAlReves();
     ReceptorAlReves MiReceptor = new ReceptorAlReves();
     Receptor miReceptorNormal = new Receptor();

     // Agregar receptores al emisor
     emisor.agregarReceptor(receptor);
     emisor.agregarReceptorAlReves(receptorAlReves);
     emisor.agregarReceptorAlReves(MiReceptor);
     emisor.agregarReceptor(miReceptorNormal);

     // Enviar un mensaje desde el emisor
     emisor.enviarMensaje("Hola, este es un mensaje!");

     // Puedes agregar más receptores y enviar más mensajes según sea necesario
 }
}

