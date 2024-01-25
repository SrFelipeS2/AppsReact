package com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces;

import java.util.Date;

public interface ILibro {
    Date getfechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();

}
