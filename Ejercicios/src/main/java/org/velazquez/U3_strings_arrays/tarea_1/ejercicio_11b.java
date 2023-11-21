package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class ejercicio_11b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número a :");
        int a = sc.nextInt();
        System.out.println("Ingrese la potencia n :");
        int n = sc.nextInt();
        double resultado = potencia(a, n);
        System.out.println(resultado);
    }

    public static double potencia(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * potencia(a, n - 1);
        }
    }
}
