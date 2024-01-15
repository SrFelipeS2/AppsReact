public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "Programacion JAva";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esvacio2 = curso.isEmpty();
        System.out.println("esvacio2 = " + esvacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(!esBlanco){
            System.out.println("curso = " + curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }


    }
}
