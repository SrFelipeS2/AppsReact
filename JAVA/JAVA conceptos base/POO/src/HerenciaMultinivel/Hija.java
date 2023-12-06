package HerenciaMultinivel;

public class Hija extends Padre {
	
	String Apellido;
	public Hija() {}

	public void setApellido(String Apellido) {	
		this.Apellido = Apellido;		
	}
	
	@Override
	public void setNombre(String Nombre) {	
		super.setNombre(Nombre);
				
	}
	
}
