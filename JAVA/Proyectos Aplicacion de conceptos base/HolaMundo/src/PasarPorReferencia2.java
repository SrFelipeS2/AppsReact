class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Raul");
        System.out.println("iniciamos el metodo main");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("finalizamos metodo Main con los datos de la persona modificados! esto por que pasamos la referencia del objeto");

    }
    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Andres");
        System.out.println("finalizamos el metodo test");
    }

}

