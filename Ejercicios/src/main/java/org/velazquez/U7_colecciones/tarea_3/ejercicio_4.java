package org.velazquez.U7_colecciones.tarea_3;

//Crea una clase llamada Traductor, que contenga un atributo llamado "diccionario" de tipo HashMap y se comporte de esta forma:
//
//Al crear el objeto Traductor, el atributo diccionario debe ser cargado con la información de un archivo de texto cuyo nombre se le pasará por parámetro al constructor. Este archivo debe contener varias palabras en español y su traducción al inglés, de tal forma que las palabras en español sean la clave, y las que estén en inglés, el valor. Por ejemplo:
//
//hola, hello
//
//mundo, world
//
//gracias, thanks
//
//adios, bye
//
//Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.

public class ejercicio_4 {
    public static void main(String[] args) {
        Traductor traductor = new Traductor("src/main/java/org/velazquez/U7_colecciones/tarea_3/diccionario.txt");
        String castellano = "mundo";
        String ingles = traductor.traduccion(castellano);
        System.out.println(castellano);
        System.out.println(ingles);
    }
}