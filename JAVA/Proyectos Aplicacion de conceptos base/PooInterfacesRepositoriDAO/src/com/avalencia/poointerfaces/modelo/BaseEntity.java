package com.avalencia.poointerfaces.modelo;

import java.util.Objects;

public class BaseEntity {
    protected Integer id;
    private static int ultimoId;
    public BaseEntity() {
        this.id = ++ ultimoId;
    }
    public void setId(Integer id) { this.id = id; }
    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity baseEntity = (BaseEntity) o;
        return Objects.equals(id, baseEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
