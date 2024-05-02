package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_5;

//Leer fichero binario con un array de numeros double.

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_4\\archivo.bin"))) {
            double[] array = (double[]) in.readObject();
            System.out.println("Numeros de la tabla:");
            System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            System.out.println("Error al leer del archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found");
        }
    }
}
