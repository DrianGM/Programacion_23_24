package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;

public class Cuarteto extends AgrupacionOficial implements Callejera {
    private int numMiembros;
    private int puntos;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String disfraz,int numMiembros,int puntos) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.numMiembros=numMiembros;
        this.puntos=puntos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Cuarteto "+this.nombre+" va de "+this.disfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El Cuarteto "+this.nombre+" va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto "+this.nombre);
    }
}
