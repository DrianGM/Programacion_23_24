package org.velazquez.U4_POO.tarea_1.ejercicio_7;

public class Controlador {
    private double frecuencia;

    public void up(){
        frecuencia=frecuencia+0.5;
        if (frecuencia>108){
            frecuencia=80;
        }
    }

    public void down(){
        frecuencia=frecuencia-0.5;
        if (frecuencia<80){
            frecuencia=108;
        }
    }

    public void display(){
        System.out.println(frecuencia);
    }

    public Controlador(){
        frecuencia=80;
    }
}
