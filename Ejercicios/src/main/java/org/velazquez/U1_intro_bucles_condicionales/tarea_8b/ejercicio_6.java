package org.velazquez.U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();
        System.out.print("Introduce el carácter de la pirámide: ");
        String caracter = scanner.next();
        for (int i = 1; i <= altura; i++) {
            for (int j = altura - i; j > 0; j--) {
                System.out.print(" ");
            }
            if (i == 1 || i == altura) {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(caracter);
                }
            } else {
                // Caracter solo en el primer y último lugar de la fila, el resto son espacios
                System.out.print(caracter);
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}

