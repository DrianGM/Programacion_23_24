package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud de la clave");
        int longitud = sc.nextInt();
        int num;
        int numeroMax = 5;
        int numeroMin = 1;
        int[] numeros = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
            numeros[i] = num;
        }
        System.out.println("Intente acertarla :");
        int intento = sc.nextInt();
        int[] respuesta = new int[longitud];
        do {
            for (int i = 0; i < longitud; i++) {
                int resto = intento % 10;
                intento /= 10;
                respuesta[longitud - 1 - i] = resto;
            }
            if (Arrays.equals(numeros, respuesta)) {
                System.out.println("Felicidades, acerto la clave");
                break;
            } else {
                for (int i = 0; i < longitud; i++) {
                    if (numeros[i] == respuesta[i]) {
                        System.out.println(respuesta[i] + " es igual.");
                    } else {
                        if (numeros[i] < respuesta[i]) {
                            System.out.println(respuesta[i] + " es mayor.");
                        } else {
                            System.out.println(respuesta[i] + " es menor.");
                        }
                    }
                }
                System.out.println("Intente acertarla de nuevo :");
                intento = sc.nextInt();
            }
        } while (true);
    }
}