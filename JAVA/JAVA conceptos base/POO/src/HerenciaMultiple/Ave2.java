package HerenciaMultiple;

public class Ave2 extends Ave implements Cresta {
	
	public Ave2( String nombre, String color) {
		super(nombre, color);
	}
	
	@Override
	public void MostrarDatos() {
		
		System.out.println("Nombre del ave "+nombre+" Color del Ave "+color);
		
	}
	
	@Override
	public void ColorCresta (String colorCresta) {
		
		System.out.println( "Color de la cresta " + colorCresta);
		
	}
}
