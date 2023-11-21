package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        String frase = "";
        String espacio = " ";
        boolean inicio = true;
        while (!palabra.equals("fin")) {
            frase = frase + palabra;
            if (!inicio) {
                frase = frase + espacio;
            }
            System.out.println("Ingrese la siguiente palabra :");
            palabra = sc.nextLine();
            inicio = false;
        }
        System.out.println(frase);
    }
}
