package org.velazquez.U3_strings_arrays.Practica_U3.Entregable2021_Tarde;

import java.util.Scanner;

public class buscaminasSinTerminar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la capacidad del array.");
        int capacidad = sc.nextInt();
        String[][] tabla = new String[capacidad][capacidad];
        String bomba = "x";
        int cantidadBombas = 0;
        int num;
        int randomMax = 2;
        int randomMin = 1;
        for (int i = 0; i < capacidad; i++) {
            for (int j = 0; j < capacidad; j++) {
                num = (int) (Math.random() * ((randomMax + 1) - randomMin)) + randomMin;
                if (num==1){
                    tabla[i][j] = "x";
                } else {
                    tabla[i][j] = "-";
                }
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        boolean vivo = true;
        while (vivo){
            System.out.println("Introduzca la fila y después la columna :");
            int fila = sc.nextInt();
            int columna = sc.nextInt();
            if (tabla[fila][columna].equals("x")){
                System.out.println("La posición "+fila+","+columna+" tiene una bomba, esta muerto.");
                break;
            } else {
                cantidadBombas = comprobarEsquinas(tabla,fila,columna,bomba);
            }
        }
    }

    public static int comprobarEsquinas(String[][] tabla,int fila,int columna, String bomba){
        int cantidadBombas=0;
        return cantidadBombas;
    }
}
