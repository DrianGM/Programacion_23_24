package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class tarea_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre completo (Nombre y apellidos) :");
        String cadena = sc.nextLine();
        System.out.println("La cadena sin modificar es: " + cadena);
        String sinVocales = cadena.replaceAll("[a,á,e,é,i,í,o,ó,u,ú,?,�]", "");
        System.out.println("La cadena sin vocales es: " + sinVocales);
    }
}
