package org.velazquez.U6_ficheros.tarea_1.ejercicio_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String ruta1 = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_8/perso1.txt";
        String ruta2 = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_8/perso2.txt";
        String ruta3 = "src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_8";
        File todos = new File(ruta3 + "/todos.txt");
        if (!todos.exists()) {
            todos.createNewFile();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(ruta1))) {
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}