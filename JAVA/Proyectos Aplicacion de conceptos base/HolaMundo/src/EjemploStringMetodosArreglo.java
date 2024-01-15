public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {        
        String trabalengua = "Trabalenguas";
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());

        char[] arreglo = trabalengua.toCharArray();
        for(int i=0 ; i < arreglo.length ; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        System.out.println("trabalengua.split(\"a\") = " + trabalengua.split("a"));

        String[] arreglo2 = trabalengua.split("a");
        for(int j = 0 ; j < arreglo2.length ; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.XML";

        String[] archivoArr = archivo.split("\\.");
        for(int k = 0 ; k < archivoArr.length ; k++){
            System.out.println(archivoArr[k]);
        }
        System.out.println("Exrension archivo[archivoArr.length-1] = " + archivoArr[archivoArr.length-1]);
    }
}
