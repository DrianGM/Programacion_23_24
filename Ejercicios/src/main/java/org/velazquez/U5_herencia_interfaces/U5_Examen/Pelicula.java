package org.velazquez.U5_herencia_interfaces.U5_Examen;

public class Pelicula extends Multimedia implements Reproducible {
    private int duracionMin;
    private String productora;
    private String pais;

    public Pelicula(String titulo, int anioEstreno, String autor, int duracionMin, String productora, String pais) {
        super(titulo, anioEstreno, autor);
        this.duracionMin = duracionMin;
        this.productora = productora;
        this.pais = pais;
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println("La pelicula " + this.getTitulo() + " ha finalizado.");
        boolean fin = true;
        this.setFinalizado(fin);
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo pelicula " + this.getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando pelicula " + this.getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Parando pelicula " + this.getTitulo());
    }


    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + getTitulo() + '\'' +
                ", director='" + getAutor() + '\'' +
                ", anioEstreno=" + getAnioEstreno() +
                ", duracionMin=" + duracionMin +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                ", idMultimedia=" + this.getIdMultimedia() +
                ", finalizado=" + this.isFinalizado() +
                '}';
    }
}
