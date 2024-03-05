package org.velazquez.U6_ficheros.tarea_1.ejercicio_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String nombreArchivo = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_7/texto.txt"; // Cambia esto a la ruta de tu archivo
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                Scanner sc = new Scanner(System.in);
                int lineaInicial = 1;
                int lineaFinal = 24;
                String linea;
                int numeroLinea = 1;
                while ((linea = br.readLine()) != null) {
                    if (numeroLinea >= lineaInicial && numeroLinea <= lineaFinal) {
                        System.out.println(linea);
                    }
                    System.out.println("Escriba true para seguir leyendo");
                    boolean respuesta = sc.nextBoolean();
                    if (respuesta){
                        
                    }
                    numeroLinea++;
                }

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }
}
