package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_20_21;

public class Prenda {
    private float precio;
    private String nombre;
    private String codBarra;
    private float peso;
    private static int cantidadPrendas;

    @Override
    public String toString() {
        return "Prenda{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codBarra='" + codBarra + '\'' +
                ", peso=" + peso +
                '}';
    }
}
