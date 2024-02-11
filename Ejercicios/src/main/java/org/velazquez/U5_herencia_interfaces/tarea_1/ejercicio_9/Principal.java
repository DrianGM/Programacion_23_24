package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicio_9;

public class Principal {
    public static void main(String[] args) {
        Electrodomestico rotom = new Electrodomestico();
        System.out.println(rotom);
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora(4,5,10, Electrodomestico.Color.AZUL,"A");
        System.out.println(lavadora1);
        System.out.println(lavadora2);
        System.out.println(lavadora1.compareTo(lavadora2));
        System.out.println(lavadora1.compareToPrecioFinal(lavadora2));
        Television samsung = new Television();
        System.out.println(samsung);
        //Hay un bug con el precio final
    }
}
