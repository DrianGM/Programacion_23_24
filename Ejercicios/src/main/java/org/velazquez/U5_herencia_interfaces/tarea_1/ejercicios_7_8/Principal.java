package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_7_8;

public class Principal {
    public static void main(String[] args) {
        Caja manolo = new Caja(30,30,30,Unidades.CENTIMETROS);
        System.out.println(manolo);
        System.out.println("Volumen de la caja : "+manolo.getVolumen());
        CajaCarton manolo2 = new CajaCarton(30,30,30);
        System.out.println(manolo2.calcularSuperficie());
        System.out.println(manolo2.getVolumenCarton());
    }
}