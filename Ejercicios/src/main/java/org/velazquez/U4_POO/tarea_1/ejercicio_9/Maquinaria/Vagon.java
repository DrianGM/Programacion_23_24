package org.velazquez.U4_POO.tarea_1.ejercicio_9.Maquinaria;

class Vagon {
    private long capacidad_max;
    private long capacidad_actual;
    private String tipo_mercancia;

    public Vagon(long capacidad_max,long capacidad_actual,String tipo_mercancia){
        this.capacidad_max=capacidad_max;
        this.tipo_mercancia=tipo_mercancia;
        if (capacidad_actual<=capacidad_max){
            this.capacidad_actual=capacidad_actual;
        }
    }
}
