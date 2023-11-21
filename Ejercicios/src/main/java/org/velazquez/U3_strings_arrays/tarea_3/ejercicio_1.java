package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacidad = 5;
        float[] numeros = new float[(int) capacidad];
        for (int i = 0; i < capacidad; i++) {
            System.out.print("Ingrese el dato " + i + ": ");
            numeros[i] = sc.nextFloat();
        }
        for (int i = 0; i < capacidad; i++) {
            System.out.println("El dato " + i + " vale " + numeros[i]);
        }
    }
}