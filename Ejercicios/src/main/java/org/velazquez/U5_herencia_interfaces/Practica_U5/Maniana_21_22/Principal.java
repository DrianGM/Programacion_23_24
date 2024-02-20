package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

public class Principal {
    public static void main(String[] args) {
        Vivienda l1 = new Vivienda(93,"Villamarin",92,92,92,5,92);
        Persona p1 = new Persona("838383F","Paco",822);
        l1.agregarPersona(p1);
        System.out.println(l1);
    }
}