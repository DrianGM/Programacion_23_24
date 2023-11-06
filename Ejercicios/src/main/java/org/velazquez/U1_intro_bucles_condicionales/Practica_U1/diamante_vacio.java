package org.velazquez.U1_intro_bucles_condicionales.Practica_U1;

public class diamante_vacio {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                if (j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = i; j <= n; j++) {
                if (j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}