package HerenciaJerarquica;

class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void MostrarNombre() {
        System.out.println("el nombre de la mascota es:" + nombre);
    }

    public void hacerSonido() {
        System.out.println("Haciendo un sonido genérico");
    }
}
