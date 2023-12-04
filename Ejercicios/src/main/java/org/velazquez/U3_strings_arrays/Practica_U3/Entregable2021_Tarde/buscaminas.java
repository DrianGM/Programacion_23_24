package org.velazquez.U3_strings_arrays.Practica_U3.Entregable2021_Tarde;

import java.util.Random;
import java.util.Scanner;

public class buscaminas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce el tamaño del tablero (NxN): ");
        int n = scanner.nextInt();
        char[][] tablero = new char[n][n];
        int[][] bombas = new int[n][n];
        int contadorBombas = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablero[i][j] = '-';
                if (random.nextInt(100) < 20) { //20% de probabilidad de que haya una bomba
                    bombas[i][j] = 1;
                    contadorBombas++;
                } else {
                    bombas[i][j] = 0;
                }
            }
        }

        if (contadorBombas == 0) {
            System.out.println("No se han generado bombas, por favor reinicia el juego.");
            return;
        }
        int x, y;
        do {
            System.out.println("Introduce las coordenadas x,y (0-" + (n - 1) + "): ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (bombas[x][y] == 1) {
                System.out.println("¡Has encontrado una bomba! Pérdida total.");
            } else {
                int bombasCercanas = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int newX = x + i;
                        int newY = y + j;
                        if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                            bombasCercanas += bombas[newX][newY];
                        }
                    }
                }
                System.out.println("Hay " + bombasCercanas + " bombas en las casillas de alrededor.");
            }
        } while (bombas[x][y] != 1);
        scanner.close();
    }
}
