package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int mayores = 0;
        int cantidad = 0;
        System.out.println("Introduzca la edad del alumno.");
        int edad = teclado.nextInt();
        while (edad >= 0) {
            cantidad++;
            if (edad >= 18) {
                mayores++;
            }
            System.out.println("Hay " + mayores + " mayores de edad.");
            suma = suma + edad;
            System.out.println("La suma de las edades introducidas es " + suma);
            System.out.println("Y la media es " + suma / cantidad);
            System.out.println("Introduzca la edad del alumno.");
            edad = teclado.nextInt();
        }
        System.out.println("Hay " + cantidad + " alumnos.");
        System.out.println("Hay " + mayores + " mayores de edad.");
        System.out.println("La suma de las edades introducidas es " + suma);
        System.out.println("Y la media es " + suma / (cantidad));
    }
}

