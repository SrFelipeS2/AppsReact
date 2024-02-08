package com.avalencia.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {
        
        LocalDate fechaActual1 = LocalDate.now();
        System.out.println(fechaActual1);
        System.out.println("Dia "+ fechaActual1.getDayOfMonth());
        Month mes = fechaActual1.getMonth();
        System.out.println("Mes "+ mes);
        System.out.println("Numero del mes " + mes.getValue());
        System.out.println("Mes en español " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        System.out.println("Año "+ fechaActual1.getYear());
        System.out.println("Dia del año "+ fechaActual1.getDayOfYear());
        System.out.println("Era "+ fechaActual1.getEra());


        DayOfWeek diaSemana = fechaActual1.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia español: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "Es")));

        //El formato estandar para crear una fecha es Año-Mes-Dia
        LocalDate fechaActual2 = LocalDate.of(1998,07,9);
        System.out.println(fechaActual2);

        fechaActual2 = LocalDate.of(2020, Month.AUGUST, 11);
        System.out.println("fechaActual2 = " + fechaActual2);

        fechaActual2 = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual2 = " + fechaActual2);

        LocalDate diaDeManiaana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiaana = " + diaDeManiaana);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        LocalDate mesAnteriorMismoDiaMinus =LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDiaMinus = " + mesAnteriorMismoDiaMinus);

        DayOfWeek miercoles = LocalDate.parse("2024-02-07").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);

        int once = LocalDate.of(2024,02,11).getDayOfMonth();
        System.out.println("once = " + once);
        //para saber si es viciesto el año
        boolean esBiciesto = LocalDate.of(2023,01,01).isLeapYear();
        System.out.println("esBiciesto = " + esBiciesto);
        //podemos comparar fechas
        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);


    }

}
