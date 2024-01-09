package org.velazquez.U4_POO.tarea_1.ejercicio_2;

public class Principal {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente(155,-55,"123456789");
        cuenta.informacion();
        CuentaCorriente cuenta2 = new CuentaCorriente(180);
        cuenta2.informacion();
    }
}
