package org.velazquez.U3_strings_arrays.U3_Entregable;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_1 {
    public static int[] paresImpares(int[] a) {
        int[] pares = new int[a.length];
        int[] impares = new int[a.length];
        int[] resultado = new int[a.length];
        int k = 0, j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[k] = a[i];
                k++;
            } else {
                impares[j] = a[i];
                j++;
            }
        }
        for (int l = 0; l < k; l++) {
            resultado[l] = pares[l];
        }
        for (int l = 0; l < j; l++) {
            resultado[k + l] = impares[l];
        }
        return resultado;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la capacidad del array :");
        int capacidad = sc.nextInt();
        int[] array = new int[capacidad];
        int numeroMax = 65;
        int numeroMin = 18;
        for (int i = 0; i < array.length; i++) {
            int num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));
        int[] resultado = paresImpares(array);
        System.out.println(Arrays.toString(resultado));
    }
}
