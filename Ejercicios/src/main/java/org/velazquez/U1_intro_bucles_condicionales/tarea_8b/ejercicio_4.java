package org.velazquez.U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        int contador = 10;
        int positivos = 0;
        int negativos = 0;
        while (contador != 0) {
            System.out.println("Introduzca un número : ");
            Scanner teclado = new Scanner(System.in);
            int num = teclado.nextInt();
            if (num >= 0) {
                positivos++;
            } else {
                negativos++;
            }
            contador--;
        }
        System.out.println("Hay " + positivos + " positivos y " + negativos + " negativos.");
    }
}
