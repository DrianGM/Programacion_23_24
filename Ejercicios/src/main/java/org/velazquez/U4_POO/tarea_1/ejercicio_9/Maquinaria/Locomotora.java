package org.velazquez.U4_POO.tarea_1.ejercicio_9.Maquinaria;

import org.velazquez.U4_POO.tarea_1.ejercicio_9.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private String potencia_motor;
    private String fecha_fabricacion;
    private Mecanico mecanico;

    public Locomotora (String matricula, String potencia_motor, String fecha_fabricacion,Mecanico mecanico){
        this.matricula=matricula;
        this.potencia_motor=potencia_motor;
        this.fecha_fabricacion=fecha_fabricacion;
        this.mecanico=mecanico;
    }

}
