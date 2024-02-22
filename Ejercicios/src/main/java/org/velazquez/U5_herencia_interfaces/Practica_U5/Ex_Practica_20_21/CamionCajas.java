package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_20_21;


import java.util.Arrays;

public class CamionCajas extends Vehiculo {
    private Caja[] cajas;

    public CamionCajas(String matricula, int cargaMax, Conductor conductor) {
        super(matricula, cargaMax, conductor);
        cajas = new Caja[cargaMax];
    }

    @Override
    public void descargar() {

    }

    public void agregarCaja(Caja caja) {
        boolean check = true;
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]==caja){
                check=false;
                break;
            }
        }
        if (check){
            for (int i = 0; i < cajas.length; i++) {
                if (cajas[i]==null){
                    cajas[i]=caja;
                    break;
                }
            }
        }
    }

    public void eliminarCaja(Caja caja) {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]==caja){
                cajas[i]=null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajas=" + Arrays.toString(cajas) +
                '}';
    }
}
