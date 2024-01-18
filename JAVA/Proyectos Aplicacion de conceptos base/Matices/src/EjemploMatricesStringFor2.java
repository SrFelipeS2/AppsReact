public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe","Juana"},{"Felipe","Andres"},{"Aleja", "Mateo"}};

        for (String[] fila :nombres){
            for (String nombre : fila){
                System.out.print(nombre + "\t" );
            }
            System.out.println();
        }
    }
}
