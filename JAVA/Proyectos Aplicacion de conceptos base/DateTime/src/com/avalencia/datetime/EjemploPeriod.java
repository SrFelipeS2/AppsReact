package com.avalencia.datetime;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2011,9,23);
        LocalDate fecha2 = LocalDate.of(2020,11,25);
        LocalDate fecha3 = fecha2.withMonth(12);
        fecha3 = fecha3.withDayOfMonth(28);
        Period period = Period.between(fecha1, fecha3);

        System.out.println("period = " + period);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses, %d dias",
                fecha1, fecha3, period.getYears(), period.getMonths(), period.getDays()
        );

    }
}
