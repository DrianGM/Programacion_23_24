package org.velazquez.U3_strings_arrays.tarea_2;

import java.util.Scanner;

public class ejercicio_7 {
    public static void compararStrings(String s1, String s2) {
        int resultado = s1.compareTo(s2);
        if (resultado > 0) {
            System.out.println("Menor");
        } else if (resultado < 0) {
            System.out.println("Mayor");
        } else {
            System.out.println("Igual");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos al juego Adivina La Contraseña.");
        System.out.println("Jugador 1 -> Ingrese la contraseña a adivinar : ");
        String password = sc.nextLine();
        int x = password.length() - 1;
        System.out.println("Pistas :");
        System.out.println("Número de caracteres : " + (password.length()));
        System.out.println("Primera letra de la contraseña : " + password.charAt(0));
        System.out.println("Última letra de la contraseña : " + password.charAt(x));
        System.out.println("Jugador 2 -> Ingrese su respuesta : ");
        String respuesta = sc.nextLine();
        if (!respuesta.equals(password)) {
            compararStrings(respuesta, password);
        } else {
            System.out.println("¡Acertaste!");
        }
    }
}
