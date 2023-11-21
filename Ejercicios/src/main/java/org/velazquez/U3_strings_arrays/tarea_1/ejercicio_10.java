package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número :");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número :");
        int n2 = sc.nextInt();
        if (sonAmigos(n1, n2)) {
            System.out.println("Los dos números son amigos :) ");
        } else {
            System.out.println("Los dos números no son amigos :( ");
        }
    }


    public static boolean sonAmigos(int a, int b) {
        int divisores = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                divisores = divisores + i;
            }
        }
        if (divisores == b) {
            return true;
        } else {
            return false;
        }
    }
}
