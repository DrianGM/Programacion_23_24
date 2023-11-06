package org.velazquez.U1_intro_bucles_condicionales.U1_Examen;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo de 6 cifras : ");
        int n = sc.nextInt();
        int n2 = n;
        int cifra = 0;
        while (n != 0) {
            cifra = n % 10;
            n /= 10;
        }
        int n3 = n2 / 100000;
        while (n3 != cifra) {
            System.out.println("No ha ingresado un numero de 6 cifras, por favor, ingrese uno correcto :");
            n = sc.nextInt();
            n2 = n;
            while (n != 0) {
                cifra = n % 10;
                n /= 10;
            }
            n3 = n2 / 100000;
        }
        System.out.println(n2);
        int mitad1 = n2 / 1000;
        int mitad2 = n2 % 1000;
        System.out.println(mitad1);
        System.out.println(mitad2);
        long contador = 0;
        for (long i = 1; i <= mitad1; i++) {
            if ((mitad1 % i) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            System.out.println("El numero " + mitad1 + " es primo");
        } else {
            System.out.println("El numero " + mitad1 + " no es primo");
        }
        contador = 0;
        for (long j = 1; j <= mitad2; j++) {
            if ((mitad2 % j) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            System.out.println("El numero " + mitad2 + " es primo");
        } else {
            System.out.println("El numero " + mitad2 + " no es primo");
        }
    }
}