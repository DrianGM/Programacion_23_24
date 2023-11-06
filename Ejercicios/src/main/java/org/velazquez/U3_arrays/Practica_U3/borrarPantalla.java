package org.velazquez.U3_arrays.Practica_U3;

public class borrarPantalla {
    public static void borrarPantalla(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println();
        }
    }

    public static void main(String args[]) {
        borrarPantalla(25);
    }
}

