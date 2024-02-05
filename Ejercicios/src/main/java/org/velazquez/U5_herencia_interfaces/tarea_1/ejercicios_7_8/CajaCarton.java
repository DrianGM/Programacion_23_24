package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_7_8;

public class CajaCarton extends Caja {
    private double ancho;
    private double alto;
    private double fondo;
    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo);
    }

    public double getVolumenCarton(){
        return getVolumen()*0.8;
    }

    public double calcularSuperficie() {
        double areaBase = 2*(ancho*alto); // Area de la base
        double areaLateral = 4*(fondo*alto); // Area de las caras laterales
        return areaBase + areaLateral;
    }
}
