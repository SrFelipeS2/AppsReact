package HerenciaJerarquica;

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    public void MostrarNombre() {
        super.MostrarNombre();
    }
    	
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau, miau");
    }
}

