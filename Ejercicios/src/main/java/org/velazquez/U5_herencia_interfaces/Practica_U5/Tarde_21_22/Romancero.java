package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;

public class Romancero extends Agrupacion implements Callejera {
    private String tematica;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String disfraz,String tematica) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
        this.tematica=tematica;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero "+this.nombre+" va de "+this.disfraz);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero "+this.nombre);

    }
}
