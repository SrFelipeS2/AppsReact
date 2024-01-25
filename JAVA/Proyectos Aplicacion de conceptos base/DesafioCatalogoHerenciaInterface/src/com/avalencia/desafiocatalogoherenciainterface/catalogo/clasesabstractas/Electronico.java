package com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas;

import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IElectronico;

abstract public class Electronico implements IElectronico {
    protected String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

}
