package org.velazquez.U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número :");
        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();
        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int j = 0; j < (altura / 2) + 1; j++) {
            System.out.print("*");
        }
    }
}
