package com.avalencia.pooclasesabstractas.form.validador;

import com.avalencia.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {


    //Este string es una plantilla, el String.format() acoge este estring y lo formatea buscando el %d en el string
    //reemplazandolo por los valores que le pasemos separados por "," ademas de esto tambien tiene mas modificadores como
    //%s etc.. para encontrar mas modificadores revisar la clase.
    protected String mensaje = "el campo %s debe tener minmo %d caracteres y como maximo %d caracteres";
    private int minimo;
    private int maximo = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //this.mensaje = String.format(this.mensaje,minimo,maximo);
        if(valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= minimo && largo <= maximo);
    }
    @Override
    public String getMensajeFormateado(String campo){
        return this.mensaje = String.format(this.mensaje, campo,minimo,maximo);
    }
}

