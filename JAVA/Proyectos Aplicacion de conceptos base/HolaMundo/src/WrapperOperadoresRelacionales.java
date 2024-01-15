public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer numero1 = Integer.valueOf(1207);
        Integer numero2 = numero1;

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
//aqui da true por que es una instancia del mismo objeto asignada a dos variables
        System.out.println("Son el mismo Objeto? " + (numero1 == numero2));

        numero2 = 127;
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
//aqui da false debido a que son instancias de objeto diferentes, esto tiene una exception, si el valor no supera 127, java automaticamente convierte las clases a sus valores primitivos esto solo aplica al operador ==
        System.out.println("Son el mismo Objeto? " + (numero1 == numero2));
//aqui se compara el valor de cada instancia de los objetos comparados.
        System.out.println("tienen el mismo valor? " + (numero1.equals(numero2)));
//esta es otra manera de comparar los valores, convirtiendo wrapper a el valor primitivo de cada una de las variables
        System.out.println("tienen el mismo valor? " + (numero1.intValue() == numero1.intValue()));
//se puede trabajar con tipos de referencia o Wrapped o clase, si se usa cualquier operacion aritmetica como suma resta multiplicacion modulo y tambien si se usa  operadores relacionales mayor, menor la excepcion es el ==, automaticamente java pasa de referencia a primitivo
        boolean condicion = numero1 > numero2;
        //aqui por ejemplo java convierte a valores primitivos para comparar si numero1 es mayor a numero2
        System.out.println("condicion = " + condicion);
    }
}
