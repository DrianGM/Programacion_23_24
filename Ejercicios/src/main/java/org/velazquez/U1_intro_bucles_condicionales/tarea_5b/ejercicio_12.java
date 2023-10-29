package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número : ");
        int a = teclado.nextInt();
        System.out.println("Por favor, introduzca el segundo número : ");
        int b = teclado.nextInt();
        System.out.println("Por favor, introduzca el tercer número : ");
        int c = teclado.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("El mayor es: " + a);
            } else {
                System.out.println("El mayor es: " + c);
            }
        } else if (b > c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
    }
}
