package MetodosYAtributos;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase MiClase
        MiClase miObjeto = new MiClase();

        // Llamar al método sin retorno y sin parámetros
        miObjeto.metodoEjemplo();

        // Llamar al método con retorno y parámetros
        int resultadoSuma = miObjeto.suma(5, 3);
        System.out.println("La suma es: " + resultadoSuma);
    }
}
