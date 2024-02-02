package com.avalencia.desafioencuentratuvuelo.modelo;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Date;

public class Vuelo implements Comparable<Vuelo>{
    private String vuelo;
    private String origen;
    private String destino;
    private Date fechaLlegadaTiempoDeLlegada;

    private Integer numeroDePasajeros;

    public Vuelo() {
    }

    public Vuelo(String vuelo, String origen, String destino, Date fechaLlegadaTiempoDeLlegada, Integer numeroDePasajeros) {
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegadaTiempoDeLlegada = fechaLlegadaTiempoDeLlegada;
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public String getVuelo() {
        return vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaLlegadaTiempoDeLlegada() {
        return fechaLlegadaTiempoDeLlegada;
    }

    public Integer getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "vuelo='" + vuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", numeroDePasajeros=" + numeroDePasajeros +
                '}';
    }


    @Override
    public int compareTo(Vuelo o) {
        if (this.fechaLlegadaTiempoDeLlegada == null || o.fechaLlegadaTiempoDeLlegada == null){
            return 0;
        }
        return this.fechaLlegadaTiempoDeLlegada.compareTo(o.fechaLlegadaTiempoDeLlegada);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo1 = (Vuelo) o;
        return Objects.equals(vuelo, vuelo1.vuelo) && Objects.equals(origen, vuelo1.origen) && Objects.equals(destino, vuelo1.destino) && Objects.equals(fechaLlegadaTiempoDeLlegada, vuelo1.fechaLlegadaTiempoDeLlegada) && Objects.equals(numeroDePasajeros, vuelo1.numeroDePasajeros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vuelo, origen, destino, fechaLlegadaTiempoDeLlegada, numeroDePasajeros);
    }
}
