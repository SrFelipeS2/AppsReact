package es.dsrroma.school.java.domina1.video01_06;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares
{
    public static void encaja(String patron, String texto) {
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        boolean encuentra = matcher.find();
        boolean encaja = matcher.matches();

        System.out.println("Patron: " + patron + " - Texto: " + texto);
        System.out.println("¿Encuentra? " + (encuentra ? "Si" : "No"));
        System.out.println("¿Encaja? " + (encaja ? "Si" : "No"));
        System.out.println();
    }
    
    public static void contar(String patron, String texto) {
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        int cont = 0;
        while (matcher.find()) {
            cont++;
        }
        System.out.println("El patron " + patron + " aparece " 
            + cont + " veces en el texto " + texto); 
    }
    
    public static void main(String[] args) {
        encaja("a", "hola");
        encaja("h.+a", "hola");
        encaja("h.+a", "ha");
        encaja("h.*a", "ha");
        encaja("a*", "zoo");
        encaja("a+", "zoo");
        encaja("\\d{5}", "1234");
        encaja("\\d{5}", "12345");
        encaja("\\d{5}", "123456");
        encaja("\\d{5}", "12345z");
        encaja("\\d{5}", "12z34");
        
        contar("\\d{5}", "Calle Nueva 123, 4º 5ª, 67890 Villanueva");
        contar("\\d{5}", "Calle Nueva 12345, Apt 86246, 67890 Villanueva");
        contar("\\d{5}", "Calle Nueva 123, 4º 5ª, 6780 Villanueva");
    }
}
