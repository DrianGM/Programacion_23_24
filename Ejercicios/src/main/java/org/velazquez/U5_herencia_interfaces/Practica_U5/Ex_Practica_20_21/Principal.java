package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_20_21;

public class Principal {
    public static void main(String[] args) {
        Conductor co1 = new Conductor();
        CamionCajas c1 = new CamionCajas("SSDSDSA",5,co1);
        Prenda p1 = new Prenda();
        Prenda p2 = new Prenda();
        Prenda p3 = new Prenda();
        Prenda p4 = new Prenda();
        Caja ca1 = new Caja();
        Caja ca2 = new Caja();
        Caja ca3 = new Caja();
        c1.agregarCaja(ca1);
        c1.agregarCaja(ca2);
        c1.agregarCaja(ca3);
        c1.eliminarCaja(ca2);
        ca1.agregarPrenda(p1);
        ca1.agregarPrenda(p2);
        ca1.agregarPrenda(p3);
        ca1.agregarPrenda(p4);
        ca1.eliminarPrenda(p2);
        System.out.println(c1);
        //SIN TERMINAR
    }
}
