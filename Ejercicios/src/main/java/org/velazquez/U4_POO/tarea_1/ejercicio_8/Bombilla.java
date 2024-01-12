package org.velazquez.U4_POO.tarea_1.ejercicio_8;

public class Bombilla {
    private boolean estado=false;

    public void mostrarEstado(){
        System.out.println(estado);
    }
    public void interruptor(){
        if (estado=true){
            estado=false;
        } else {
            estado=true;
        }
    }
}
