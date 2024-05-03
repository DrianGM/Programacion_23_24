package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_1;

//Pedir un double por consola y guardarlo en un archivo binario.

import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un double:");
        double num = sc.nextDouble();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream ("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_1\\archivo.bin"))){
            dos.writeDouble(num);
            System.out.println("El número ha sido guardado en archivo.bin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}