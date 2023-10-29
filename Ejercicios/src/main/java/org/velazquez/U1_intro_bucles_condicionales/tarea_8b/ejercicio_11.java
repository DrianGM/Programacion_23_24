package org.velazquez.U1_intro_bucles_condicionales.tarea_8b;

import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura :");
        int n = teclado.nextInt();
        while (n%2==0 || n<3){
            System.out.println("La altura es inválida, ingrésela de nuevo (debe ser un número impar mayor que 3 : ");
            n = teclado.nextInt();
        }
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <=n; j++) {
                if (i==j || j+i==n+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
