import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil chevrolet = new Automovil("Chevrolet","Onix 2024",Color.AZUL,2.000,40);
        //chevrolet.setCilindrada(2.000);
        //chevrolet.setColor("Blanco");
        //chevrolet.setFabricante("Chevrolet");
        //chevrolet.setModelo("Onix 2024");

        Automovil mazda = new Automovil("Mazda","Mazda CX5 2023",Color.AMARILLO,3.000, 40);
        //mazda.setCilindrada(3.000);
        //mazda.setColor("Negro");
        //mazda.setFabricante("Mazda");
        //mazda.setModelo("Mazda CX5 2023");
        System.out.println("mazda.fabricante " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "GTR 2023", Color.ROJO, 2.000, 80);


        Automovil nissan2 = new Automovil("Nissan", "GTR 2023", Color.ROJO, 2.000, 80);


        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("SOn Iguales? Comparacion de dos tipos de objetos diferentes= " + auto.equals(fecha));
        //esto imprime la informacion del vehiculo, tomando la clase padre toString y sobreescribiendola en Automovil.jaca
        System.out.println(nissan);
        //System.out.println(nissan.toString());
        System.out.println("SOn Iguales? validacion null en la clase = " + auto.equals(nissan2));

        System.out.println("SOn Iguales? = " + nissan.equals(nissan2));

        System.out.println(mazda.detalle());
        System.out.println(chevrolet.detalle());
        System.out.println(mazda.acelerar(300));
        System.out.println(mazda.frenar());
        System.out.println(chevrolet.acelerarFrenar(5000));
        System.out.println(nissan.detalle());


        //De esta manera se usa el principio de encapsulamiento, es la abstraccion que tiene o la implementacion que tiene el objeto en cada uno de sus metodos
        //es decir un objeto que utiliza otro objeto no sabe omo esta implementado ni le interesa, solo lo utiliza

        System.out.println("Para Chevrlet kilometraje por litro es de "  + chevrolet.calcularConsumo(300, 0.6) );

        System.out.println("Para Nissan kilometraje por litro es de "  + nissan.calcularConsumo(300, 60) );


    }
}
