package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class tarea_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra :");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese la segunda palabra :");
        String palabra2 = sc.nextLine();
        if (palabra1.length() > palabra2.length()) {
            System.out.println("La segunda palabra es más corta.");
        } else if (palabra1.length() < palabra2.length()) {
            System.out.println("La primera palabra es más corta.");
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }
    }
}
