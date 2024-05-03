package org.velazquez.U7_colecciones.Practica.Entregables.Examen_1920_Maniana;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concurso {
    private String nombre;
    private String localidad;
    Map<String, List<Perro>> perrosPorRaza = new HashMap<>();

    public Concurso(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.perrosPorRaza = new HashMap<>();
    }


    public void addDog(String raza, Perro perro){
        if(perro.getRaza().equals(raza)){
            if (!perrosPorRaza.containsKey(raza)){
                perrosPorRaza.put(raza, new ArrayList<>());
            }
            perrosPorRaza.get(raza).add(perro);
        } else {
            System.out.println("El perro que ha ingresado no es de la raza "+raza);
        }
    }

    public void disqualifyDog(Perro perro){
        for (List<Perro> perros : perrosPorRaza.values()) {
            if (perros.remove(perro)) {
                return;
            }
        }
        System.out.println("Perro no inscrito");
    }

    public void ownerDogs(int numSocio){
        List<Perro> perros = new ArrayList<>();
        for (List<Perro> perrosRaza : perrosPorRaza.values()) {
            for (Perro perro : perrosRaza) {
                if (perro.getPropietario().getNumSocio() == numSocio) {
                    perros.add(perro);
                }
            }
        }
        if (perros.isEmpty()) {
            System.out.println("Este socio no tiene perros inscritos");
        } else {
            for (Perro perro : perros) {
                System.out.println(perro);
            }
        }
    }

    public void perrosporPeso(String raza){
        List<Perro> perros = perrosPorRaza.get(raza);
        perros.sort((p1, p2) -> Double.compare(p2.getPeso(), p1.getPeso()));
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    public void perrosporEdad(String raza){
        List<Perro> perros = perrosPorRaza.get(raza);
        perros.sort((p1, p2) -> Integer.compare(p2.getEdad(), p1.getEdad()));
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    public void cargarPerros(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\Examen_1920\\perros.dat"))) {
            while (true) {
                Perro perro = (Perro) ois.readObject();
                addDog(perro.getRaza(), perro);
            }
        } catch (EOFException e) {
            // Fin del fichero
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar perros: " + e.getMessage());
        }
    }

    public void guardarPerros(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\Examen_1920\\perros.dat"))) {
            for (List<Perro> perrosRaza : perrosPorRaza.values()) {
                for (Perro perro : perrosRaza) {
                    oos.writeObject(perro);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al guardar perros: " + e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Map<String, List<Perro>> getPerrosPorRaza() {
        return perrosPorRaza;
    }
}