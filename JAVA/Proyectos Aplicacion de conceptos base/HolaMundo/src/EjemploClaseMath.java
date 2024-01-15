public class EjemploClaseMath {
    public static void main(String[] args) {

        /*La clase Math es muy parecida a System en cuanto a que no se puede instanciar, son solamente metodos estaticos
        * esto quiere decir que solamente se invocan mediante Math.nombredelmetodoainvoar() esta clase igual que la de System no pueden
        * tener herencia  */

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        double redondeoHaciaArriba = Math.ceil(3.5);
        System.out.println("redondeoHaciaArriba = " + redondeoHaciaArriba);

        double redondeHaciaAbajo = Math.floor(3.5);
        System.out.println("redondeHaciaAbajo = " + redondeHaciaAbajo);

        double redondeoAutomatico = Math.round(Math.PI);
        System.out.println("redondeoAutomatico = " + redondeoAutomatico);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        //este se utiliza para convertir de radianes a grados 1 radian equivale a 57.2958 grados
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir a grados = " + grados);

        double radianes = Math.toRadians(90);
        System.out.println("radianes = " + radianes);

        //funciones de trigonometria coseno seno
        //seno y coseno recibe un doble en radianes no en grados
        System.out.println("Seno de 90 = " + Math.sin(radianes));
        System.out.println("coseno de 90 = " + Math.cos(radianes));
        
        radianes = Math.toRadians(0.00);
        System.out.println("Coseno de 180 = " + Math.cos(radianes));


    }

}
