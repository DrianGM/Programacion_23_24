package org.velazquez.U6_ficheros.tarea_4_poo_ficheros;

public class Main {
    public static void main(String[] args) {
        try {
            Libro libro1 = new Libro("Dias", "David Safier");
            Libro libro2 = new Libro("Nave", "George Orwell");
            Libro libro3 = new Libro("Angry Men", "L");
            System.out.println(libro1);
            System.out.println(libro2);
            System.out.println(libro1.equals(libro2));
            System.out.println(libro1.compareTo(libro2));
        } catch (Libro.LibroException e) {
            System.out.println(e.getMessage());
        }
        //WORK IN PROGRESS
    }
}