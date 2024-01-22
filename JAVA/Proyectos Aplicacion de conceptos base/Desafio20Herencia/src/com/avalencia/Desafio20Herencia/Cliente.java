package com.avalencia.Desafio20Herencia;

public class Cliente extends Persona {

    private int clienteId;

    public Cliente() {

    }
    public Cliente(String nimbre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nimbre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    @Override
    public String toString() {
        return super.toString() +
                "clienteId='" + clienteId + '\'' ;

    }
}
