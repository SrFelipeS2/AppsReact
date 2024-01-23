package com.avalencia.pooclasesabstractas.form.elementos;

import com.avalencia.pooclasesabstractas.form.elementos.select.Opciones;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementosForm{

    private List<Opciones> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opciones>();
    }

    public SelectForm(String nombre, List<Opciones> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opciones opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");
        for(Opciones opcion : this.opciones){
            sb.append("\n<option value ='").
                    append(opcion.getValor()).
                    append("'");
            if (opcion.isSelected()){
                sb.append(" selected");
                this.valor=opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
