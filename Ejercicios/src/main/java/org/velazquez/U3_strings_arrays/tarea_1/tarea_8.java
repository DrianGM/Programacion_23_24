package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class tarea_8 {
    static int divisoresPrimos(int n) {
        int divisoresPrimos = 0;
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                if (n % i == 0) {
                    divisoresPrimos++;
                }
            }
            divisores = 0;
        }
        return divisoresPrimos;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero :");
        int n = sc.nextInt();
        int divisores = divisoresPrimos(n);
        System.out.println(n + " tiene " + divisores + " divisores primos.");
    }
}
