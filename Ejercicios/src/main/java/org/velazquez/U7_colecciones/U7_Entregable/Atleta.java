package org.velazquez.U7_colecciones.U7_Entregable;

public class Atleta {
    private static int contadorAtletas = 1;
    private int dorsal;
    private String nombre;
    private String pais;
    private int segundos;
    private Categoria categoria;
    private boolean acabado;

    public Atleta(String nombre, String pais, int segundos, Categoria categoria, boolean acabado, int dorsal) {
        this.nombre = nombre;
        this.pais = pais;
        this.segundos = segundos;
        this.categoria = categoria;
        this.acabado = acabado;
        //Si el empleado esta recien inscrito, tendra el dorsal que le toque segun el orden de insercion.
        if (!acabado) {
            this.dorsal = contadorAtletas;
            contadorAtletas++;
        } else {
            //Si ya ha acabado y se esta registrando su tiempo, tendra el dorsal que tenia anteriormente.
            this.dorsal = dorsal;
        }

    }


    public static int getContadorAtletas() {
        return contadorAtletas;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getSegundos() {
        return segundos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean isAcabado() {
        return acabado;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", segundos=" + segundos +
                ", categoria=" + categoria +
                ", acabado=" + acabado +
                '}';
    }

    public enum Categoria {
        SENIOR,
        JUNIOR,
        VETERANO
    }
}
