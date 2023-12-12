package Transporte;

public class Main {

	public static void main(String[] args) {
		Transporte t1 = Fabrica.Construir("Motocicleta");		
		t1.Avanzar();
		t1.Detenerse();
		System.out.println(t1.Tipo());
		
	}

}
