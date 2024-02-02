package com.avalencia.thread.ejemplosync.runnable;

import com.avalencia.thread.ejemplosync.Panaderia;

public class Consumidor implements Runnable{

    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            panaderia.consumirElPan();
        }
    }
}
