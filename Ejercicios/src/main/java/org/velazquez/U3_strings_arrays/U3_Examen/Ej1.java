package org.velazquez.U3_strings_arrays.U3_Examen;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = sc.nextLine();
        String resultadoParcial = "";
        for (int i = 0; i < palabra.length(); i++) {
            resultadoParcial = resultadoParcial + "-";
        }
        System.out.println(resultadoParcial);
        String letraString = "";
        char letra;
        while (!palabra.equals(resultadoParcial)) {
            System.out.println("Ingrese un caracter :");
            letraString = sc.nextLine();
            letra = letraString.charAt(0);
            resultadoParcial = palabraAhorcado(palabra, resultadoParcial, letra);
            System.out.println(resultadoParcial);
        }
        System.out.println("Felicidades, lo has resuelto.");
    }

    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {
        String resultado = "";
        for (int i = 0; i < cadena_a_adivinar.length(); i++) {
            if (cadena_a_adivinar.charAt(i) == letra) {
                resultado = resultado + letra;
            } else {
                resultado = resultado + resultado_parcial.charAt(i);
            }
        }
        return resultado;
    }
}
