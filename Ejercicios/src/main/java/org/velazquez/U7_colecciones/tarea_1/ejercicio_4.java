package org.velazquez.U7_colecciones.tarea_1;

//Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
//Almacenar en una lista las palabras de la frase, una en cada nodo, y mostrar por pantalla las que esten repetidas
//Luego, mostrar las que no lo esten

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase que conste exclusivamente de palabras separadas por espacios :");
        String frase = sc.nextLine();
        ArrayList<String> lista = new ArrayList<>();
        String palabra = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ' || i==frase.length()-1){
                if (i==frase.length()-1){
                    palabra=palabra+frase.charAt(i);
                }
                boolean add = true;
                for (String str : lista) {
                    if (str.equals(palabra)){
                        add=false;
                        break;
                    }
                }
                if (add){
                    lista.add(palabra);
                }
                palabra="";
            } else {
                palabra=palabra+frase.charAt(i);
            }
            System.out.println(lista);
        }
    }
}
