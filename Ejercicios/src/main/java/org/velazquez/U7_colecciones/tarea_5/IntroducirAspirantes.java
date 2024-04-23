package org.velazquez.U7_colecciones.tarea_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class IntroducirAspirantes implements Serializable {
    Map<Integer, Aspirante> mapa = new LinkedHashMap<>();

    private static int idIncremental = 1;

    public void InsertaAspirante(){
        boolean continuar = true;
        while (continuar){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del aspirante :");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el dni del aspirante :");
            String dni = sc.nextLine();
            System.out.println("Ingresa el telefono del aspirante :");
            String telefono = sc.nextLine();
            Aspirante asp = new Aspirante(nombre,dni,telefono);
            mapa.put(idIncremental,asp);
            idIncremental++;
            System.out.println("¿Quiere ingresar el siguiente usuario? S/N");
            String respuesta = sc.nextLine();
            if (respuesta.equals("N")){
                continuar=false;
            }
        }
    }

    public void guardarFicheros() {
        try (ObjectOutputStream stream =
                     new ObjectOutputStream(
                             new FileOutputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\tarea_5\\aspirantes.dat"))) {
            stream.writeObject(mapa);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (ObjectOutputStream stream =
                     new ObjectOutputStream(
                             new FileOutputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\tarea_5\\ids_aspirantes.dat"))) {
            List<Integer> idsAspirantesLista = new ArrayList<>();
            for (int i=0;i<mapa.size();i++){
                idsAspirantesLista.add(i);
            }
            stream.writeObject(idsAspirantesLista);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
