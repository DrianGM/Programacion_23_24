package org.velazquez.U1_intro_bucles_condicionales.tarea_3;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Ingresa el primer número: ");
        Scanner teclado = new Scanner(System.in);
        byte a = teclado.nextByte();
        System.out.println("Ingresa el segundo número: ");
        Scanner teclado2 = new Scanner(System.in);
        byte b = teclado2.nextByte();
        System.out.println("El resultado de la suma es = ");
        System.out.print(a + b);
    }
}
