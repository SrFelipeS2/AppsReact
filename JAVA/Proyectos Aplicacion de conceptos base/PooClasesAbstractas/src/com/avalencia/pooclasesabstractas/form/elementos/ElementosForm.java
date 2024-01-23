package com.avalencia.pooclasesabstractas.form.elementos;

import com.avalencia.pooclasesabstractas.form.validador.LargoValidador;
import com.avalencia.pooclasesabstractas.form.validador.Validador;
import com.avalencia.pooclasesabstractas.form.validador.mensaje.IMensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementosForm {

    protected String valor;
    protected String nombre;

    private List<Validador> Validadores;
    private List<String> errores;

    public ElementosForm() {
        this.Validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementosForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementosForm addValidador(Validador validador) {
        this.Validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esValido() {
        for (Validador v : this.Validadores) {
            if (!v.esValido(this.valor)) {
                if (v instanceof IMensajeFormateable) {
                    this.errores.add(((LargoValidador) v).getMensajeFormateado(this.nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), this.nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();
}
