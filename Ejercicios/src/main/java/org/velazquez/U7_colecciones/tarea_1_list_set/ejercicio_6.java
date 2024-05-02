package org.velazquez.U7_colecciones.tarea_1_list_set;

//Ingresar por teclado hasta que se ingrese "fin",
//una serie de nombres que se insertaran en una coleccion, de forma que se conserve el orden de insercion y que no puedan repetirse.
//Mostrar la estructura por pantalla

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String palabra = "";
        do {
            System.out.println("Ingrese una palabra (Ingrese fin para terminar):");
            palabra = sc.nextLine();
            if (!palabra.equals("fin")){
                boolean add = true;
                for (String string : lista) {
                    if (string.equals(palabra)) {
                        add = false;
                        break;
                    }
                }
                if (add){
                    lista.add(palabra);
                }
            }
        } while (!palabra.equals("fin"));
        System.out.println(lista);
    }
}
