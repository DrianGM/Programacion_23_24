package org.velazquez.U1_intro_bucles_condicionales.Practica_2.Examen_1;

import java.util.Scanner;

public class arbol {
    public static void main(String[] args) {
        int n=7;
        String caracter = "^";
        for (int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print("  ");
            }
            for (int j=1;j<i;j++){
                if (i==n || j==1){
                    System.out.print(caracter+" ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j=1;j<=i;j++){
                if (j==i ||i==n){
                    System.out.print(caracter+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}