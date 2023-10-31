package org.velazquez.U1_intro_bucles_condicionales.Practica;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero : ");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Ese no es un número entero, por favor, ingrese un número entero :");
            n = sc.nextInt();
        }

    }
}
