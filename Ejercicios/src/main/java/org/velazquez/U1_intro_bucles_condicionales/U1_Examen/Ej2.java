package org.velazquez.U1_intro_bucles_condicionales.U1_Examen;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo : ");
        int n = sc.nextInt();
        System.out.println("Ingrese un número entre 0 y 2 (ambos inclusive) : ");
        int n2 = sc.nextInt();
        while (n < 0) {
            System.out.println("Ha ingresado un número que no es un número entero positivo, por favor, ingrese otro : ");
            n = sc.nextInt();
        }
        while (n2 < 0 || n2 > 2) {
            System.out.println("Ha ingresado un número fuera del rango (del 0 al 2), por favor, ingrese otro : ");
            n2 = sc.nextInt();
        }
        int nCopia = n;
        int nCifras = 0;
        int resto = 0;
        while (nCopia != 0) {
            nCopia /= 10;
            nCifras++;
        }
        int numMulti = 10;
        System.out.println(nCifras);
        if (n2 == 1) {
            for (int i = 1; i <= nCifras / 2; i++) {
                resto = n % numMulti;
                n /= 10 * numMulti;
                n = (n * 10) + resto;
                System.out.println(n);
                numMulti = numMulti ^ i;
            }
        }
    }
}
