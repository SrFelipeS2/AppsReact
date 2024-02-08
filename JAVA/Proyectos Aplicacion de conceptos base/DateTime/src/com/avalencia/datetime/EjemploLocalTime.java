package com.avalencia.datetime;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println(ahora.getHour());
        System.out.println(ahora.getMinute());
        System.out.println(ahora.getSecond());
        System.out.println(ahora.getNano());

        LocalTime seisConTreinta = LocalTime.of(18,30,59);
        System.out.println("seisConTreinta = " + seisConTreinta);
        
        LocalTime sieteConTreinta = seisConTreinta.plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreinta = " + sieteConTreinta);

        boolean esAnterior = LocalTime.of(18,30,59).isBefore(seisConTreinta);
        System.out.println("esAnterior = " + esAnterior);

        //Formatear Hora
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String ahoraformateada = seisConTreinta.format(df);
        System.out.println("ahoraformateada = " + ahoraformateada);
        //Otra manera de formatear
        ahoraformateada = df.format(ahora);
        System.out.println("ahoraformateada = " + ahoraformateada);
        //Hora Maxima, Hora Minima
        LocalTime max= LocalTime.MAX;
        LocalTime min= LocalTime.MIN;
        System.out.println(" max = " +  max);
        System.out.println(" min = " +  min);






    }

}
