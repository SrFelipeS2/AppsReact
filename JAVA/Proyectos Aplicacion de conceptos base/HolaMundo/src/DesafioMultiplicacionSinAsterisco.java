import java.util.Scanner;

public class DesafioMultiplicacionSinAsterisco {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = multiplicarSinOperador(num1, num2);

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static int multiplicarSinOperador(int a, int b) {
        int resultado = 0;
        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 0; i < Math.abs(a); i++) {
            resultado += b;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            resultado = -resultado;
        }

        return resultado;
    }
}


