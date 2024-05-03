package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_3;

//Pedir numeros enteros positivos por consola y guardarlos en un fichero binario hasta que se introduzca un numero negativo.
//Leer todos los enteros guardados y mostrarlos por pantalla.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_3\\archivo.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            while (true) {
                System.out.println("Ingresa un numero entero positivo (numero negativo para terminar):");
                int num = scanner.nextInt();
                if (num < 0) {
                    break;
                }
                dos.writeInt(num);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Numeros guardados en el archivo:");
            while (dis.available() > 0) {
                int num = dis.readInt();
                System.out.println(num);
            }
        } catch (IOException e) {
            System.out.println("Error al leer del archivo: " + e.getMessage());
        }
    }
}
