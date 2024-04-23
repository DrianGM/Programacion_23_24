package org.velazquez.U6_ficheros.tarea_2.ejercicio_1;

import java.io.File;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un double:");
        double num = sc.nextDouble();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream (new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_1\\archivo.bin")));){
            dos.writeDouble(num);
            System.out.println("El número ha sido guardado en archivo.bin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}