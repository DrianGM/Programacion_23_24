package org.velazquez.U4_POO.tarea_2.ejercicio_1;

import java.util.Arrays;

public class Lista {
    private Integer[] tabla;
    private Integer indice = 0;

    public Lista (){
        this.tabla = new Integer[10];
    }

    public Lista (Integer capacidad){
        this.tabla = new Integer[capacidad];
    }

    public Integer obtenerNumeroElementos(){
        return indice;
    }

    public void insertarAlFinal(Integer num){
        if (indice>=tabla.length){
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
        }
        tabla[indice]=num;
        indice++;
    }


    public void insertarAlPrincipio(Integer num) {
        Integer[] copia = Arrays.copyOf(tabla, indice);
        tabla[0] = num;
        for (int i = 0; i < copia.length; i++) {
            tabla[i + 1] = copia[i];
        }
        indice++;
    }

    public void insertarNumPosicion(int posicion, Integer num) {
        if (posicion >= 0 && posicion < indice) {
            Integer[] copia = Arrays.copyOf(tabla, indice);
            System.out.println(Arrays.toString(copia));
            tabla[posicion] = num;
            for (int i = posicion; i < copia.length; i++) {
                tabla[i + 1] = copia[i];
            }
            indice++;
        }
    }


}
