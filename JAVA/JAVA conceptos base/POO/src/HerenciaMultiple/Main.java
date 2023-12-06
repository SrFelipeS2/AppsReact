package HerenciaMultiple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ave a = new Ave("Paloma","Blanca");
		Ave1 a1 = new Ave1 ();
		Ave2 a2 = new Ave2("gallo Cubano", "rojo");
		a.MostrarDatos();
		a1.MostrarDatos();
		a2.MostrarDatos();
		
		a2.ColorCresta("Azul");

	}

}
