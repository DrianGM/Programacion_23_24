package org.velazquez.U1_intro_bucles_condicionales.tarea_4;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        int mediaentera = (int) media;
        System.out.println("La parte entera de la media es: " + mediaentera);
    }
}

