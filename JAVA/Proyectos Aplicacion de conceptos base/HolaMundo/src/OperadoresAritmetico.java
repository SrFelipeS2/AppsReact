import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int i =4, j = 5, suma = i + j, resta = i-j, multiplicacion = i*j;
        float division = (float)i/(float)j;
        float resto = (float)i%(float)j;

        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + division);
        System.out.println("resto = " + resto);
        long numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 ==0){
            JOptionPane.showMessageDialog(null,"este numero: " + numero +" es par.");
        }else{
            JOptionPane.showMessageDialog(null,"este numero: " + numero +" No es par.");
        }

    }
}
