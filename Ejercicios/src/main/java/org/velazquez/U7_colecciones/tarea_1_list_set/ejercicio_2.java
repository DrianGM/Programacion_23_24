package org.velazquez.U7_colecciones.tarea_1_list_set;

//Lo mismo que el ejercicio 2 pero en sentido decreciente.

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio_2 {
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

        Collections.sort(lista, Collections.reverseOrder());// Ordena la lista en sentido decreciente

        System.out.println("Lista ordenada en sentido creciente:");
        System.out.println(lista);

    }
}