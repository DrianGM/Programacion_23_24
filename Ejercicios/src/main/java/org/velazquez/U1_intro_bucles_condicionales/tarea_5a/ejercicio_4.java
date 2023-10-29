package org.velazquez.U1_intro_bucles_condicionales.tarea_5a;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        int variable = 0;
        System.out.println("Ingrese un número : ");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        System.out.println("Ingrese otro número : ");
        Scanner teclado2 = new Scanner(System.in);
        int num2 = teclado2.nextInt();
        if (num1 % 2 == 0) {
            variable = variable + 1;
        }
        if (num2 % 2 == 0) {
            variable = variable + 1;
        }
        if (variable == 0) {
            System.out.println("Ningún número es par.");
        }
        if (variable == 1) {
            System.out.println("1 número es par.");
        }
        if (variable == 2) {
            System.out.println("Ambos números son pares.");
        }
    }
}

