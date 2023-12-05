package org.velazquez.U3_strings_arrays.Practica_U3;

import java.util.Arrays;

public class Ej_3_sinRandom {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de filas del array.");
        int filas = 5;
        System.out.println("Ingrese la cantidad de columnas del array");
        int columnas = 8;
        int[][] tabla = new int[5][5];
        tabla[0] = new int[]{69, 17, 51, 49, 28, 45, 38, 28};
        tabla[1] = new int[]{67, 78, 60, 44, 78, 47, 18, 40};
        tabla[2] = new int[]{38, 48, 15, 67, 65, 56, 34, 51};
        tabla[3] = new int[]{42, 52, 27, 75, 39, 14, 57, 63};
        tabla[4] = new int[]{47, 22, 61, 26, 63, 46, 50, 31};
        int randomMax = 78;
        int randomMin = 14;
        System.out.println("Array :");
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
        System.out.println("Suma de pares :" + sumaImpares);
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
        System.out.println("Min de pares :" + minImpares);
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