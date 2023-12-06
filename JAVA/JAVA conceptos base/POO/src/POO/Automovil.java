package POO;

public class Automovil{

// atributos	
	
 String marca;
 
 int modelo;
 
 int precio;

 int Caballosdefuerza;
 
 boolean estado = false;
 
 //Definicion de Constructor
 
 public Automovil() {
	 System.out.println("Se creo un objeto de tipo Automovil");
 }

 // Metodos
 
 public void Encendido() {
	 if(estado) {
		 System.out.println("el Automovil ya esta encendido");
	
	 }else {		 
		 System.out.println("el autoimovil esta encendido");
		 estado = true;
	 } 

 }

	

public void Apagado() {
	 if(estado) {
		 System.out.println("El automovil se apago correctamente");
		 estado = false;
	 }else {		 
		 System.out.println("el autoimovil ya esta Apagado");
	 } 
	
	
}

	

 public void Avanzar() {
	 if(estado) {
		 System.out.println("el automovil esta avanzando");
	 }else {		 
		 System.out.println("el autoimovil esta Apagado no puede avanzar");
	 } 
	 
	 

 }



	
}
