package org.velazquez.U4_POO.U4_Entregable;

public class Cancion {
    private String titulo;
    private int duracionSeg;
    private Genero genero;
    private Cantante autor;

    public Cancion(String titulo,int duracionSeg,Genero genero,Cantante autor){
        this.titulo=titulo;
        this.duracionSeg=duracionSeg;
        this.genero=genero;
        this.autor=autor;
    }

    public void mostrar_informacion(){
        System.out.println(titulo);
        System.out.println(duracionSeg);
        System.out.println(genero);
        System.out.println(autor);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setAutor(Cantante autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public Genero getGenero() {
        return genero;
    }

    public Cantante getAutor() {
        return autor;
    }

    public enum Genero
    {
        TRAP, NEOPERREO, EMORAP
    }
}
