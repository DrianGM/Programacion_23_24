package org.velazquez.U6_ficheros.tarea_2.ejercicio_5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_4\\archivo.bin"))){
            while (true){
                System.out.println(dis.readDouble());
            }
        } catch (IOException e) {
            System.out.println("Fin del archivo");
        }
    }
}
