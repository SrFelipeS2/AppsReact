public class EjemploMatricesbuscar {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                {23,34,66},
                {32,43,56},
                {53,44,86},
        };

        int elementoBuscar =66;
        boolean encontrado =  false;
        int i ;
        int j =0;
        buscar: for (i=0; i < matrizDeEnteros.length; i++) {
            for (j=0; j < matrizDeEnteros[i].length; j++) {
                if(matrizDeEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado){
            System.out.println("Hemos encontrado el numero " +elementoBuscar+ " en las coordenadas:  " +i +" , "+ j);
        }else{
            System.out.println(elementoBuscar + " No se encontro en la matiriz");
        }
    }
}
