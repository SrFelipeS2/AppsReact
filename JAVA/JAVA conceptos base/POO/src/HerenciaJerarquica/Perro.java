package HerenciaJerarquica;

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    
    public void MostrarNombre() {
        super.MostrarNombre();
    }
    	
    @Override
    public void hacerSonido() {
        System.out.println("Guau, guau");
    }
}

