package org.velazquez.U3_strings_arrays.U3_Examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = {1, 2, 3, 4, 5, 6};
        int[] v2 = {4, 9, 12, 5, 7};
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        System.out.println("Ingrese la posicion :");
        int pos = sc.nextInt();
        int[] vectorInsertado = insertarEnVector(v1, v2, pos);
        System.out.println("El resultado de insertarEnVector es:");
        System.out.println(Arrays.toString(vectorInsertado));
    }

    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        int[] vectorInsertado = new int[v1.length + v2.length];
        int iOriginal = 0;
        if (pos < 0) {
            return v1;
        } else {
            if (pos > v1.length) {
                return v2;
            } else {
                if (pos == v1.length) {
                    int j = 0;
                    for (int i = 0; i < vectorInsertado.length; i++) {
                        if (i < v1.length) {
                            vectorInsertado[i] = v1[i];
                        } else {
                            vectorInsertado[i] = v2[j];
                            j++;
                        }
                    }
                } else {
                    for (int i = 0; i < vectorInsertado.length; i++) {
                        if (pos == i) {
                            iOriginal = i;
                            for (int j = 0; j < v2.length; j++) {
                                vectorInsertado[i] = v2[j];
                                i++;
                            }
                            i--;
                        } else {
                            vectorInsertado[i] = v1[iOriginal];
                            iOriginal++;
                        }
                    }
                }
            }
        }
        return vectorInsertado;
    }
}
