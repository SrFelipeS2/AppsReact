import java.util.Scanner;

public class DesafioSistemaReportesNotas {
    public static void main(String[] args) {
        /*
        * Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
        * Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
        * */
        double[] notas = new double[10];
        double[] notasMayoresDe5 = new double[10];
        double[] notasMenoresDe4 = new double[10];
        double sumatoriaTotalDeNotasMayoresA5 = 0;
        double sumatoriaTotalDeNotasMenoresA4 = 0;
        double sumatoriaTotalDeNotas = 0;
        int cantidadDeNotasMenoresIgualesA4 = 0;
        int cantidadDeNotasMayoresIgualesA5 = 0;

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota #" + (i + 1) + " Recuerde que debe ser de 1 a 7 y puede contener decimales");

            // Validación de la nota ingresada
            double notaIngresada;
            do {
                System.out.print("Nota: ");
                notaIngresada = s.nextDouble();
                if (notaIngresada < 0 || notaIngresada > 7) {
                    System.out.println("Ingrese una nota válida entre 1 y 7.");
                }
            } while (notaIngresada < 0 || notaIngresada > 7);

            // Salir del bucle si una nota es 0
            if (notaIngresada == 0) {
                System.out.println("Programa finalizado debido a una nota de 0.");
                break;
            }

            notas[i] = notaIngresada;
            sumatoriaTotalDeNotas += notas[i];
        }

        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 5) {
                notasMayoresDe5[i] = notas[i];
                sumatoriaTotalDeNotasMayoresA5 += notas[i];
                cantidadDeNotasMayoresIgualesA5++;
            } else if (notas[i] <= 4) {
                notasMenoresDe4[i] = notas[i];
                sumatoriaTotalDeNotasMenoresA4 += notas[i];
                cantidadDeNotasMenoresIgualesA4++;
            }
        }

        System.out.println("El promedio de las notas mayores a 5 es: " + (sumatoriaTotalDeNotasMayoresA5 / cantidadDeNotasMayoresIgualesA5));
        System.out.println("El promedio de las notas menores o iguales a 4 es: " + (sumatoriaTotalDeNotasMenoresA4 / cantidadDeNotasMenoresIgualesA4));
        System.out.println("La cantidad de Notas es: " + notas.length);
        System.out.println("El promedio total de Notas es: " + (sumatoriaTotalDeNotas / notas.length));

    }
}






