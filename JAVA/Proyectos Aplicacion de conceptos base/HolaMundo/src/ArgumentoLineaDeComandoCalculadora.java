public class ArgumentoLineaDeComandoCalculadora {

    public static void main(String[] args) {
        if(args.length !=3){
            System.out.println("Por favor ingresar una operacion (suma, resta, multiplicacion, division) y dos numeros enteros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        }catch (Exception e){
            System.err.println("Debe ingresar numeros enteros");
            System.exit(-1);
        }

        switch (operacion.toLowerCase()){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                if (b==0){
                    System.err.println("No Se puede dividir entre 0");
                    System.exit(-1);
                }
                resultado = (double) a/(double) b;
                break;
            default:
                resultado = a+b;
        }

        System.out.println("El Resultaod de la operacion: "  + operacion + " es " + resultado);
    }
}
