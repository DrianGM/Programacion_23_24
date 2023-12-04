package org.velazquez.U3_strings_arrays.Practica_U3.Entregable2021_Tarde;

import java.util.Scanner;

public class rotar90grados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la capacidad del array.");
        int capacidad = sc.nextInt();
        int[][] tabla = new int[capacidad][capacidad];
        int num;
        int randomMax = 200;
        int randomMin = 100;
        for (int i = 0; i < capacidad; i++) {
            for (int j = 0; j < capacidad; j++) {
                num = (int) (Math.random() * ((randomMax + 1) - randomMin)) + randomMin;
                tabla[i][j] = num;
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array rotado 90 grados : ");
        int[][] rotado = new int[capacidad][capacidad];
        for (int i = 0; i < capacidad; i++) {
            for (int j = 0; j < capacidad; j++) {
                rotado[j][capacidad - 1 - i] = tabla[i][j];
            }
        }
        for (int i = 0; i < rotado.length; i++) {
            for (int j = 0; j < rotado[i].length; j++) {
                System.out.print(rotado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
