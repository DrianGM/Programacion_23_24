package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Arrays;

public class tarea_8 {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(tabla));
    }
}
