package com.avalencia.poointerfaces.imprenta.modelo;

public class Infomre extends Hoja{

    private String auotor;
    private String revisor;

    public Infomre(String contenido) {
        super(contenido);
    }

    public Infomre(String contenido, String auotor, String revisor) {
        super(contenido);
        this.auotor = auotor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por:" + this.auotor
                + "Revisado por: " + this.revisor
                + "\n " + this.contenido;
    }
}
