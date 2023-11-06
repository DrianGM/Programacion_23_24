package org.velazquez.U3_arrays.Practica_arrays;

public class cuadradoAnchoLargo {
    public static void cuadradoAnchoLargo(int largo, int ancho) {
        for (int j = 1; j <= largo; j++) {
            for (int k = 1; k <= ancho; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        cuadradoAnchoLargo(6, 7);
    }
}

