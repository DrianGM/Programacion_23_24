package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_19_20;

public class Principal {
    public static void main(String[] args) {
        RPG rpg = new RPG();
        Elfo e1 = new Elfo("Igor", 16, 16, 12, true, Elfo.Tipo.BOSQUE);
        Elfo e2 = new Elfo("Igor", 2, 14, 16, true,Elfo.Tipo.BOSQUE);
        Elfo e3 = new Elfo("Igor", 45, 12, 14, true,Elfo.Tipo.BOSQUE);
        rpg.agregarPersonaje(e1);
        rpg.agregarPersonaje(e2);
        rpg.mostrarEstado();
        rpg.mostrarxAtaque();
        rpg.mostrarxDefensa();
        rpg.hayGanador();
    }
}
