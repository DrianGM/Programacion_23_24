package org.velazquez.U1_intro_bucles_condicionales.tarea_4;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();
        double media = (double) (nota1 + nota2) / 2;
        System.out.println("La media aritmética es: " + media);
    }
}

