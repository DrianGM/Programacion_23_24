package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;

public class Comparsa extends AgrupacionOficial {
    private String empresa;
    private int puntos;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String disfraz,String empresa,int puntos) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.empresa=empresa;
        this.puntos=puntos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Comparsa "+this.nombre+" va de "+this.disfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La Comparsa "+this.nombre+" va caminito del falla");
    }
}
