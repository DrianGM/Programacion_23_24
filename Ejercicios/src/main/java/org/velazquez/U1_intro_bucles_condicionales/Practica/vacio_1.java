package org.velazquez.U1_intro_bucles_condicionales.Practica;

public class vacio_1 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print("_ ");
            }
            System.out.print("* ");
            for (int j=1;j<i;j++){
                System.out.print("_ ");
            }

            System.out.println();
        }
    }
}
