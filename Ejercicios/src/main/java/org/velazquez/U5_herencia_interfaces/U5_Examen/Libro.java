package org.velazquez.U5_herencia_interfaces.U5_Examen;

public class Libro extends Multimedia {
    private String editorial;
    private String idISBN;
    private int numPaginas;

    public Libro(String titulo, int anioEstreno, String autor, String editorial, String idISBN, int numPaginas) {
        super(titulo, anioEstreno, autor);
        this.editorial = editorial;
        this.idISBN = idISBN;
        this.numPaginas = numPaginas;
    }

    @Override
    public void dar_por_finalizado() {
        System.out.println("El libro " + this.getTitulo() + " ha finalizado.");
        boolean fin = true;
        this.setFinalizado(fin);
    }


    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdISBN() {
        return idISBN;
    }

    public void setIdISBN(String idISBN) {
        this.idISBN = idISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", anioPublicacion=" + getAnioEstreno() +
                ", editorial='" + editorial + '\'' +
                ", idISBN='" + idISBN + '\'' +
                ", numPaginas=" + numPaginas +
                ", idMultimedia=" + this.getIdMultimedia() +
                ", finalizado=" + this.isFinalizado() +
                '}';
    }
}
