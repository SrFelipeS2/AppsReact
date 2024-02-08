package com.avalencia.desafiocalcularfecha;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DesafioCalcularFecha {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento en el formato dd-MMMM-yyy por ejemplo 12-02-2020");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        String fechaNacimiento = s.nextLine();

        LocalDate fechaNacimientoConvertida = LocalDate.parse(fechaNacimiento, f);

        Period edad = Period.between(fechaNacimientoConvertida, fechaActual);
        System.out.println("edad = " + edad.getYears());

        s.close();
    }
}
