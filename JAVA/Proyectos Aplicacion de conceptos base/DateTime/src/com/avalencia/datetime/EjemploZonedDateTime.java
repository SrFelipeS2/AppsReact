package com.avalencia.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZonedDateTime {
    public static void main(String[] args) {
        //Para crear una zona horaria debemos de tener la fecha actual
        LocalDateTime fechaLocal = LocalDateTime.now();
        //Despues de esto debemos de tener la zona Horaria especifica que deseamos incluir
        ZoneId newYork = ZoneId.of("America/New_York");
        //La Integramos a la fecha
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Zona Horaria de nueva York = " + zonaNy);
        ZoneId Mexico = ZoneId.of("America/Monterrey");
        //aqui queremos revisar la diferencia entre NY y Mexico (A partir del horario en Ny cual es el tiempo en Mexico)
        ZonedDateTime zonaMexico = zonaNy.withZoneSameInstant(Mexico);
        System.out.println("Zona Horaria de Mexico = " + zonaMexico);

        //Ahora si quiero viajar de NY a España y tenmos la fecha de partida a españa
        //y quiero saber la fecha de llegada pero en zona horaria de madrid

        System.out.println("Hora de partida nueva York = " + zonaNy);
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("hora de llegada  = " + zonaMadrid);

    }
}
