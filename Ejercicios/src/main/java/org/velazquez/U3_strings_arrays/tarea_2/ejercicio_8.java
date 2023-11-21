package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase que quiera pasar por el traductor :");
        String javalin = "Javalín, javalón";
        String javalen = "javalén, len, len";
        String frase = sc.nextLine();
        boolean resultado1 = frase.toLowerCase().contains(javalin.toLowerCase());
        boolean resultado2 = frase.toLowerCase().contains(javalen.toLowerCase());
        if (resultado1) {
            System.out.println("La frase está escrita en el idioma de Javalandia.");
            String frase2 = frase.replaceAll(javalin, "");
            System.out.println(frase2);
        } else {
            if (resultado2) {
                System.out.println("La frase está escrita en el idioma de Javalandia.");
                String frase2 = frase.replaceAll(javalen, "");
                System.out.println(frase2);
            } else {
                System.out.println("La frase no está escrita en el idioma de Javalandia.");
            }
        }
    }
}
