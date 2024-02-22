package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_20_21;

public class CamionCajas extends Vehiculo {
    private Caja[] cajas;

    public CamionCajas(String matricula, float cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
    }

    @Override
    public void descargar() {

    }
}
