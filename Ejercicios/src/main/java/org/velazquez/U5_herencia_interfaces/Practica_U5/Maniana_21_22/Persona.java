package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

public class Persona {
    private String NIF;
    protected String nombreCompleto;
    private int id;

    private static int contadorIds = 0;

    public Persona (String NIF, String nombreCompleto){
        this.NIF=NIF;
        this.nombreCompleto=nombreCompleto;
        this.id= ++contadorIds;
    }
}
