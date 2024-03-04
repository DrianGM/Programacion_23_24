package org.velazquez.U6_ficheros.tarea_1.ejercicio_3.v2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la ubicacion del fichero a duplicar :");
        String ruta = sc.nextLine();
        File archivo = new File(ruta);
        if (archivo.exists()) {
            // El fichero ya existe
        } else {
            // El fichero no existe y hay que crearlo
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.close(); // Debe cerrarse la escritura del fichero
        }
    }
}
