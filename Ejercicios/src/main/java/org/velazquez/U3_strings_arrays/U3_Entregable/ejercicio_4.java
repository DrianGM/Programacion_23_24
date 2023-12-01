package org.velazquez.U3_strings_arrays.U3_Entregable;

import java.util.Arrays;

public class ejercicio_4 {
    public static char[][] matrizLetras(String frase) {
        int fila = 0;
        int columna = 0;
        int capacidad = 0;
        String sinEspacios = sinEspacios(frase);
        if (sinEspacios.length() % 5 == 0) {
            capacidad = (sinEspacios.length() / 5);
        } else {
            capacidad = (sinEspacios.length() / 5) + 1;
        }
        char[][] matriz = new char[capacidad][5];
        for (int i = 0; i < sinEspacios.length(); i++) {
            matriz[fila][columna] = sinEspacios.charAt(i);
            if (columna == 4) {
                fila++;
                columna = 0;
            } else {
                columna++;
            }
        }
        return matriz;
    }

    public static String sinEspacios(String frase) {
        String sinEspacios = frase.replace(" ", "");
        return sinEspacios;
    }

    public static void main(String[] args) {
        String frase = "Hola que tal estas hoy martes?";
        System.out.println(frase);
        char[][] matriz = matrizLetras(frase);
        System.out.println(Arrays.deepToString(matriz));
    }
}
