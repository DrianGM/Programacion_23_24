package org.velazquez.U1_intro_bucles_condicionales.Practica;

import java.util.Scanner;

public class primera_cifra_numero_entero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cifra=0;
        while (n!=0){
            cifra=n%10;
            n/=10;
        }
        System.out.println(cifra);
    }
}
