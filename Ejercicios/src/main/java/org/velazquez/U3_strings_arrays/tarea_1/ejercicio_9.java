package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class ejercicio_9 {
    static void divisoresPrimos(int n) {
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
            divisores = 0;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero :");
        int n = sc.nextInt();
        System.out.println("Divisores primos de " + n + " :");
        divisoresPrimos(n);
    }
}