package HerenciaMultinivel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Crear una instancia de la clase Nieta
        Nieta nieta = new Nieta();

        // Establecer valores usando los métodos de las clases Padre, Hija y Nieta
        nieta.setNombre("NombreNieta");
        nieta.setApellido("ApellidoNieta");

        // Mostrar los valores
        System.out.println("Nombre: " + nieta.Nombre);
        System.out.println("Apellido: " + nieta.Apellido);
	

}
}