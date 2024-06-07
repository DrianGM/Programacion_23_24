package org.velazquez.U9_bases_de_datos.U9_Examen_Recuperacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------TRANSACCIONES----------------------");
        Transacciones.Transacciones();
        System.out.println("----------------------CONSULTAS----------------------");
        System.out.println("Consulta 1 :");
        Consultas.consulta1();
        System.out.println("Consulta 2 :");
        Consultas.consulta2();
        //La conexion es cerrada en el ultimo metodo.
    }
}