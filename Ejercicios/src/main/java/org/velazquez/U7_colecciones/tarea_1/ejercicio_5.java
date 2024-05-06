package org.velazquez.U7_colecciones.tarea_1;

//Crear una coleccion de 20 numeros enteros aleatorios distintos menores que 100
//Guardarlos por orden decreciente a medida que se vayan generando y mostrar la coleccion por pantalla.

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio_5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int Min = 0;
        int Max = 99;

        for (int i = 0; i < 20; i++) {
            boolean add;
            do{
                add = true;
                int numeroAleatorio = Min + (int)(Math.random() * ((Max - Min) + 1));
                for (Integer integer : lista) {
                    if (integer == numeroAleatorio) {
                        add = false;
                        break;
                    }
                }
                if (add){
                    lista.add(numeroAleatorio);
                }
            } while (!add);
            Collections.sort(lista, Collections.reverseOrder());
        }
        System.out.println(lista);
    }
}