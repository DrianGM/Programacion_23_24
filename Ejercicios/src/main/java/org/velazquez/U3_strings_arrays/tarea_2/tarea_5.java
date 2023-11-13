package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class tarea_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase :");
        String frase = sc.nextLine();
        String soloVocales = "";
        char letra;

        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
                soloVocales += letra;
            }
        }
        System.out.println("cadena: " + frase);
        System.out.println("cadena solo vocales: " + soloVocales);
    }
}
