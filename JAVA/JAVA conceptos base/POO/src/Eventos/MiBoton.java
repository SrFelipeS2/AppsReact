package Eventos;

//Archivo: MiBoton.java
import java.util.ArrayList;
import java.util.List;

public class MiBoton {
 private List<MiBotonListener> miBotonListeners = new ArrayList<>();

 public void addMiBotonListener(MiBotonListener listener) {
     miBotonListeners.add(listener);
 }

 public void clicEnMiBoton() {
     // Lógica específica del clic en el botón
     for (MiBotonListener listener : miBotonListeners) {
         listener.actionPerformed();
         listener.otroEventoPersonalizado();
     }
 }
}


