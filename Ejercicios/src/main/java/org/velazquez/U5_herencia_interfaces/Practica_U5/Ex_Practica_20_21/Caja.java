package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_20_21;

import java.util.Arrays;

public class Caja {
    private Prenda[] prendas = new Prenda[5];
    private int id;

    public void agregarPrenda(Prenda prenda) {
        boolean check = true;
        for (int i = 0; i < prendas.length; i++) {
            if (prendas[i]==prenda){
                check=false;
                break;
            }
        }
        if (check){
            for (int i = 0; i < prendas.length; i++) {
                if (prendas[i]==null){
                    prendas[i]=prenda;
                    break;
                }
            }
        }
    }

    public void eliminarPrenda(Prenda prenda) {
        for (int i = 0; i < prendas.length; i++) {
            if (prendas[i]==prenda){
                prendas[i]=null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Caja{" +
                "prendas=" + Arrays.toString(prendas) +
                ", id=" + id +
                '}';
    }
}
