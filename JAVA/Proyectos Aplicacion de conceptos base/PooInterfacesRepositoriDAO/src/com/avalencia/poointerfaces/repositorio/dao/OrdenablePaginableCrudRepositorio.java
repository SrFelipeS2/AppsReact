package com.avalencia.poointerfaces.repositorio.dao;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdebaleRepositorio<T>
        ,PaginableRepositorio<T>,CrudRepositorio<T>, Contable{




}
