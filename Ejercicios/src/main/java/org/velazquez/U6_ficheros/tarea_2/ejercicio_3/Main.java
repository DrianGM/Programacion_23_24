package org.velazquez.U6_ficheros.tarea_2.ejercicio_3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el siguiente numero que desea guardar (Numero negativo para terminar) :");
        int num = sc.nextInt();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_3\\archivo.bin")));){
            while (num>=0){
                dos.writeInt(num);
                System.out.println("Ingresa el siguiente numero que desea guardar (Numero negativo para terminar) :");
                num = sc.nextInt();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Todos los numeros enteros guardados en el fichero binario :");
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_3\\archivo.bin"))){
            while (true){
                System.out.println(dis.readInt());
            }
        } catch (IOException e) {
            System.out.println("Fin del archivo");
        }
    }
}
