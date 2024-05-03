package org.velazquez.U6_ficheros.tarea_4_poo_ficheros;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) throws LibroException {
        if (contieneNumero(titulo) || contieneNumero(autor)) {
            throw new LibroException("El título o autor no pueden contener números");
        }
        this.titulo = titulo;
        this.autor = autor;
    }

    private boolean contieneNumero(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return titulo + ": " + autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(getTitulo(), libro.getTitulo()) && Objects.equals(getAutor(), libro.getAutor());
    }

    @Override
    public int compareTo(Libro libro) {
        return this.titulo.compareTo(libro.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static class LibroException extends Exception {
        public LibroException(String message) {
            super(message);
        }
    }
}
