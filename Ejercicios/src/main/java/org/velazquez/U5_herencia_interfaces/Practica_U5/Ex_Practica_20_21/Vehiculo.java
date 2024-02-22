package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_20_21;

public abstract class Vehiculo {
    private String matricula;
    private float cargaMax;
    private Conductor conductor;

    public Vehiculo(String matricula, float cargaMax, Conductor conductor){
        this.matricula=matricula;
        this.cargaMax=cargaMax;
        this.conductor=conductor;
    }

    public abstract void descargar();
}
