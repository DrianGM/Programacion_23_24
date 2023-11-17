package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Arrays;
import java.util.Scanner;

public class tarea_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una serie de 6 enteros :");
        int serie = sc.nextInt();
        int longitud = 6;
        int[] primera = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            int resto = serie % 10;
            serie /= 10;
            primera[longitud - 1 - i] = resto;
        }
        Arrays.sort(primera);
        System.out.println(Arrays.toString(primera));
        System.out.println("Ingrese una serie de 6 enteros :");
        serie = sc.nextInt();
        int[] segunda = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            int resto = serie % 10;
            serie /= 10;
            segunda[longitud - 1 - i] = resto;
        }
        Arrays.sort(segunda);
        System.out.println(Arrays.toString(segunda));
        int[] resultado = new int[longitud * 2];
        int i = 0;
        int j = 0;
        for (int k = 0; k < 12; k++) {
            if (i >= 6) {
                resultado[k] = segunda[j++];
            } else if (j >= 6) {
                resultado[k] = primera[i++];
            } else if (primera[i] < segunda[j]) {
                resultado[k] = primera[i++];
            } else {
                resultado[k] = segunda[j++];
            }
        }
        System.out.println(Arrays.toString(resultado));
    }
}