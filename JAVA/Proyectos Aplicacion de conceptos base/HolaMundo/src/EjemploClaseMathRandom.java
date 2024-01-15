import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        //esta clase genra un numero aleatorio decimal entre 0 y 1, pero el 1 no se icluye

        String[] colores = {"Azul", "Amarillo", "Rojo", "Violeta", "Verde", "Magenta"};
        double random = Math.random();
        System.out.println("random entre 0 y 1 = " + random);

        // si deseo obtener un numero aleatorio entre dos valores, tener en cuenta que el 7 no se incluye
        random *= colores.length;
        System.out.println("random entre 0 y 7 = " + random);
        random = Math.floor(random);
        System.out.println("random entre 0 y 7 redondeado = " + random);

        System.out.println("colores[(int)random] = " + colores[(int)random]);

        //esta es la clase que usa Math para generar loas valores aleatorios, vamos a implementarla desde sus raices
        //la ventaja es que es mas flexible y tiene mas variedad para generar numero enteros y decimales aleatorios.
        //por que el objeto no solo genera un double, sino tambien un entero, float y long.
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt clase Random = " + randomInt);
        long randomLong = randomObj.nextLong();
        System.out.println("randomLong clase Random = " + randomLong);
        //Si quiero establecer un limite para generar el valor alatorio
        randomInt = randomObj.nextInt(7);
        System.out.println("randomInt = " + randomInt);
        //Si quiero establecer un rango para generar el valor alatorio por ejemplo desde 15 hasta 25
        randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);
        //extrayendo un color aleatorio del arreglo
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomLong = " + randomLong);
        System.out.println("color aleatorio colores[randomInt] = " + colores[randomInt]);


    }
}
