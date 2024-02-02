package com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces;

import java.util.Date;

public interface ILibro {
    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();

}
