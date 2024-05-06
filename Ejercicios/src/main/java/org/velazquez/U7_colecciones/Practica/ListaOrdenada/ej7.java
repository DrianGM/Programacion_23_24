package org.velazquez.U7_colecciones.Practica.ListaOrdenada;

public class ej7 {
  public static void main(String[] args) {
    ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada<>(new EnterosCrecientes());

    listaOrdenada.insertarOrdenado(8);
    listaOrdenada.insertarOrdenado(1);
    listaOrdenada.insertarOrdenado(3);

    System.out.println(listaOrdenada);
  }
}
