package org.velazquez.U3_strings_arrays.tarea_4;


//import java.util.Arrays;

public class ejercicio_5 {
    public static void main(String[] args) {
        int randomMax = 300;
        int randomMin = 200;
        int mediaDiagonal = 0;
        int contador = 0;
        int minimo = 301;
        int maximo = 0;
        int num = (int) (Math.random() * ((randomMax + 1) - randomMin)) + randomMin;
        int[][] tabla = new int[10][10];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = num;
                if (i == j) {
                    System.out.println(num);
                    mediaDiagonal = mediaDiagonal + num;
                    contador++;
                    if (num > maximo) {
                        maximo = num;
                    } else {
                        if (num < minimo) {
                            minimo = num;
                        }
                    }
                }
                num = (int) (Math.random() * ((randomMax + 1) - randomMin)) + randomMin;
            }
        }
        //System.out.println(Arrays.deepToString(tabla));
        mediaDiagonal = mediaDiagonal / contador;
        System.out.println("La media de la diagonal es de :" + mediaDiagonal);
        System.out.println("El numero maximo es : " + maximo);
        System.out.println("El numero minimo es : " + minimo);
    }
}