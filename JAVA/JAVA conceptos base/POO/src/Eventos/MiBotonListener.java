package Eventos;

/*Interfaz de Escucha: MiBotonListener es una interfaz que sirve como contrato 
 * para los objetos que desean "escuchar" eventos generados por un botón. Esta 
 * interfaz define dos métodos: actionPerformed y otroEventoPersonalizado. Cualquier 
 * clase que implemente esta interfaz debe proporcionar una implementación para estos 
 * métodos.
 *  */
public interface MiBotonListener {
 void actionPerformed();
 void otroEventoPersonalizado();
}
