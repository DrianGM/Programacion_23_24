package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int num = teclado.nextInt();
        int total = num - 1;
        int calculo = num;
        while (total != 0) {
            calculo = calculo * total;
            total--;
        }
        System.out.println("Su factorial es :"+calculo);
    }
}