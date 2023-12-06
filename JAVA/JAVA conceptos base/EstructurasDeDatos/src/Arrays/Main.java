package Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definicion de Arreglos: coleccion de elementos
		//tipo[] nombredelarreglo = new tipo[tamañodelarreglo];
		int[] ColeccionNumerica = new int[10];
		
		
		
		//implementacion de arreglos con ciclo for
		for(int i = 0; i< 10; i ++ ) {
			var numero = (i+1)*10;
			ColeccionNumerica[i]= numero;
			System.out.println(ColeccionNumerica[i]);	
		}
	
		
		
	}

}
