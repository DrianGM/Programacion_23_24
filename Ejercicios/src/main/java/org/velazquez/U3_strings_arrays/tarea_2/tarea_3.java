package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class tarea_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase : ");
        String frase = sc.nextLine();
        int posicion = Math.round(frase.length() / 2);
        char mitad = frase.charAt(posicion);
        if (mitad == ' ') {
            System.out.println("El caracter de la posición central es un espacio.");
        } else {
            System.out.println("El caracter de la posición central no es un espacio.");
        }
    }
}
