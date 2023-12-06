package Pila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila pila1 = new Pila();
		
		pila1.push(4.3);
		pila1.push(true);
		pila1.push(986522140);
		pila1.push("hola");
		
		
		while (!pila1.empty()) {
			System.out.println(pila1.pop());			
		}
		
	}

	

}
