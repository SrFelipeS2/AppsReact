public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "asfk´{VM´{PGMA{ÑLD,FMPEOTHMA";

        Integer num = 876;

        Boolean b1 = texto instanceof String;

        System.out.println("b1 = " + b1);
        b1 = texto instanceof Object;
        System.out.println("b1 object = " + b1);
        b1 = num instanceof Integer;
        System.out.println("b1 Integer = " + b1);
        b1 = num instanceof Number;
        System.out.println("b1 Long = " + b1);
        b1 = num instanceof Object;
        System.out.println("b1 num Object = " + b1);
        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("b1  = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 boolean = " + b1);

    }
}
