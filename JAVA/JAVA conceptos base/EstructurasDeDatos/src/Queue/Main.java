package Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola cola = new Cola(4);
        cola.print();
        cola.remove();
        cola.insert("Hola");
        cola.insert(3);
        cola.insert("java");
        cola.insert(5);
        cola.insert(8);
        cola.remove();
        cola.remove();
       
	}

}
