import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String nombreFactura ;
        String descripcionFactura ;
        double precio1 = 0;
        double precio2 = 0;
        double suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el  Nombre de la Factura");
        nombreFactura = scanner.nextLine();
        System.out.println("Ingrese la descripcion de la Factura");
        descripcionFactura = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto");
        try{
            precio1 = scanner.nextDouble();
        }catch(Exception e){
            System.out.println("Error debe igresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("Ingrese el precio del segundo producto");
        try{
            precio2 = scanner.nextDouble();
        }catch(Exception e){
            System.out.println("Error debe igresar un numero entero");
            main(args);
            System.exit(0);
        }
        suma = (precio1 + precio2);

        System.out.println("La factura " + nombreFactura + descripcionFactura +  " tiene un total de: " + suma + " con un impuesto de: " + (suma * 0.19) + "y el monto después de impuesto es: " + (suma+(suma * 0.19)));
    }
}
/*
ESTA ES UNA SOLUCION MAS OPTIMA POR QUE HACE UN CICLO PARA NO TENER QUE INICIAR DE 0 Y LE PIDE AL USUARIO QUE INGRESE BIEN LOS NUMEROS DE LAS FACTURAS, PARA HACER BIEN LOS CALCULOS
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreFactura;
        String descripcionFactura;
        double precio1 = 0;
        double precio2 = 0;
        double suma = 0;

        System.out.println("Ingrese el Nombre de la Factura");
        nombreFactura = scanner.nextLine();

        System.out.println("Ingrese la descripción de la Factura");
        descripcionFactura = scanner.nextLine();

        // Ingresar el precio del primer producto
        precio1 = ingresarPrecio(scanner, "primer");

        // Ingresar el precio del segundo producto
        precio2 = ingresarPrecio(scanner, "segundo");

        suma = precio1 + precio2;

        System.out.println(nombreFactura + '\n' + descripcionFactura + '\n' +
                "El total de la factura sin Impuestos es: " + suma + '\n' +
                "El total de la factura con el 19% de Impuestos es: " + (suma+(suma * 0.19)));
    }

    private static double ingresarPrecio(Scanner scanner, String producto) {
        double precio = 0;

        while (true) {
            try {
                System.out.println("Ingrese el precio del " + producto + " producto");
                precio = scanner.nextDouble();
                break; // Si no hay excepción, salir del bucle
            } catch (Exception e) {
                System.out.println("Error: debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        return precio;
    }
}
*
* */