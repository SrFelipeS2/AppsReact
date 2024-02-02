package com.avalencia.thread.ejemplos.runnable;

import com.avalencia.thread.ejemplos.EjemploSincroizacionThread;

import static com.avalencia.thread.ejemplos.EjemploSincroizacionThread.imprimirFrases;

public class ImprimirFrases implements Runnable{
    private String frase1,  frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    public String getFrase1() {
        return frase1;
    }

    public String getFrase2() {
        return frase2;
    }

    @Override
    public void run() {
        try {
            imprimirFrases(this.frase1, this.frase2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
