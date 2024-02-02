package com.avalencia.desafioencuentratuvuelo.ejemplovuelo;

import com.avalencia.desafioencuentratuvuelo.modelo.Vuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

public class EjemploVuelo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("E dd MMM yyyy\tHH:mm 'hrs'");
        Set<Vuelo> vuelos = new TreeSet<>();

        try {
            vuelos.add(new Vuelo("AAL933", "New York", "Santiago", formatter.parse("Lun 29 Ago 2021\t05:39 hrs"), 62));
            vuelos.add(new Vuelo("LAT755", "Sao Paulo", "Santiago", formatter.parse("Lun 31 Ago 2021\t04:45 hrs"), 47));
            vuelos.add(new Vuelo("SKU621", "Rio De Janeiro", "Santiago", formatter.parse("Lun 30 Ago 2021\t16:00 hrs"), 52));
            vuelos.add(new Vuelo("DAL147", "Atlanta", "Santiago", formatter.parse("Lun 29 Ago 2021\t13:22 hrs"), 59));
            vuelos.add(new Vuelo("AVA241", "Bogota", "Santiago", formatter.parse("Lun 31 Ago 2021\t14:05 hrs"), 25));
            vuelos.add(new Vuelo("AMX10", "Mexico City", "Santiago", formatter.parse("Lun 31 Ago 2021\t05:20 hrs"), 29));
            vuelos.add(new Vuelo("IBE6833", "Londres", "Santiago", formatter.parse("Lun 30 Ago 2021\t08:45 hrs"), 55));
            vuelos.add(new Vuelo("LAT2479", "Frankfurt", "Santiago", formatter.parse("Lun 29 Ago 2021\t07:41 hrs"), 51));
            vuelos.add(new Vuelo("SKU803", "Lima", "Santiago", formatter.parse("Lun 30 Ago 2021\t10:35 hrs"), 48));
            vuelos.add(new Vuelo("LAT533", "Los Ángeles", "Santiago", formatter.parse("Lun 29 Ago 2021\t09:14 hrs"), 59));
            vuelos.add(new Vuelo("LAT1447", "Guayaquil", "Santiago", formatter.parse("Lun 31 Ago 2021\t08:33 hrs"), 31));
            vuelos.add(new Vuelo("CMP111", "Panama City", "Santiago", formatter.parse("Lun 31 Ago 2021\t15:15 hrs"), 29));
            vuelos.add(new Vuelo("LAT705", "Madrid", "Santiago", formatter.parse("Lun 30 Ago 2021\t08:14 hrs"), 47));
            vuelos.add(new Vuelo("AAL957", "Miami", "Santiago", formatter.parse("Lun 29 Ago 2021\t22:53 hrs"), 60));
            vuelos.add(new Vuelo("ARG5091", "Buenos Aires", "Santiago", formatter.parse("Lun 31 Ago 2021\t09:57 hrs"), 32));
            vuelos.add(new Vuelo("LAT1283", "Cancún", "Santiago", formatter.parse("Lun 31 Ago 2021\t04:00 hrs"), 35));
            vuelos.add(new Vuelo("LAT579", "Barcelona", "Santiago", formatter.parse("Lun 29 Ago 2021\t07:45 hrs"), 61));
            vuelos.add(new Vuelo("AAL945", "Dallas-Fort Worth", "Santiago", formatter.parse("Lun 30 Ago 2021\t07:12 hrs"), 58));
            vuelos.add(new Vuelo("LAT501", "París", "Santiago", formatter.parse("Lun 29 Ago 2021\t18:29 hrs"), 49));
            vuelos.add(new Vuelo("LAT405", "Montevideo", "Santiago", formatter.parse("Lun 30 Ago 2021\t15:45 hrs"), 39));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Organizado por Orden de llegada: ");
        for (Vuelo v : vuelos) {
            System.out.println(v);
        }

        System.out.println("Obtengo el ultimo vuelo en llegar: ");
        Vuelo ultimoVueloEnLlegar = null;
        ultimoVueloEnLlegar = ((TreeSet<Vuelo>) vuelos).last();
        if (ultimoVueloEnLlegar != null) {
            System.out.println("Último vuelo en llegar: " + ultimoVueloEnLlegar);
        } else {
            System.out.println("No hay vuelos registrados.");
        }
        System.out.println("Obtengo el vuelo con el menor numero de pasajeros: ");
        Vuelo vueloMenorPasajeros = null;
        for (Vuelo vuelo : vuelos) {
            if (vueloMenorPasajeros == null || vuelo.getNumeroDePasajeros() < vueloMenorPasajeros.getNumeroDePasajeros()) {
                vueloMenorPasajeros = vuelo;
            }
        }
        if (vueloMenorPasajeros != null) {
            System.out.println("Vuelo con menor número de pasajeros: " + vueloMenorPasajeros);
        } else {
            System.out.println("No hay vuelos registrados.");
        }


    }

}
