package org.velazquez.U2_depuracion.Practica_U2;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        int i, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();

        System.out.println("Mostrando los 10 números posteriores");
        i = num;

        while (num + 10 > i) {
            i++;
            System.out.println("Número posterior " + i);
        }
    }
}
