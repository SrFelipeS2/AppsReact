import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioOrdenNumerico {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int primerNumero = 0;
        int segundoNumero = 0;
        int max = 0;
        int min = 0;
        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.println("Ingrese el primer Numero entero: ");
                primerNumero = s.nextInt();
                System.out.println("Ingrese el segundo Numero entero: ");
                segundoNumero = s.nextInt();
                inputValido = true;
            } catch (InputMismatchException e){
                System.out.println("Error debe ingresar un número entero!");
                s.nextLine();
            }
        }
        max = (primerNumero > segundoNumero) ? primerNumero : segundoNumero;
        min = (primerNumero < segundoNumero) ? primerNumero : segundoNumero;

        System.out.println("Los Numeros ordenados de mayor a menor quedarian asi: " +"1) " + max + " 2) " + min);
    }
}
