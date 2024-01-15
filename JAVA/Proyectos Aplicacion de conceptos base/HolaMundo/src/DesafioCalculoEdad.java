import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DesafioCalculoEdad {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        System.out.println("fecha2 = " + fechaActual);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento");
        try {
            Date fechaDeNacimiento = format.parse(s.next());
            long diferenciaEnMilisegundos = (long) ((fechaActual.getTime() - fechaDeNacimiento.getTime()));
            System.out.println("diferenciaEnMilisegundos = " + diferenciaEnMilisegundos);
            long diferenciaEnDias = diferenciaEnMilisegundos / 86400000;
            System.out.println("diferenciaEnDias = " + diferenciaEnDias);
            int edad = (int)(diferenciaEnDias/365);
            System.out.println("Tu edad es: " + edad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

