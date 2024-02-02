package com.avalencia.poointerfaces.repositorio.dao;
import com.avalencia.poointerfaces.modelo.BaseEntity;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.EscrituraAcessoDatoException;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.LecturaAccesDatoException;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.RegistroDuplicadoAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio<T extends BaseEntity> implements
        OrdenablePaginableCrudRepositorio<T> {

    protected List<T> dataSource;

    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer Id) throws LecturaAccesDatoException{
        if(Id == null || Id <= 0){
            throw new LecturaAccesDatoException("Id invalido debe ser mayor< a 0");
        }
        T resultado = null;
        for (T cli : dataSource) {
            if (cli.getId()!=null && cli.getId().equals(Id)) {
                resultado = cli;
                break;
            }
        }
        if(resultado == null){
            throw new LecturaAccesDatoException("No existe el registro con el ID especificado:" +Id);
        }
        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAcessoDatoException, RegistroDuplicadoAccesoDatoException {
        if(t == null){
            throw new EscrituraAcessoDatoException("Eerror al insertar un objeto null");
        }
        if(dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("El Usuario ya se encuentre registrado con el ID: " + t.getId());
        }
        this.dataSource.add(t);
    }
    @Override
    public void eliminar(Integer ID) throws LecturaAccesDatoException {
        this.dataSource.remove(this.porId(ID));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
