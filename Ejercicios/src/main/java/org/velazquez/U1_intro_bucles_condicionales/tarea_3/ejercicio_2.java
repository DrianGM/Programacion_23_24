package org.velazquez.U1_intro_bucles_condicionales.tarea_3;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Ingresa tu año de nacimiento: ");
        Scanner teclado = new Scanner(System.in);
        short a = teclado.nextShort();
        System.out.println("Ingresa el año actual: ");
        Scanner teclado2 = new Scanner(System.in);
        short b = teclado2.nextShort();
        short c = (short) (b - a);
        System.out.println("Este año tu edad será = " + c);
    }
}
