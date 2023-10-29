package org.velazquez.U1_intro_bucles_condicionales.tarea_3;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Ingresa el primer número: ");
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        System.out.println("Ingresa el segundo número: ");
        Scanner teclado2 = new Scanner(System.in);
        double b = teclado2.nextDouble();
        double c = (a / b);
        System.out.println("El cociente de la división es = ");
        System.out.print(c);
    }
}