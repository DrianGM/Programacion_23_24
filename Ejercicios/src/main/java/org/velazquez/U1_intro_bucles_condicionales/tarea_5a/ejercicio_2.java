package org.velazquez.U1_intro_bucles_condicionales.tarea_5a;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Ingrese el número 12 : ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num == 12) {
            System.out.println("Gracias por introducir el número 12");
        } else {
            System.out.println("Ese no es el número 12.");
        }
    }
}

