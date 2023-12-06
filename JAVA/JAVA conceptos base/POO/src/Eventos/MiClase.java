package Eventos;

//Archivo: MiClase.java
public class MiClase implements MiBotonListener {
 @Override
 public void actionPerformed() {
     System.out.println("Evento de clic en MiBoton");
 }

 @Override
 public void otroEventoPersonalizado() {
     System.out.println("Otro evento personalizado en MiBoton");
 }
}
