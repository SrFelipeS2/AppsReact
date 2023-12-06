package HerenciaJerarquica;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases derivadas
        Animal miAnimal = new Animal("Animal Genérico");
        Perro miPerro = new Perro("Buddy");
        Gato miGato = new Gato("Whiskers");

        // Llamar a los métodos de las clases derivadas
        miAnimal.hacerSonido();
        miAnimal.MostrarNombre();// Salida: Haciendo un sonido genérico
        miPerro.hacerSonido();
        miPerro.MostrarNombre();// Salida: Guau, guau
        miGato.hacerSonido();
        miGato.MostrarNombre();// Salida: Miau, miau
    }
}

