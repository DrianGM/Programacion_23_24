package org.velazquez.U4_POO.tarea_1.ejercicio_6;

public class Principal {
    public static void main(String[] args) {
        Banco banquito = new Banco("Santander",15,"Calle Manzana");
        CuentaCorriente cuenta = new CuentaCorriente("Adrián","012345678",30000,-50,banquito);
        cuenta.informacion();
    }
}
