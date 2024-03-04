package org.velazquez.U6_ficheros.tarea_1.ejercicio_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ubiFichero = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_5/numeros.txt";
        try {
            BufferedReader in = new BufferedReader(new FileReader(ubiFichero));
            String texto = "";
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
