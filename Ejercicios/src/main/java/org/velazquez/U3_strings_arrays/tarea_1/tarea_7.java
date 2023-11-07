package org.velazquez.U3_strings_arrays.tarea_1;

import java.util.Scanner;

public class tarea_7 {
    static void esPrimo(int a) {
        long contador = 0;
        for (long i = 1; i <= a; i++) {
            if ((a % i) == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("El numero " + a + " es primo");
        } else {
            System.out.println("El numero " + a + " no es primo");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número : ");
        int num = sc.nextInt();
        esPrimo(num);
    }
}
