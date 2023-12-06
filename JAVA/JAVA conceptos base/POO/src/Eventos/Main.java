package Eventos;

//Archivo: Main.java
public class Main {
 public static void main(String[] args) {
     MiBoton miBoton = new MiBoton();
     MiClase miClase = new MiClase();

     // Registrar MiClase como oyente en MiBoton
     miBoton.addMiBotonListener(miClase);

     // Simular un clic en el botón
     miBoton.clicEnMiBoton();
 }
}

