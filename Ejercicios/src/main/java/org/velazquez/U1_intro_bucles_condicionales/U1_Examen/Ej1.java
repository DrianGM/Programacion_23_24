package org.velazquez.U1_intro_bucles_condicionales.U1_Examen;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura :");
        int num = teclado.nextInt();
        while (num % 2 == 0 || num <= 3) {
            System.out.println("La altura es inválida, ingrésela de nuevo (debe ser un número impar mayor que 3 : ");
            num = teclado.nextInt();
        }
        int n = (num / 2) + 1;
        int n2 = (n / 2) + 1;
        int n3 = n + n + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int j = 1; j <= n2; j++) {
            for (int k = 1; k <= n3; k++) {
                if (k == 1 || k == n3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("      ");
            for (int k = 1; k <= n; k++) {
                if (k == num / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}