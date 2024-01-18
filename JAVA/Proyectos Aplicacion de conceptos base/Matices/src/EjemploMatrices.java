public class EjemploMatrices {
    public static void main(String[] args) {
        int[][] numeros = new int[2][4];

        numeros[0][0]=1;
        numeros[0][1]=2;
        numeros[0][2]=3;
        numeros[0][3]=4;
        numeros[1][0]=11;
        numeros[1][1]=12;
        numeros[1][2]=13;
        numeros[1][3]=14;
        System.out.println("Numeor de filas " + numeros.length );
        System.out.println("Numero de Columnas: " + numeros[0].length);
        System.out.println("Primer elemento de la MAtriz: " + numeros[0][0]);
        System.out.println("Ultimo elemento: " + numeros[numeros.length-1][numeros[1].length-1]);

        int numero1 = numeros[0][0];
        int numero2 = numeros[0][1];
        int numero3 = numeros[0][2];
        int numero4 = numeros[0][3];
        int numero5 = numeros[1][0];
        int numero6 = numeros[1][1];
        int numero7 = numeros[1][2];
        int numero8 = numeros[1][3];

        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        System.out.println("numero3 = " + numero3);
        System.out.println("numero4 = " + numero4);
        System.out.println("numero5 = " + numero5);
        System.out.println("numero6 = " + numero6);
        System.out.println("numero7 = " + numero7);
        System.out.println("numero8 = " + numero8);

    }
}
