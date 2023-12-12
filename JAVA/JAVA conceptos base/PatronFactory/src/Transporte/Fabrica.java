package Transporte;

public class Fabrica {
	
	public static Transporte Construir(String Tipo) {
		
		switch(Tipo) {
		 	case "Automovil":
		 		return new Automovil();
		 	case "Motocicleta":
		 		return new Motocicleta();
		 	default:
		 		System.out.println("No se encentra dicho objeto en la fabrica");
		 		return null;
		}
		
	}

}
