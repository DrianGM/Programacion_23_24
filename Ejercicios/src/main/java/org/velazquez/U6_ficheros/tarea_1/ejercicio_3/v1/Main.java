package org.velazquez.U6_ficheros.tarea_1.ejercicio_3.v1;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        String nombreFichero = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_3/v1/original.txt";
        String texto = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(nombreFichero));
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
            BufferedWriter out = new BufferedWriter(new FileWriter("src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_3/v1/copia.txt"));
            for (int i = 0; i < texto.length(); i++) {
                out.write(texto.charAt(i));
            }
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
