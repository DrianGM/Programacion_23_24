package org.velazquez.U3_strings_arrays.Examen_U3;


import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        matriz[0] = new String[]{"a", "b", "c"};
        matriz[1] = new String[]{"d", "e", "f"};
        matriz[2] = new String[]{"g", "h", "i"};
        String[] fila = {"j", "k", "l"};
        System.out.println("Ingrese la posicion :");
        int pos = sc.nextInt();
        String[][] matrizInsertada = insertarFilaEnMatriz(matriz, fila, pos);
        System.out.println("Array original :");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array con fila insertada :");
        for (int i = 0; i < matrizInsertada.length; i++) {
            for (int j = 0; j < matrizInsertada[i].length; j++) {
                System.out.print(matrizInsertada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        String[][] matrizInsertada = new String[matriz.length + 1][matriz.length];
        int j = 0;
        for (int i = 0; i < matrizInsertada.length; i++) {
            if (i != pos) {
                matrizInsertada[i] = matriz[j];
                j++;
            } else {
                matrizInsertada[i] = fila;
            }
        }
        return matrizInsertada;
    }
}
