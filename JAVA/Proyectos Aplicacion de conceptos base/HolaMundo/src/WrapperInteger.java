public class WrapperInteger {
    public static void main(String[] args) {
        //auto box, toma un entero y lo convierte en la clase Integer, las dos maneras estan bien, la primera es mas explicita
        int enteroPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(enteroPrimitivo);
        Integer intObjeto2 = enteroPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //para hacerelo al contrario, toma el objeto y lo asigna a un entero primitivo, ambas son iguales, la segunda es mas explicita
        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);

        //conversion de un string a entero, solo aplica si el valor del string son numeros:
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //conversion de un entero primitivo a un short, esto lo hace siempre y cuando este dentro del rango del Short, 16 bits
        //en este ejemplo se pierde informacion por que intObjeto tiene un valor de 32768, supera el maximo de Short por lo tanto se pierde informacion.
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        //conversion de un entero a Byte, el maximo valor de un byte es 127 sucede lo mismo que un short
        Byte byteObjeto = intObjeto.byteValue();



    }
}
