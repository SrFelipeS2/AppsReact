import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //estructura del operador ternario
        //variable = condicion ? si es verdadero devuelve un valor : devuelve otro valor
        String variable = 79 == 7 ? "si es verdadero " : "es falso";
        System.out.println("variable = " + variable);
        
        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double historia = 0.0;
        double ciencia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa la nota de matematicas entre 2.0 - 7.0: ");
        matematicas = s.nextDouble();

        System.out.println("Ingresa la nota de historia entre 2.0 - 7.0: ");
        ciencia = s.nextDouble();

        System.out.println("Ingresa la nota de ciencia entre 2.0 - 7.0: ");
        historia = s.nextDouble();

        promedio = (matematicas + historia + ciencia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Denegado";
        System.out.println("estado = " + estado);
        
    }
}
