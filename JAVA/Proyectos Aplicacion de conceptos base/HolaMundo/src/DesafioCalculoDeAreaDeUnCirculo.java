import java.util.Scanner;

public class DesafioCalculoDeAreaDeUnCirculo {

    //area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el Radio del circulo");
        double radio = s.nextDouble();
        double area = (Math.PI*Math.pow(radio,2));
        System.out.println("El Area del circulo es:  " + area + "m2");
    }

}
