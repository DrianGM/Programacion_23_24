package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Scanner;

public class tarea_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea introducir :");
        int capacidad = sc.nextInt();
        int[] numeros = new int[capacidad];
        for (int i = 0; i < capacidad; i++) {
            System.out.print("Ingrese el dato " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        for (int i = capacidad - 1; i >= 0; i--) {
            System.out.println("El dato " + i + " vale " + numeros[i]);
        }
    }
}
