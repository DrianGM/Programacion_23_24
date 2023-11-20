package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Arrays;
import java.util.Scanner;

public class tarea_10 {
    public static int rellenaPares(int[] a) {
        Scanner sc = new Scanner(System.in);
        int impares = 0;
        int pares = 0;
        while (pares != a.length) {
            System.out.println("Ingrese un numero :");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                a[pares] = n;
                pares++;

            } else {
                impares++;
            }
        }
        System.out.println(Arrays.toString(a));
        return impares;
    }

    public static void main(String[] args) {
        int[] array1 = new int[10];
        int impares = rellenaPares(array1);
        System.out.println("Se han desechado " + impares + " impares.");
    }
}
