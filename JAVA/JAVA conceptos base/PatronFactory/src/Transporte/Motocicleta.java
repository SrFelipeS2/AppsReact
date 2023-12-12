package Transporte;

public class Motocicleta implements Transporte {

	@Override
	public void Avanzar() {
		// TODO Auto-generated method stub
		System.out.println("La motocicleta esta avanzando");
	}

	@Override
	public void Detenerse() {
		// TODO Auto-generated method stub
		System.out.println("la Motocicleta se Detuvo");
	}

	@Override
	public String Tipo() {
		// TODO Auto-generated method stub
		return "Motocicleta";
	}

}
