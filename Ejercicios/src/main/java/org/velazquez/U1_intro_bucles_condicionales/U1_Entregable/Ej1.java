package org.velazquez.U1_intro_bucles_condicionales.U1_Entregable;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;
        while (true) {
            System.out.print("Ingrese la altura (debe ser impar y mayor que 3): ");
            altura = scanner.nextInt();
            if (altura % 2 != 0 && altura > 3) {
                break;
            } else {
                System.out.println("La altura es inválida. Ingresela de nuevo.");
            }
        }
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (i == 1 || i == altura || j == altura - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j = 1; j <= altura; j++) {
                if (i == 1 || i == altura || j == altura - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


