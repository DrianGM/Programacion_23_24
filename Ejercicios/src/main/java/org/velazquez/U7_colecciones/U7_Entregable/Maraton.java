package org.velazquez.U7_colecciones.U7_Entregable;


import java.io.*;
import java.util.*;

public class Maraton {
    private Map<Integer, Atleta> atletas = new HashMap<>();

    public void guardarTiempo(int dorsal) {
        Scanner sc = new Scanner(System.in);
        if (atletas.containsKey(dorsal)) {
            System.out.println("Ingrese el tiempo del atleta :");
            int marca = sc.nextInt();
            Atleta atletaTiempo = atletas.get(dorsal);
            Atleta atleta = new Atleta(atletaTiempo.getNombre(), atletaTiempo.getPais(), marca, atletaTiempo.getCategoria(), true, dorsal);
            atletas.put(dorsal, atleta);
        } else {
            System.out.println("No se ha encontrado un atleta con ese dorsal.");
        }
    }


    public void agregarAtleta(Atleta atleta) {
        atletas.put(atleta.getDorsal(), atleta);
    }

    public void guardarAtletasBinario() {
        try {

            ObjectOutput output =
                    new ObjectOutputStream(
                            new FileOutputStream("C:\\Users\\DAW_M\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\U7_Entregable\\maraton.dat"));
            output.writeObject(atletas);

            output.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void MostrarListaFinishers() {
        List<Atleta> listaPorTiempo = new ArrayList<>();

        for (Map.Entry<Integer, Atleta> entrada : atletas.entrySet()) {
            if (entrada.getValue().isAcabado()) {
                listaPorTiempo.add(entrada.getValue());
            }
        }

        listaPorTiempo.sort(new OrdenacionSegundos());
        System.out.println("Lista por segundos :");
        System.out.println(listaPorTiempo);
    }

    public void borrarAtleta(int dorsal) {
        atletas.remove(dorsal);
    }

    public void participantesPorPais(String pais) {
        for (Map.Entry<Integer, Atleta> entrada : atletas.entrySet()) {
            if (entrada.getValue().getPais().equals(pais)) {
                System.out.println(entrada.getValue());
            }
        }
    }

    public void MostrarListaCategoria(Atleta.Categoria categoria) {
        for (Map.Entry<Integer, Atleta> entrada : atletas.entrySet()) {
            if (entrada.getValue().getCategoria().equals(categoria)) {
                System.out.println(entrada.getValue());
            }
        }
    }


    public void cargarAtletasBinario() {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\DAW_M\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\U7_Entregable\\maraton.dat"));

            atletas = (Map<Integer, Atleta>) ois.readObject();

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<Integer, Atleta> getAtletas() {
        return atletas;
    }
}