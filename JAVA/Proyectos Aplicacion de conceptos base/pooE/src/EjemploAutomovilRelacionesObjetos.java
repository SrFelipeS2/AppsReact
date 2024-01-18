
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        //dentro de este3 bloque de codigo se evidencia una clara relacion de dependencias
        //por que si nos fijamos se instancian varios objetos con varias clases
        //como por ejemplo rueda, persona, motor, estas son varias instancias que se asocian a
        //Automovil, es decir que se relacionan objetos entre si, ademas de esto el metodo main
        //usa estos objetos y trabaja con ellos por lo tanto es una clara relacion de dependencias
        //en caso contrario si estuvieramos trabajando unicamente con atributos seria una relacion de
        //asociacion tomando el main como contexto.

        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        // subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[10];
        for(int i = 0; i < ruedasSub.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);

        Rueda[] ruedasMaz = new Rueda[5];
        for(int i = 0; i < ruedasMaz.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        //Aqui podemos ver como se llaman metodos "de marena recurtsiva", se invocan de manera encadenada
        //esto se debe a que en el metodo, el metodo retorna this, es decir se retorna a el mismo, es decir
        //retorna la misma instancia del objeto
        //esto facilita la recursividad
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));

        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.GASOLINA), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*System.out.println("Conductor subaru:" + subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }*/

    }
}
