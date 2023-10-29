package org.velazquez.U1_intro_bucles_condicionales.tarea_4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ejercicio_5 {
    public static void main(String[] args) {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora actual: " + horaActual.format(formatoHora));
    }
}
