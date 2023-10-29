package org.velazquez.U1_intro_bucles_condicionales.tarea_7;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de 'a' :");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor de 'b' :");
        double b = teclado.nextDouble();
        double c = a;
        a = b;
        b = c;
        System.out.println("Ahora, 'a' vale :" + a);
        System.out.println("Ahora, 'b' vale :" + b);
    }
}
