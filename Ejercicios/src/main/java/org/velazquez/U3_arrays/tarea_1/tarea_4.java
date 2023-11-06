package org.velazquez.U3_arrays.tarea_1;

import java.util.Scanner;

public class tarea_4 {
    static int numMayor(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mayor = numMayor(a, b);
        System.out.println(mayor);
    }
}
