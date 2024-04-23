package org.velazquez.U6_ficheros.tarea_2.ejercicio_4;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero :");
        int n = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce un numero double :");
            array[i] = sc.nextDouble();
        }
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_4\\archivo.bin"));
            for (double num : array) {
                dos.writeDouble(num);
            }
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

