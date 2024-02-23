package org.velazquez.U5_herencia_interfaces.U5_Examen;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {
    private int numTemporadas;
    private String[] capitulos = new String[0];

    public Serie(String titulo, int anioEstreno, String autor, int numTemporadas) {
        super(titulo, anioEstreno, autor);
        this.numTemporadas = numTemporadas;
    }


    public void add_Capitulo(String capitulo) {
        //Mediante un array copia del nuestro que tiene un hueco más para almacenar, le agregamos el nuevo String a almacenar.
        String[] copia = new String[capitulos.length + 1];
        for (int i = 0; i < capitulos.length; i++) {
            copia[i] = capitulos[i];
        }
        copia[capitulos.length] = capitulo;
        capitulos = copia;
    }

    public boolean eliminar_capitulo(String capitulo) {
        //Primero se comprueba si el capitulo existe en el array, para posteriormente eliminado.
        boolean eliminado = false;
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i].equals(capitulo)) {
                eliminado = true;
            }
        }
        //Si existe, se procede a la eliminacion, mediante un array más corto con el mismo contenido excepto el String que queremos eliminar.
        //Al trabajar con arrays de distinta longitud, poseen distintos indices.
        if (eliminado) {
            String[] copia = new String[capitulos.length - 1];
            int k = 0;
            for (int i = 0; i < capitulos.length; i++) {
                if (!capitulos[i].equals(capitulo)) {
                    copia[k] = capitulos[i];
                    k++;
                }
            }
            capitulos = copia;
        }
        return eliminado;
    }


    @Override
    public void dar_por_finalizado() {
        System.out.println("La serie " + this.getTitulo() + " ha finalizado.");
        boolean fin = true;
        this.setFinalizado(fin);
    }

    @Override
    public void play() {
        int numeroMax = this.capitulos.length - 1;
        int numeroMin = 0;
        int capituloRandom = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        System.out.println("Reproduciendo serie " + this.getTitulo() + " capitulo " + this.capitulos[capituloRandom]);
    }

    @Override
    public void pause() {
        int numeroMax = this.capitulos.length - 1;
        int numeroMin = 0;
        int capituloRandom = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        System.out.println("Pausando serie " + this.getTitulo() + " capitulo " + this.capitulos[capituloRandom]);
    }

    @Override
    public void stop() {
        int numeroMax = this.capitulos.length - 1;
        int numeroMin = 0;
        int capituloRandom = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        System.out.println("Parando serie " + this.getTitulo() + " capitulo " + this.capitulos[capituloRandom]);
    }


    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String[] capitulos) {
        this.capitulos = capitulos;
    }


    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + getTitulo() + '\'' +
                ", creador='" + getAutor() + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", capitulos=" + Arrays.toString(capitulos) +
                ", anioEstreno=" + getAnioEstreno() +
                ", idMultimedia=" + this.getIdMultimedia() +
                ", finalizado=" + this.isFinalizado() +
                '}';
    }
}
