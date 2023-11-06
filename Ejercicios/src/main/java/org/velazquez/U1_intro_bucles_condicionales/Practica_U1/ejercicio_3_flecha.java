package org.velazquez.U1_intro_bucles_condicionales.Practica_U1;

import java.util.Scanner;

public class ejercicio_3_flecha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura :");
        int altura = teclado.nextInt();
        while (altura % 2 == 0 || altura < 3) {
            System.out.println("La altura es inválida, ingrésela de nuevo (debe ser un número impar mayor que 3 : ");
            altura = teclado.nextInt();
        }
        int ancho = altura / 2 + 1;
        for (int i = 1; i <= ancho; i++) {
            for (int j = i; j <= ancho; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            if (i == ancho) {
                System.out.print("* * * * *");
            }
            System.out.println();
        }
        for (int i = 1; i <= ancho - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
