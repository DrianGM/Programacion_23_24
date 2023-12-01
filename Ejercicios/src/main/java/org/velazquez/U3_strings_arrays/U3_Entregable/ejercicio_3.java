package org.velazquez.U3_strings_arrays.U3_Entregable;

import java.util.Arrays;

public class ejercicio_3 {
    public static boolean cuadradoMagico(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            suma += matriz[0][i];
        }
        for (int i = 1; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != suma) {
                return false;
            }
        }
        for (int i = 1; i < matriz[0].length; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaColumna += matriz[j][i];
            }
            if (sumaColumna != suma) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        matriz[0] = new int[]{17, 23, 4, 10, 11};
        matriz[1] = new int[]{24, 5, 6, 12, 18};
        matriz[2] = new int[]{1, 7, 13, 19, 25};
        matriz[3] = new int[]{8, 14, 20, 21, 2};
        matriz[4] = new int[]{15, 16, 22, 3, 9};
        System.out.println(Arrays.deepToString(matriz));
        boolean cuadradoMagico = cuadradoMagico(matriz);
        System.out.println(cuadradoMagico);
    }
}
