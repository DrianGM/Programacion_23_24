package org.velazquez.U3_strings_arrays.tarea_4;

import java.util.Scanner;

public class ejercicio_4 {
    public static String calcularCasilla(int fila,int columna){
        String casilla = "";
        switch (columna){
            case 0:
                casilla = casilla + "A";
                break;
            case 1:
                casilla = casilla + "B";
                break;
            case 2:
                casilla = casilla + "C";
                break;
            case 3:
                casilla = casilla + "D";
                break;
            case 4:
                casilla = casilla + "E";
                break;
            case 5:
                casilla = casilla + "F";
                break;
            case 6:
                casilla = casilla + "G";
                break;
            case 7:
                casilla = casilla + "H";
                break;
        }
        switch (fila){
            case 0:
                casilla = casilla + "8";
                break;
            case 1:
                casilla = casilla + "7";
                break;
            case 2:
                casilla = casilla + "6";
                break;
            case 3:
                casilla = casilla + "5";
                break;
            case 4:
                casilla = casilla + "4";
                break;
            case 5:
                casilla = casilla + "3";
                break;
            case 6:
                casilla = casilla + "2";
                break;
            case 7:
                casilla = casilla + "1";
                break;
        }
        return casilla;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacidad = 8;
        String[][] tablero = new String[capacidad][capacidad];
        for (int i = 0; i < capacidad; i++) {
            for (int j = 0; j < capacidad; j++) {
                tablero[i][j] = calcularCasilla(i,j);
            }
        }
        for (int i=0;i<capacidad;i++){
            for (int j=0;j<capacidad;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Introduzca la posicion del alfil :");
        String posicion = sc.nextLine();
        int k=0;
        int l=0;
        for (int i = 0; i < capacidad; i++) {
            for (int j = 0; j < capacidad; j++) {
                if (tablero[i][j].equals(posicion)) {
                    k=i;
                    l=j;
                }
            }
        }
        System.out.println("El alfil puede moverse a las siguientes posiciones:");
        inferiorDerecha(tablero,k,l);
        superiorDerecha(tablero,k,l);
        inferiorIzquierda(tablero,k,l);
        superiorIzquierda(tablero,k,l);
    }


    public static void inferiorDerecha(String[][] tablero,int fila,int columna){
        while (fila!=7 && columna!=7){
            fila++;
            columna++;
            System.out.print(tablero[fila][columna]+" ");
        }
    }

    public static void superiorDerecha(String[][] tablero,int fila,int columna){
        while (fila!=0 && columna!=7){
            fila--;
            columna++;
            System.out.print(tablero[fila][columna]+" ");
        }
    }

    public static void inferiorIzquierda(String[][] tablero,int fila,int columna){
        while (fila!=7 && columna!=0){
            fila++;
            columna--;
            System.out.print(tablero[fila][columna]+" ");
        }
    }

    public static void superiorIzquierda(String[][] tablero,int fila,int columna){
        while (fila!=0 && columna!=0){
            fila--;
            columna--;
            System.out.print(tablero[fila][columna]+" ");
        }
    }
}
