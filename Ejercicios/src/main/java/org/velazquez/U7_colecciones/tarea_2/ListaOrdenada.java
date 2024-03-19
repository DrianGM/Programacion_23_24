package org.velazquez.U7_colecciones.tarea_2;

import java.util.LinkedList;

public class ListaOrdenada<E extends Comparable<E>> extends LinkedList<E> {
    //WORK IN PROGRESS

    public void insertarOrdenado(E elemento) {
        if (this.size() == 0) {
            this.add(elemento);
        } else {
            int i = 0;
            while (i < this.size()) {
                if (elemento.compareTo(this.get(i)) <= 0) {
                    this.add(i, elemento);
                    break;
                }
                i++;
            }
            if (i == this.size()) {
                this.add(elemento);
            }
        }
    }
}