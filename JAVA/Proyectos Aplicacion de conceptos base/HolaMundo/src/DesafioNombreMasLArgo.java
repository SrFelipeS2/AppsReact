import javax.swing.*;

public class DesafioNombreMasLArgo {
    public static void main(String[] args) {

        String nombreMaslargo = "";
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el primer Nombre, recuerde que debe tener tambien apellidos");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el segundo Nombre, recuerde que debe tener tambien apellidos");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese el tercer  Nombre, recuerde que debe tener tambien apellidos");
        char[] letrasNombre1 = dividirEnLetras(nombre1);
        char[] letrasNombre2 = dividirEnLetras(nombre2);
        char[] letrasNombre3 = dividirEnLetras(nombre3);

        nombreMaslargo = (nombre1.length() >= nombre2.length() && nombre1.length() >= nombre3.length()) ? nombre1 :
                         (nombre2.length() >= nombre1.length() && nombre2.length() >= nombre3.length()) ? nombre2 :
                         nombre3;

        JOptionPane.showMessageDialog(null, "El nombre mas largo es " + nombreMaslargo);

    }
    private static char[] dividirEnLetras(String nombre) {
        return nombre.trim().replaceAll("\\s", "").toCharArray();
    }
}
