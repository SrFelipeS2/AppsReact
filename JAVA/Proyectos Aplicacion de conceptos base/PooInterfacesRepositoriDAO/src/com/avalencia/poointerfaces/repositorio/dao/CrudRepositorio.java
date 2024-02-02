package com.avalencia.poointerfaces.repositorio.dao;

import com.avalencia.poointerfaces.repositorio.dao.excepciones.AccesoDatoexception;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.EscrituraAcessoDatoException;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.LecturaAccesDatoException;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.RegistroDuplicadoAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
   //Este metodo lista los clientes en un arreglo
    List<T> listar();
    //Este metodo es para obtener el Id de un cliente en especifico
    T porId(Integer Id) throws AccesoDatoexception;
    //Este metodo crea un cliente en la base de datos
    void crear(T t) throws EscrituraAcessoDatoException;
    //Este metodo edita un cliente en la base de datos
    void editar(T t) throws LecturaAccesDatoException;
    //este metodo elimina un cliente en la base de datps
    void eliminar(Integer ID) throws LecturaAccesDatoException;

}
