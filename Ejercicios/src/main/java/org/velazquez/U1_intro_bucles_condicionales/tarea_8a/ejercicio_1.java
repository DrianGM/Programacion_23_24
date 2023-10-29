package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int num = teclado.nextInt();
        while (num!=0){
            if (num % 2 == 0) {
                System.out.println("Es par.");
            } else {
                System.out.println("Es impar");
            }
            if (num > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo.");
            }
            System.out.println("El cuadrado de " + num + " es " + num * num);
            num= teclado.nextInt();
        }
    }
}

