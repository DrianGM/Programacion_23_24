package org.velazquez.U3_strings_arrays.tarea_4;

public class ejercicio_6 {
    public static int numeroMaximo(int[][] array) {
        int maximo = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maximo) {
                    maximo = array[i][j];
                }
            }
        }
        return maximo;
    }

    public static int numeroMinimo(int[][] array) {
        int minimo = 1000;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minimo) {
                    minimo = array[i][j];
                }
            }
        }
        return minimo;
    }

    public static void main(String[] args) {
        int numeroMax = 1000;
        int numeroMin = 0;
        int filas = 6;
        int columnas = 10;
        int[][] array = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++){
                int num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
                array[i][j]=num;
            }
        }
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int maximo = numeroMaximo(array);
        int minimo = numeroMinimo(array);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (array[i][j] == maximo) {
                    System.out.println("El numero maximo es " + maximo + " y esta en la fila " + i + " columna " + j);
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (array[i][j] == minimo) {
                    System.out.println("El numero minimo es " + minimo + " y esta en la fila " + i + " columna " + j);
                }
            }
        }
    }
}

