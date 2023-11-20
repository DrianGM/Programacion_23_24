package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Arrays;
import java.util.Scanner;

public class tarea_9 {
    public static int aciertosPrimitiva(int[] a, int[] b) {
        int aciertos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                aciertos++;
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {
        int[] array1 = new int[6];
        int[] array2 = {6, 6, 6, 3, 3, 3};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese un numero :");
            array1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int aciertos = aciertosPrimitiva(array1, array2);
        System.out.println("Hay " + aciertos + " aciertos.");
    }
}
