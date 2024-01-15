public class ArgumentosLineaDeComando {
    public static void main(String[] args) {
        if(args.length == 0){
            System.err.println("Debe Ingrear argumentos");
            System.exit(-1);
        }
        for(int i = 0; i<args.length; i++){
            System.out.println("Arguimento n° = " + i + ": " + args[i]);
        }
    }
}
