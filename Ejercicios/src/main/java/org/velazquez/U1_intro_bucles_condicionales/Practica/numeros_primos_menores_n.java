package org.velazquez.U1_intro_bucles_condicionales.Practica;

import java.util.Scanner;

public class numeros_primos_menores_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo n: ");
        int n = scanner.nextInt();

        int contadorPrimos = 0;

        // Bucle externo: Itera desde 2 hasta n
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true; // Suponemos que i es primo al principio
            // Bucle interno: Itera desde 2 hasta i-1
            for (int j = 2; j < i; j++) {
                // Verifica si i es divisible por j
                if (i % j == 0) {
                    esPrimo = false; // Si i es divisible por algún número entre 2 e i-1, no es primo
                    break; // Salimos del bucle interno
                }
            }

            if (esPrimo) {
                contadorPrimos++;
            }
        }
        System.out.println("El número de números primos entre 1 y " + n + " es: " + contadorPrimos);
    }
}

