package org.velazquez.U4_POO.tarea_1.ejercicio_4;

public class Principal {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("Adrián","123456789");
        cuenta.setBanco("Santander");
        cuenta.informacion();
    }
}
