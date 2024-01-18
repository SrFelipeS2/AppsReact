import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadTanqueEstatico(45);

        Automovil chevrolet = new Automovil("Chevrolet","Onix 2024",Color.AMARILLO,2.000,40);

        Automovil mazda = new Automovil("Mazda","Mazda CX5 2023",Color.AZUL,3.000, 40);

        System.out.println("mazda.fabricante " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "GTR 2023", Color.NARANJO, 2.000, 80);

        Automovil nissan2 = new Automovil("Nissan", "GTR 2023", Color.ROJO, 2.000, 80);

       Automovil.getColorPatente().getColor();
       // Automovil auto = new Automovil();

        System.out.println(chevrolet.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());
       // System.out.println(auto.detalle());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300,50));



    }
}
