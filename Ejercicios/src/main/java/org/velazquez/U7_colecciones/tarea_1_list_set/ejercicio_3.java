package org.velazquez.U7_colecciones.tarea_1_list_set;

//Crear una coleccion de 20 numeros enteros menores que 10, guardarlos por orden decreciente a medida que se van generando y mostrar la coleccion por pantalla.

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio_3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int Min = 0;
        int Max = 9;

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = Min + (int)(Math.random() * ((Max - Min) + 1));
            lista.add(numeroAleatorio);
            Collections.sort(lista, Collections.reverseOrder());
        }

        System.out.println(lista);
    }
}