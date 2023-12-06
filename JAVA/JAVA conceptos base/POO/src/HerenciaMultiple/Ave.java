package HerenciaMultiple;

public class Ave {
	
	String nombre, color;
	
	public Ave() {}

	public Ave(String nombre, String color) {
		
		this.nombre = nombre;
		this.color = color;	
		
	}
	
	public void MostrarDatos() {
		
		System.out.println("Nombre del ave "+nombre+" Color del Ave "+color);
		
	}
	
}
