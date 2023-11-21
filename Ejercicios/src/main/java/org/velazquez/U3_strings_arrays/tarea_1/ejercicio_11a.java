package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class ejercicio_11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número a :");
        int a = sc.nextInt();
        System.out.println("Ingrese la potencia n :");
        int n = sc.nextInt();
        int resultado = potencia(a, n);
        System.out.println(resultado);
    }

    public static int potencia(int a, int n) {
        int resultado = a;
        for (int i = 1; i < n; i++) {
            resultado = resultado * a;
        }
        return resultado;
    }
}
