package org.velazquez.U5_herencia_interfaces.U5_Entregable;


public class Principal {
    public static void main(String[] args) {
        Juegos juego = new Juegos(2024, "Cartuja");
        Pais p1 = new Pais("Italia", 23);
        Pais p2 = new Pais("Grecia", 26);
        Pais p3 = new Pais("Portugal", 32);
        PeladoresGambas p4 = new PeladoresGambas(14, 2);
        PeladoresGambas p5 = new PeladoresGambas(18, 2);
        PeladoresGambas p6 = new PeladoresGambas(20, 2);
        juego.agregarPais(p1);
        juego.agregarPais(p2);
        juego.agregarPais(p3);
        juego.mostrarPaises();
        System.out.println("--------------------");
        juego.mostrarPaisesParaCeremonia();
        System.out.println("               ");
        Baloncesto b1 = new Baloncesto();
        b1.agregarParticipante(p4);
        b1.agregarParticipante(p5);
        b1.agregarParticipante(p6);
    }
}
