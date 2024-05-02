package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_4;

//Pedir un entero n por consola. A continuacion, pedir n numeros double, que iremos guardando en una tabla. Guardar la tabla en un archivo binario.

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
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_4\\archivo.bin"))) {
            out.writeObject(array);
            System.out.println("Se ha guardado la tabla.");
        } catch (IOException e) {
            System.out.println("Error al leer del archivo: " + e.getMessage());
        }
    }
}

