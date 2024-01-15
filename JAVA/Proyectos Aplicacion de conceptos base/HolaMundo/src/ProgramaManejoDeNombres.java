import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String primeraPersona;
        String segundaPersona;
        String tereraPersona;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el  Nombre de la primera Persona");
        primeraPersona = scanner.nextLine();
        primeraPersona = (primeraPersona.substring(1,2).toUpperCase().concat(".").concat(primeraPersona.substring(primeraPersona.length()-2)));
        System.out.println("Ingrese el  Nombre de la segunda Persona");
        segundaPersona = scanner.nextLine();
        segundaPersona = (segundaPersona.substring(1,2).toUpperCase().concat(".").concat(segundaPersona.substring(segundaPersona.length()-2)));
        System.out.println("Ingrese el  Nombre de la tercera Persona");
        tereraPersona = scanner.nextLine();
        tereraPersona = (tereraPersona.substring(1,2).toUpperCase().concat(".").concat(tereraPersona.substring(tereraPersona.length()-2)));
        String formateoNombres = primeraPersona + "_" + segundaPersona + "_" + tereraPersona;
        System.out.println("formateoNombres = " + formateoNombres);
    }
}

/*import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}*/