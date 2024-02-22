package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_20_21;

public class CamionPerchas extends Vehiculo {
    private PrendaColgada[] prendasColgadas;
    public CamionPerchas(String matricula, float cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
    }

    @Override
    public void descargar() {

    }
}
