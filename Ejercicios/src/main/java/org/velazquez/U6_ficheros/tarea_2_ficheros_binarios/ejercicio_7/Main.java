package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_7;

//Pedir por teclado una frase y guardarla en un archivo binairo. Recuperar la frase del archivo y mostrarla por pantalla.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_7\\archivo.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(frase);
            System.out.println("Frase guardada en el archivo binario.");
        } catch (IOException e) {
            System.out.println("Error al guardar la frase: " + e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_7\\archivo.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            String fraseRecuperada = (String) ois.readObject();
            System.out.println("Frase del archivo binario : ");
            System.out.println(fraseRecuperada);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al mostrar la frase: " + e.getMessage());
        }
    }
}
