package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número : ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        switch (num) {
            case 1:
                System.out.println("El número 1 equivale a Lunes.");
                break;
            case 2:
                System.out.println("El número 2 equivale a Martes.");
                break;
            case 3:
                System.out.println("El número 3 equivale a Miércoles.");
                break;
            case 4:
                System.out.println("El número 4 equivale a Jueves.");
                break;
            case 5:
                System.out.println("El número 5 equivale a Viernes.");
                break;
            case 6:
                System.out.println("El número 6 equivale a Sábado.");
                break;
            case 7:
                System.out.println("El número 7 equivale a Domingo.");
                break;
            default:
                System.out.println("Ese número no equivale a ningún día de la semana.");
                break;
        }
    }
}

