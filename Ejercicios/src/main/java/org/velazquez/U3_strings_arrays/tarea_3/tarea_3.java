package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Scanner;

public class tarea_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número : ");
        int n = sc.nextInt();
        float mediaPositivos = 0;
        float mediaNegativos = 0;
        int ceros = 0;
        float contadorPositivo = 0;
        float contadorNegativos = 0;
        System.out.println("Ahora, ingrese " + n + " números.");
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el dato " + i + " :");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                ceros++;
            } else {
                if (numeros[i] > 0) {
                    mediaPositivos = mediaPositivos + numeros[i];
                    contadorPositivo++;
                } else {
                    mediaNegativos = mediaNegativos + numeros[i];
                    contadorNegativos++;
                }
            }
        }
        mediaPositivos = mediaPositivos / contadorPositivo;
        mediaNegativos = mediaNegativos / contadorNegativos;
        System.out.println(mediaPositivos);
        System.out.println(mediaNegativos);
        System.out.println(ceros);
    }
}