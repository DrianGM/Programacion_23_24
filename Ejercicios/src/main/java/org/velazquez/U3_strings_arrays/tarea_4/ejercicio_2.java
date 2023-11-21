package org.velazquez.U3_strings_arrays.tarea_4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] original = new String[8];
        String[] resultado = new String[8];
        for (int i = 0; i < original.length; i++) {
            System.out.println("Ingrese una palabra :");
            original[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(original));
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
            }
        }
    }
}
