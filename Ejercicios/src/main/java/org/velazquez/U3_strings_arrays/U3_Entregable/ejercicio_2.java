package org.velazquez.U3_strings_arrays.U3_Entregable;


import java.util.Arrays;

public class ejercicio_2 {
    public static boolean hayRepetidos(int[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    contador++;
                    if (contador == 2) {
                        return true;
                    }
                }
            }
            contador = 0;
        }
        return false;
    }

    public static int[] sinDuplicados(int[] a) {
        int[] sinDuplicados = new int[a.length];
        int k = 0;
        boolean Duplicado;
        for (int i = 0; i < a.length; i++) {
            Duplicado = false;
            for (int j = 0; j < k; j++) {
                if (a[i] == sinDuplicados[j]) {
                    Duplicado = true;
                    break;
                }
            }
            if (!Duplicado) {
                sinDuplicados[k++] = a[i];
            }
        }
        return Arrays.copyOf(sinDuplicados, k);
    }


    public static void main(String[] args) {
        int[] array = {12, 10, 12, 45, 67, 12};
        boolean repetidos = hayRepetidos(array);
        //System.out.println(repetidos);
        int[] sinDuplicados = sinDuplicados(array);
        System.out.println(Arrays.toString(sinDuplicados));

    }
}
