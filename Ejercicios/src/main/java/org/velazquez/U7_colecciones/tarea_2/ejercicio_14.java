package org.velazquez.U7_colecciones.tarea_2;

//Implementar la función leeCadena con el siguiente prototipo:
//
//List<Character> leeCadena()
//Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        List<Character> cadena = leeCadena();
        System.out.println(cadena);
    }

    public static List<Character> leeCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = scanner.nextLine();
        List<Character> lista = new ArrayList<>();
        for (char c : cadena.toCharArray()) {
            lista.add(c);
        }
        return lista;
    }
}

