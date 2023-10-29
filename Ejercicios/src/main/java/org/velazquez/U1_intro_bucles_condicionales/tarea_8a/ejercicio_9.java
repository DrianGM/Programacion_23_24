package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arbolActual = 1;
        int numMasAlto = 0;
        int alturaMasAlta = 0;
        while (true) {
            System.out.println("Ingrese la altura en cm del árbol " + arbolActual + " (-1 para finalizar): ");
            int altura = scanner.nextInt();
            if (altura == -1) {
                break;
            }
            if (altura > alturaMasAlta) {
                alturaMasAlta = altura;
                numMasAlto = arbolActual;
            }
            arbolActual++;
        }
        if (alturaMasAlta > 0) {
            System.out.println("El árbol más alto es el árbol " + numMasAlto + " con una altura de " + alturaMasAlta + " cm.");
        } else {
            System.out.println("No se ha ingresado ninguna altura válida.");
        }
    }
}