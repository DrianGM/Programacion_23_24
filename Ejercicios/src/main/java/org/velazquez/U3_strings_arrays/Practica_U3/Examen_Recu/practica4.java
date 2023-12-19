package org.velazquez.U3_strings_arrays.Practica_U3.Examen_Recu;

import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int randomMax = 100;
        int randomMin = 10;
        int num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num = (int) (Math.random() * ((randomMax + 1) - randomMin)) + randomMin;
                arr[i][j] = num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ingrese la posición :");
        int pos = sc.nextInt();
        int valor = nEsimo(arr,pos);
        System.out.println("En la "+pos+"ésima posición está el número "+valor);
    }

    public static int nEsimo(int[][] arr, int posicion){
        int valor;
        int contador=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                contador++;
                if (contador==posicion){
                    valor = arr[i][j];
                    return valor;
                }
            }
        }
        return valor=-1;
    }
}
