package org.velazquez.U6_ficheros.tarea_2_ficheros_binarios.ejercicio_9;

//Crear un fichero binario e insertar varios objetos de tipo Tren. Cerrar el fichero y leerlo, mostrando todos los objetos por pantalla.

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U6_ficheros\\tarea_2\\ejercicio_9\\archivo.bin";
        Tren tren1 = new Tren("Tren A", 1);
        Tren tren2 = new Tren("Tren B", 2);
        Tren tren3 = new Tren("Tren C", 3);
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tren1);
            oos.writeObject(tren2);
            oos.writeObject(tren3);
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Tren tren;
            while (fis.available() > 0) {
                tren = (Tren) ois.readObject();
                System.out.println(tren.toString());
            }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

