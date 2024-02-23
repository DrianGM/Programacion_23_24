package org.velazquez.U5_herencia_interfaces.U5_Examen;

public abstract class Multimedia implements Comparable<Multimedia> {
    private static int cantidadMultimedias = 0;
    private String titulo;
    private int anioEstreno;
    private String autor;
    private int idMultimedia;
    private boolean finalizado;

    public Multimedia(String titulo, int anioEstreno, String autor) {
        //Mediante un contador que aumenta cada vez que se crea un objeto de este tipo, se le da a cada objeto un id unico
        cantidadMultimedias++;
        this.idMultimedia = cantidadMultimedias;
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.autor = autor;
    }


    public static int getCantidadMultimedias() {
        return cantidadMultimedias;
    }

    public static void setCantidadMultimedias(int cantidadMultimedias) {
        Multimedia.cantidadMultimedias = cantidadMultimedias;
    }

    public int compareTo(Multimedia m2) {
        //He establecido la ordenacion por id como la ordenacion por defecto mediante la Interfaz generica Comparable
        if (this.getIdMultimedia() < m2.getIdMultimedia()) {
            return -1;
        } else if (this.getIdMultimedia() > m2.getIdMultimedia()) {
            return 1;
        }
        return 0;
    }

    public abstract void dar_por_finalizado();

    public int getIdMultimedia() {
        return idMultimedia;
    }

    public void setIdMultimedia(int idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", anioEstreno=" + anioEstreno +
                ", autor='" + autor + '\'' +
                ", idMultimedia=" + idMultimedia +
                ", finalizado=" + finalizado +
                '}';
    }
}
