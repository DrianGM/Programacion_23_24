package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

public abstract class Local extends Propiedad {
    protected Persona propietario;
    protected float precio;
    public Local(int anioConstruccion, String direccion, float metrosCuadrados) {
        super(anioConstruccion, direccion, metrosCuadrados);
    }

}
