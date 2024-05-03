package org.velazquez.U7_colecciones.tarea_1_list_set;

//Crear una coleccion de 20 numeros enteros aleatorios menores que 100, y guardarlos en el orden en el que se generen.
//Mostrar por pantalla la lista una vez creada.
// Ordenarla en sentido creciente y volver a mostrarla.

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio_1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int Min = 0;
        int Max = 99;

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = Min + (int)(Math.random() * ((Max - Min) + 1));
            lista.add(numeroAleatorio);
        }

        System.out.println("Lista sin ordenar:");
        System.out.println(lista);

        Collections.sort(lista); // Ordena la lista en sentido creciente

        System.out.println("Lista ordenada en sentido creciente:");
        System.out.println(lista);
    }
}
