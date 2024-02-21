package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;

public class Coro extends AgrupacionOficial {
    private int numBandurrias;
    private int numGuitarras;
    private int puntos;

    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String disfraz,int numBandurrias,int numGuitarras,int puntos) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.numBandurrias=numBandurrias;
        this.numGuitarras=numGuitarras;
        this.puntos=puntos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Coro "+this.nombre+" va de "+this.disfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El Coro "+this.nombre+" va caminito del falla");
    }
}
