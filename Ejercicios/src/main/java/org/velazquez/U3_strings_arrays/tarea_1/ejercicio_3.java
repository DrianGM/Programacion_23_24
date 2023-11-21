package org.velazquez.U3_strings_arrays.tarea_1;

public class ejercicio_3 {
    public static void areaVolumen(double a, double radio, double altura) {
        if (a == 1) {
            System.out.println(2 * Math.PI * radio * (altura + radio));
        }
        if (a == 2) {
            System.out.println(Math.PI * Math.pow(radio, 2) * altura);
        }
    }

    public static void main(String[] args) {
        areaVolumen(2, 5, 5);
    }
}
