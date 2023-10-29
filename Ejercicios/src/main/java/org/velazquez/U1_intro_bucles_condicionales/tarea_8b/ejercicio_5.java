package org.velazquez.U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int altura = teclado.nextInt();
        System.out.println("Ingrese el carácter.");
        String caracter = teclado.next();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}