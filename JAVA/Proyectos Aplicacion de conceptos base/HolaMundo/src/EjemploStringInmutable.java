public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion JAVA";
        String profesor = "Andres Guszman ";
        
        String resutlado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resutlado = " + resutlado);
        System.out.println(curso == resutlado);
        
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);  
        String resultado3 = resutlado.replace("a","A");
        System.out.println("resutlado3 = " + resultado3);
    }
}
