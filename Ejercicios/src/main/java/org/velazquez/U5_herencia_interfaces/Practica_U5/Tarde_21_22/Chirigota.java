package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;

public class Chirigota extends AgrupacionOficial implements Callejera {
    private int numCuples;
    private int puntos;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String disfraz,int numCuples,int puntos) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.numCuples=numCuples;
        this.puntos=puntos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Chirigota "+this.nombre+" va de "+this.disfraz);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La Chirigota "+this.nombre+" va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota "+this.nombre);
    }
}
