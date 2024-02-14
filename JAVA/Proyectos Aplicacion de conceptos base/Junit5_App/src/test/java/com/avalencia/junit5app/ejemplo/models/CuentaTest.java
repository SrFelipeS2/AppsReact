package com.avalencia.junit5app.ejemplo.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal(1000.2543684));
//        cuenta.setPersona("Andres");
        String esperado = "Andres";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("Andres"));
   }

   @Test
    void testSaldoCuenta(){
       Cuenta santiago = new Cuenta("Santiago", new BigDecimal("1000.12345"));
       assertEquals(1000.12345, santiago.getSaldo().doubleValue());
       assertFalse(santiago.getSaldo().compareTo(BigDecimal.ZERO) < 0);
       assertTrue(santiago.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    //TDD
    //La idea es crear una nueva prueba comparando los dos objetos cuenta
    //qe tnegan los mismos input es decir mismos datos y comparar si estas dos referencias son iguales
    //


    @Test
    void testReferenciaDeCuenta() {
        Cuenta cuentaJhon = new Cuenta("Jhin Doe", new BigDecimal("4900.997"));
        Cuenta cuentaJhon2 = new Cuenta("Jhin Doe", new BigDecimal("4900.997"));
    }
}