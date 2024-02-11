package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicio_9;

public class Lavadora extends Electrodomestico implements Comparable{
    private double carga;

    public Lavadora(){
        super();
        this.carga=5;
    }

    public Lavadora(double peso, double precioBase){
        super(peso,precioBase);
        this.carga=5;
    }

    public Lavadora(double carga,double peso, double precioBase, Color color, String consumoEnergetico){
        super(peso,precioBase,color,consumoEnergetico);
        this.carga=carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double getPrecioFinal() {
        double precioFinal=super.getPrecioFinal();
        if (this.carga>30){
            return precioFinal+50;
        } else {
            return precioFinal;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico { " +
                "Precio Base=" + precioBase +
                ", Color=" + color +
                ", ConsumoEnergetico='" + consumoEnergetico + '\'' +
                ", Peso=" + peso +
                ", Carga=" + carga +
                ", Precio Final=" + this.getPrecioFinal() +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (this == o || o == null) return 0;
        Lavadora otra = (Lavadora) o;
        if (this.getCarga() > otra.getCarga()){
            return -1;
        } else if (this.getCarga()<otra.getCarga()){
            return 1;
        }
        return 0;
    }
}