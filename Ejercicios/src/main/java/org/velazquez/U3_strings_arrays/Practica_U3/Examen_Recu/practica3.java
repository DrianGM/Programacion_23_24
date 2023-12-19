package org.velazquez.U3_strings_arrays.Practica_U3.Examen_Recu;

import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tablero = new String[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]=calcularCasilla(i,j);
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ingrese la posición de la reina :");
        String reina = sc.nextLine();
        System.out.println("Ingrese la posición del rey :");
        String rey = sc.nextLine();
        boolean jaque = jaque(reina,rey);
    }

    public static boolean jaque(String posRey,String posReina){
        String[][] tablero = new String[8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]=calcularCasilla(i,j);
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals(posReina)){
                    //Aquí pongo el código que comprueba si el rey está en una de las casillas que la reina amenaza pero me da pereza xd
                }
            }
        }
        return false;
    }






















    public static String calcularCasilla(int fila, int columna) {
        String casilla = "";
        switch (columna) {
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
        switch (fila) {
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
}
