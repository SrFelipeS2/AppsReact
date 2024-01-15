public class PasarPorReferencia {
    public static void main(String[] args) {
        //toda variable primitiva se pasa por valor
        int[]  edad = {10,11,12};

        System.out.println(" iniciamos en el metodo main");
        for(int i = 0; i < edad.length ; i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de invocar al metodo test");

        test(edad);

        System.out.println("Despues de invocar al metodo test");
        for(int i = 0; i < edad.length ; i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("finalizael metodo main");

    }

    public static void test(int[] edad){
        System.out.println("iniciamos el metodo test");
        for(int i = 0; i < edad.length ; i++){
            edad[i] = edad[i] +20;
        }
        System.out.println("Finaliza el metodo test ");

    }
}
