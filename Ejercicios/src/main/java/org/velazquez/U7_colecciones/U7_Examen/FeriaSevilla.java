package org.velazquez.U7_colecciones.U7_Examen;


import java.io.*;
import java.util.*;

public class FeriaSevilla implements Serializable {
    private Map<String, Caseta> mapaCasetas = new LinkedHashMap<>();
    private Map<Caseta, List<Artista>> actuaciones = new LinkedHashMap<>();
    private Map<String, Artista> mapaArtistas = new LinkedHashMap<>();


    public void addActuacion(Caseta c, Artista a) {
        if (!mapaCasetas.containsKey(c.getNombre())) {
            mapaCasetas.put(c.getNombre(), c);
        }
        if (!mapaArtistas.containsKey(a.getNombre())) {
            mapaArtistas.put(a.getNombre(), a);
        }
        List<Artista> artistasCaseta = new ArrayList<>();
        if (actuaciones.containsKey(c)) {
            artistasCaseta = actuaciones.get(c);
            artistasCaseta.add(a);
        } else {
            artistasCaseta.add(a);
        }
        actuaciones.put(c, artistasCaseta);
    }

    public List<Artista> getArtistas(Caseta c) {
        List<Artista> artistas;
        artistas = actuaciones.get(c);
        artistas.sort(new Comparator<Artista>() {
            @Override
            public int compare(Artista o1, Artista o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        return artistas;
    }

    public List<Caseta> getCasetas(Artista a) {
        List<Caseta> casetas = new ArrayList<>();
        for (Caseta caseta : mapaCasetas.values()) {
            if (actuaciones.get(caseta).contains(a)) {
                casetas.add(caseta);
            }
        }
        casetas.sort(new Comparator<Caseta>() {
            @Override
            public int compare(Caseta o1, Caseta o2) {
                return o1.getNombre().compareTo(o2.getNombre());

            }
        });
        return casetas;
    }

    public Caseta getCaseta(String nombre) {
        for (Caseta caseta : mapaCasetas.values()) {
            if (caseta.getNombre().equals(nombre)) {
                return caseta;
            }
        }
        System.out.println("No existe ninguna caseta con ese nombre.");
        return null;
    }


    public void removeCaseta(String nombre) {
        Caseta c1 = mapaCasetas.get(nombre);
        mapaCasetas.remove(nombre);
        if (actuaciones.containsKey(c1)) {
            actuaciones.remove(c1);
            System.out.println("Se ha eliminado la caseta con el nombre " + nombre);
        }
    }

    public Artista getArtista(String nombreArtistico) {
        for (Artista artista : mapaArtistas.values()) {
            if (artista.getNombre().equals(nombreArtistico)) {
                return artista;
            }
        }
        System.out.println("No existe ningun artista con ese nombre.");
        return null;
    }

    public void guardarDatos() {
        String ruta = "C:\\Users\\DAW_M\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\U7_Examen\\feriasevilla.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(actuaciones);
            oos.writeObject(mapaCasetas);
            oos.writeObject(mapaArtistas);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cargarDatos() {
        String ruta = "C:\\Users\\DAW_M\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U7_colecciones\\U7_Examen\\feriasevilla.dat";
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
            actuaciones = (Map<Caseta, List<Artista>>) ois.readObject();
            mapaCasetas = (Map<String, Caseta>) ois.readObject();
            mapaArtistas = (Map<String, Artista>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<Caseta, List<Artista>> getActuaciones() {
        return actuaciones;
    }

    public Map<String, Caseta> getMapaCasetas() {
        return mapaCasetas;
    }

    public Map<String, Artista> getMapaArtistas() {
        return mapaArtistas;
    }
}
