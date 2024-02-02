package com.avalencia.desafioalfanumericothread;

public class AlfanumericoTarea implements Runnable {
    private Enum<Tipo> tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo == Tipo.NUMERO) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Numero: " + i);
            }
        } else {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println("Letra: " + c);
            }
        }
    }
}
