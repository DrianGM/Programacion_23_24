package org.velazquez.U4_POO.tarea_1.ejercicio_9;

import org.velazquez.U4_POO.tarea_1.ejercicio_9.Maquinaria.Locomotora;
import org.velazquez.U4_POO.tarea_1.ejercicio_9.Personal.Jefe_estacion;
import org.velazquez.U4_POO.tarea_1.ejercicio_9.Personal.Maquinista;
import org.velazquez.U4_POO.tarea_1.ejercicio_9.Personal.Mecanico;

public class Principal {
    public static void main(String[] args) {
        Maquinista maquinista = new Maquinista("Manolo","123456789D",1200,"Jefe");
        Mecanico mecanico = new Mecanico("Juan","993484692","Frenos");
        Jefe_estacion jefe = new Jefe_estacion("Manuel","48829574R");
        Locomotora locomotora = new Locomotora("023 546","Tocha","2001",mecanico);
    }
}
