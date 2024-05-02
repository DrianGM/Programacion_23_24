package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_6;

//Leer fichero binario con numeros double hasta que no quede ninguno.

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_4\\archivo.bin"))) {
            while (true) {
                double num = dis.readDouble();
                System.out.println(num);
            }
        } catch (EOFException e) {
            System.out.println("Fin del archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}