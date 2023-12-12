package Transporte;

public class Automovil implements Transporte {

	@Override
	public void Avanzar() {
		// TODO Auto-generated method stub
		System.out.println("El Automovil esta avanzando");
		
	}

	@Override
	public void Detenerse() {
		// TODO Auto-generated method stub
		System.out.println("El Automovil se Detuvo");
	}

	@Override
	public String Tipo() {
		// TODO Auto-generated method stub
		return "Automovil";
	}
	
	
}
