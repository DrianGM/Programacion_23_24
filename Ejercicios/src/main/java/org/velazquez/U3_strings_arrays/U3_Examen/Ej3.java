package org.velazquez.U3_strings_arrays.U3_Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas del array.");
        int filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas del array");
        int columnas = sc.nextInt();
        int[][] tabla = new int[filas][columnas];
        int num;
        int randomMax = 78;
        int randomMin = 14;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                num = (int) (Math.random() * ((randomMax + 1) - randomMin)) + randomMin;
                tabla[i][j] = num;
            }
        }
        System.out.println("Matriz :");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Pares:");
        int[] pares = paresInterseccion(tabla, filas, columnas);
        System.out.println(Arrays.toString(pares));
        System.out.println("Impares");
        int[] impares = imparesInterseccion(tabla, filas, columnas);
        System.out.println(Arrays.toString(impares));
        int sumaPares = suma(pares);
        System.out.println("Suma de pares :" + sumaPares);
        int sumaImpares = suma(impares);
        System.out.println("Suma de impares :" + sumaImpares);
        int mediaPares = media(pares);
        System.out.println("Media de pares :" + mediaPares);
        int mediaImpares = media(impares);
        System.out.println("Media de impares :" + mediaImpares);
        int maxPares = maximo(pares, randomMin);
        System.out.println("Max de pares :" + maxPares);
        int minPares = minimo(pares, randomMax);
        System.out.println("Min de pares :" + minPares);
        int maxImpares = maximo(impares, randomMin);
        System.out.println("Max de impares :" + maxImpares);
        int minImpares = minimo(impares, randomMax);
        System.out.println("Min de impares :" + minImpares);
    }

    public static int[] paresInterseccion(int[][] tabla, int filas, int columnas) {
        int[] pares = new int[filas * columnas];
        int par = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    pares[par++] = tabla[i][j];
                }
            }
        }
        return Arrays.copyOf(pares, par);
    }

    public static int[] imparesInterseccion(int[][] tabla, int filas, int columnas) {
        int[] impares = new int[filas * columnas];
        int impar = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    impares[impar++] = tabla[i][j];
                }
            }
        }
        return Arrays.copyOf(impares, impar);
    }

    public static int suma(int[] tabla) {
        int suma = 0;
        for (int i = 0; i < tabla.length; i++) {
            suma = suma + tabla[i];
        }
        return suma;
    }

    public static int media(int[] tabla) {
        int media = 0;
        int cantidad = 0;
        for (int i = 0; i < tabla.length; i++) {
            media = media + tabla[i];
            cantidad++;
        }
        media = media / cantidad;
        return media;
    }

    public static int maximo(int[] tabla, int minimo) {
        int maximo = minimo;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > maximo) {
                maximo = tabla[i];
            }
        }
        return maximo;
    }

    public static int minimo(int[] tabla, int maximo) {
        int minimo = maximo;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] < minimo) {
                minimo = tabla[i];
            }
        }
        return minimo;
    }
}