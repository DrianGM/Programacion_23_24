package org.velazquez.U4_POO.tarea_1.ejercicio_9.Maquinaria;

import org.velazquez.U4_POO.tarea_1.ejercicio_9.Personal.Maquinista;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagon=new Vagon[5];
    private Maquinista maquinista;

    public Tren (Locomotora locomotora,Vagon[] vagon,Maquinista maquinista){
        this.locomotora=locomotora;
        this.maquinista=maquinista;
        this.vagon=vagon;
    }


}
