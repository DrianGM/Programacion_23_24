package org.velazquez.U3_arrays.tarea_1;

public class tarea_2 {
    public static void numerosComprendidos(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        numerosComprendidos(12, 6);
    }
}