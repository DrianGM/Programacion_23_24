package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase : ");
        String frase = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("Se han encontrado " + contador + " espacios en la frase.");
    }
}
