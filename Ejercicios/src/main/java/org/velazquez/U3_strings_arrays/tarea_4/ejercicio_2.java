package org.velazquez.U3_strings_arrays.tarea_4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[8];
        String[] coloresDefinidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] colores = new String[8];
        String[] noColores = new String[8];
        int i = 0, j = 0;
        System.out.println("Introduce 8 palabras:");
        for (int l = 0; l < 8; l++) {
            palabras[l] = sc.nextLine();
        }
        for (int l = 0; l < palabras.length; l++) {
            if (esColor(palabras[l], coloresDefinidos)) {
                colores[i] = palabras[l];
                i++;
            } else {
                noColores[j] = palabras[l];
                j++;
            }
        }
        for (int l = 0; l < i; l++) {
            palabras[l] = colores[l];
        }
        for (int l = 0; l < j; l++) {
            palabras[i + l] = noColores[l];
        }
        System.out.println(Arrays.toString(palabras));
    }

    public static boolean esColor(String palabra, String[] coloresDefinidos) {
        for (int i = 0; i < coloresDefinidos.length; i++) {
            if (palabra.equals(coloresDefinidos[i])) {
                return true;
            }
        }
        return false;
    }
}

