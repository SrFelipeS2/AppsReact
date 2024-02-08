package com.avalencia.recursividad;

import com.avalencia.recursividad.model.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente casePc  = new Componente("Ncore 100 Max");
        Componente fuentePc  = new Componente("Fuente De Poder Corsair rm850W");
        Componente placaMadrePc  = new Componente("Asus Rog-STRIX X670E-I Gaming WIFI");
        Componente procesadorPc  = new Componente("Ryzen 7 7800X3D ");
        Componente refrigeracionprocesadorPc  = new Componente("Noctua NH-D15 chromax.Black, Dual-Tower CPU Cooler (140mm, Black)");
        Componente memoriaRamPC  = new Componente("Corsair DOMINATOR® PLATINUM RGB 32GB DDR5 DRAM 6800MT/s ");
        Componente placaVideoPc  = new Componente("GeForce RTX™ 4080 SUPER 16G SUPRIM X");
        Componente placaVideoRam = new Componente("8 gb gddr6X");
        Componente placaVideoRam2 = new Componente("8 gb gddr6X");
        Componente placaVideoVentiladores = new Componente("winforce");
        Componente placaVideoVentiladores1 = new Componente("winforce");
        Componente placaVideoVentiladores2 = new Componente("winforce");
        Componente almacenamientoPc  = new Componente("Crucial T700 2TB Gen5 NVMe M.2 SSD - Up to 12,400 MB/s - DirectStorage Enabled - CT2000T700SSD3");

        procesadorPc.addComponente(refrigeracionprocesadorPc);
        placaVideoPc.addComponente(placaVideoRam).addComponente(placaVideoRam2)
                .addComponente(placaVideoVentiladores).addComponente(placaVideoVentiladores1)
                .addComponente(placaVideoVentiladores2);
        placaMadrePc.addComponente(procesadorPc).addComponente(placaVideoPc).addComponente(memoriaRamPC)
                .addComponente(almacenamientoPc);
        casePc.addComponente(fuentePc).addComponente(placaMadrePc).addComponente(new Componente("Ventilador Case"));

        metodoRecursivo(casePc, 0);
        System.out.println("---------------------");
        metodoRecursivoStream(casePc,0).forEach(c-> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));
    }
    public static void metodoRecursivo(Componente c, int nivel){
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (c.HasChildren()){
            for (Componente hijo: c.getHijos()){
              metodoRecursivo(hijo, nivel+1);
            };
        }
    }

    public static Stream<Componente> metodoRecursivoStream(Componente c, int nivel){
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c), c.getHijos().stream().
                flatMap(hijo ->metodoRecursivoStream(hijo,nivel+1)));

    }
}
