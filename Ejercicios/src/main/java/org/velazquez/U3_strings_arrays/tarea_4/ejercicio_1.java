package org.velazquez.U3_strings_arrays.tarea_4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int[] copia;
        int numeroMax = 500;
        int numeroMin = 0;
        for (int i = 0; i < array.length; i++) {
            int num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Que quiere destacar (1 = minimo, 2 = maximo): ");
        copia = Arrays.copyOf(array, array.length);
        Arrays.sort(copia);
        int buscar = 0;
        int respuesta = sc.nextInt();
        if (respuesta == 1) {
            buscar = copia[0];
        } else if (respuesta == 2) {
            buscar = copia[copia.length - 1];
        } else {
            System.out.println("Respuesta invalida.");
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (array[i] == buscar) {
                System.out.print("**" + array[i] + "**");
            } else {
                System.out.print(array[i]);
            }
            if (i == 99) {
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }
    }
}