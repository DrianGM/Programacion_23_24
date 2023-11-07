package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class tarea_12 {
    public static long factorial(long num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número para calcular su factorial :");
        long n = sc.nextInt();
        long factorial = factorial(n);
        System.out.println("El factorial de " + n + " es " + factorial);
    }
}
