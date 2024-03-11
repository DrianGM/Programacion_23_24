package org.velazquez.U6_ficheros.tarea_1.ejercicio_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_7/texto.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            Scanner sc = new Scanner(System.in);
            int lineaInicial = 1;
            //Contador que controla la linea que estamos leyendo en el momento.
            int lineaFinal = 24;
            int numeroLinea = 1;
            String linea;
            boolean seguir = true;
            //Variable booleana que controla si se sigue con la ejecucion o no.
            //Como es la primera vez que se lee, viene por defecto en true.
            while (seguir){
                //Mientras que no se haya llegado al final o a la linea final, imprimir la linea y aumentar contador.
                while ((linea = br.readLine()) != null && numeroLinea!=lineaFinal+1) {
                    if (numeroLinea >= lineaInicial && numeroLinea <= lineaFinal) {
                        System.out.println(linea);
                        numeroLinea++;
                    }
                }
                //Cuando se ha llegado a la linea final, preguntar si seguir o no.
                System.out.println("Ingrese true para seguir leyendo, false para parar el programa.");
                seguir = sc.nextBoolean();
                //Si se sigue, leer la linea que no se habia podido imprimir en el anterior while y expandir el rango.
                if (seguir){
                    System.out.println(linea);
                    numeroLinea++;
                    lineaInicial=lineaInicial+24;
                    lineaFinal=lineaFinal+24;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
