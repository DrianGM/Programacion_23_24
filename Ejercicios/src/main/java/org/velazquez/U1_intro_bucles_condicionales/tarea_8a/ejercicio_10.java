package org.velazquez.U1_intro_bucles_condicionales.tarea_8a;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número del 1 al 10 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num<1 || num>10){
            System.out.println("Ese número no entra dentro del rango, por favor, ingrese un número del 1 al 10 : ");
            num = sc.nextInt();
        }
        for (int i = 1; i <= 10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}