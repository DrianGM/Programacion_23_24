package org.velazquez.U1_intro_bucles_condicionales.Practica_U1;

import java.util.Scanner;

public class decimal_asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número :");
        int n = sc.nextInt();
        int nInvertido = 0;
        int digito = 0;
        while (n != 0) {
            digito = n % 10;
            nInvertido = nInvertido * 10 + digito;
            n = n / 10;
        }
        while (nInvertido != 0) {
            digito = nInvertido % 10;
            for (int i = 1; i <= digito; i++) {
                System.out.print("*");
            }
            nInvertido /= 10;
            if (nInvertido != 0) {
                System.out.print("_");
            }
        }
    }
}
