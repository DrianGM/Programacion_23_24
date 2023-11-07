package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class tarea_5 {
    static int numMayor(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mayor = numMayor(numMayor(a, b), c);
        System.out.println(mayor);
    }
}

