package org.velazquez.U3_arrays.Practica;

public class cuadrado3x3 {
    public static void dibujarCuadrado3x3(int veces) {
        int altura = 3;
        for (int i = 1; i <= veces; i++) {
            for (int j = 1; j <= altura; j++) {
                for (int k = 1; k <= altura; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        dibujarCuadrado3x3(1);
    }
}

