package org.velazquez.U6_ficheros.tarea_1.ejercicio_3.v2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ubicación del archivo:");
        String ubicacion = scanner.nextLine();
        File original = new File(ubicacion);
        String nombreArchivo = original.getName();
        String carpetaArchivo = original.getParent();
        File copia = new File(carpetaArchivo + "/copia_de_" + nombreArchivo);
        String texto = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(ubicacion));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(copia));
            for (int i = 0; i < texto.length(); i++) {
                out.write(texto.charAt(i));
            }
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

