package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_7_8;

public class Caja {
    private double ancho;
    private double alto;
    private double fondo;
    private Unidades u;

    public Caja(double ancho, double alto, double fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
    }

    public Caja(double ancho, double alto, double fondo) {
    }

    public double getVolumen() {
        return ancho * alto * fondo;
    }

    public String toString() {
        return "Caja de " + ancho + " " + u.getSimbolo() + " x " + alto + " " + u.getSimbolo() + " x " + fondo + " " + u.getSimbolo();
    }

}