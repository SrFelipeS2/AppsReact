import java.util.Scanner;

public class DesafioNumeroMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("cual es la cantidad de numeros a compara?");
        int iteracion = s.nextInt();
        int[] numeros = new int[iteracion];

        System.out.println("ingrese los valores a comparar");
        numeros[0] = s.nextInt();
        int numeroMenor = numeros[0];

        for (int i = 1; i < iteracion ; i++){
            numeros[i] = s.nextInt();
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }

        if(numeroMenor < 10 ){
            System.out.println("El número menor es menor que 10! = " + numeroMenor);
        }else{
            System.out.println("el numero menor es igual o mayor que 10! = " + numeroMenor);
        }

    }
}
