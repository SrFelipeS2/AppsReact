public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Progrmaacion JAVA";
        String profesor = "Andres Guszman ";
        
        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println("numeroA+numeroB = " + detalle + (numeroA + numeroB));
        
        System.out.println(numeroA + numeroB + detalle);
        
        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
    }
}
