package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
