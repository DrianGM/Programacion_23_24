package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_1_4;

public class Principal {
    public static void main(String[] args) {
        HoraExacta reloj1 = new HoraExacta(23, 59, 59);
        HoraExacta reloj2 = new HoraExacta(23, 59, 59);
        boolean check=reloj1.equals(reloj2);
        System.out.println(check);
    }
}
