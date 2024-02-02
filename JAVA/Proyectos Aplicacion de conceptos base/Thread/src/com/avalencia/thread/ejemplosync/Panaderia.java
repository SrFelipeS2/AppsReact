package com.avalencia.thread.ejemplosync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa) {
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("el panadero esta horneando el pan " + this.pan);
        this.disponible = true;
        notify();

    }
    public synchronized String consumirElPan(){
        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Cliente se come el pan " + this.pan);
        this.disponible = false;
        notify();
        return pan;
    }
}
