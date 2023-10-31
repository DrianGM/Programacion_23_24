package org.velazquez.U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_6b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int n = scanner.nextInt();
        System.out.print("Introduce el carácter de la pirámide: ");
        String caracter = scanner.next();
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
