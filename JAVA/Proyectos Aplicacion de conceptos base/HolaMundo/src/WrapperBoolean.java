public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;
        //booleano primitivo
        boolean primitivoBoolean =  num1 > num2;
        // booleano de referencia

        //manera de declarar implicita
        Boolean objetoBoolean = primitivoBoolean;

        //manera de declara explicita
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean2);

        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));

    }
}
