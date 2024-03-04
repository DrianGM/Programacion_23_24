package org.velazquez.U6_ficheros.tarea_1.ejercicio_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre :");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad :");
        int edad = sc.nextInt();
        String ubiArchivo = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_2/datos.txt";
        File archivo = new File(ubiArchivo);
        if (archivo.exists()) {
            //Otra manera de borrar el archivo que no es .delete
            BufferedWriter bw = new BufferedWriter(new FileWriter(ubiArchivo));
            bw.write("");
            archivo.createNewFile();
        } else {
            archivo.createNewFile();
        }
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_2/datos.txt"));
            String cadena = nombre;
            for (int i = 0; i < cadena.length(); i++) {
                out.write(cadena.charAt(i));
            }
            cadena = String.valueOf(edad);
            out.newLine();
            out.write(cadena);
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
