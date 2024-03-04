package org.velazquez.U6_ficheros.tarea_1.ejercicio_4;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ubiFichero = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_4/carta.txt";
        int caracteres = 0;
        int lineas = 1;
        int palabras = 1;
        String texto = "";
        try {
            FileReader in = new FileReader(ubiFichero);
            int c = in.read();
            while (c != -1){
                texto += (char) c;
                c = in.read();
                caracteres++;
                if (c == ' '){
                    palabras++;
                }
            }
            lineas++;
            palabras++;
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("El archivo tiene " + caracteres + " caracteres.");
        System.out.println("El archivo tiene " + lineas + " lineas.");
        System.out.println("El archivo tiene " + palabras + " palabras.");
    }
}
