package org.velazquez.U7_colecciones.U7_Examen;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FeriaSevilla fs = new FeriaSevilla();
        Caseta c1 = new Caseta("Zaseta 1", "Rociana", 100);
        Caseta c2 = new Caseta("Caseta 2", "Lentejuela", 74);
        Caseta c3 = new Caseta("Caseta 3", "Lenteja", 96);
        Caseta c4 = new Caseta("Caseta 4", "Calle 123", 78);
        Caseta c5 = new Caseta("Caseta 5", "Avellana", 124);
        Artista a1 = new Artista("Yankee", "Trap", "Checoslovaca");
        Artista a2 = new Artista("Perko", "Jazz", "Ecuatoriana");
        Artista a3 = new Artista("Gipsy  King", "Rap", "India");
        Artista a4 = new Artista("Pepito", "Tango", "Noruega");
        Artista a5 = new Artista("Fernando", "Jazz", "Bulgara");
        System.out.println("-------------------------");
        System.out.println("Prueba metodo addActuacion");
        fs.addActuacion(c1, a1);
        fs.addActuacion(c1, a2);
        fs.addActuacion(c2, a2);
        fs.addActuacion(c3, a3);
        fs.addActuacion(c4, a4);
        fs.addActuacion(c4, a1);
        fs.addActuacion(c5, a5);
        System.out.println(fs.getMapaCasetas());
        System.out.println(fs.getMapaArtistas());
        System.out.println(fs.getActuaciones());
        System.out.println("-------------------------");
        System.out.println("Prueba metodo getArtistas");
        List<Artista> artistas = fs.getArtistas(c1);
        System.out.println(artistas);
        System.out.println("-------------------------");
        System.out.println("Prueba metodo getCasetas");
        List<Caseta> casetas = fs.getCasetas(a1);
        System.out.println(casetas);
        System.out.println("-------------------------");
        System.out.println("Prueba metodos getCaseta y getArtista : ");
        Caseta c6 = fs.getCaseta("Zaseta 1");
        System.out.println(c6);
        Artista a6 = fs.getArtista("Perko");
        System.out.println(a6);
        System.out.println("-------------------------");
        System.out.println("Prueba metodo removeCaseta");
        Map<String, Caseta> mapaCasetas = fs.getMapaCasetas();
        System.out.println(mapaCasetas);
        fs.removeCaseta("Zaseta 1");
        System.out.println(mapaCasetas);
        System.out.println("-------------------------");
        System.out.println("Prueba metodo guardarDatos() y cargarDatos()");
        fs.guardarDatos();
        fs.cargarDatos();
    }
}
