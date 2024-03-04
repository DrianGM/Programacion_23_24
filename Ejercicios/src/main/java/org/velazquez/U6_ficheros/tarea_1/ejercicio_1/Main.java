package org.velazquez.U6_ficheros.tarea_1.ejercicio_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero (presiona Enter para usar el por defecto): ");
        String nombreFichero = scanner.nextLine();
        if (nombreFichero.isEmpty()) {
            nombreFichero = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_1/prueba.txt";
        }
        String texto = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(nombreFichero));
            texto = "";
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    }
}