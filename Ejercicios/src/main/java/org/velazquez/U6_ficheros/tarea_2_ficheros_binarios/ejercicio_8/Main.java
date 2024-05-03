package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_8;

//Crear un array de numeros aleatorios menores que 100, ordenados de menor a mayor y guardarlos en un fichero binario.
//Recuperarlos del archivo binario y mostrarlos por consola.

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_8\\archivo.bin";
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int numeroMax = 99;
            int numeroMin = 0;
            int num = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
            array[i]=num;
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(array);
            System.out.println("Se ha guardado la tabla.");
        } catch (IOException e) {
            System.out.println("Error al leer del archivo: " + e.getMessage());
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {
            int[] array2 = (int[]) in.readObject();
            System.out.println("Numeros de la tabla:");
            System.out.println(Arrays.toString(array2));
        } catch (IOException e) {
            System.out.println("Error al leer del archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found");
        }
    }
}
