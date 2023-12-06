package HerenciaSimple;

public class Main {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		//esto es un ejemplo de Herencia Simple en JAVA
		Transporte trans = new Transporte();
		Aeronave avion = new Aeronave();
		avion.avanzar();
		Automovil ferrari = new Automovil();
		ferrari.avanzar();

	}

}
