package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicio_9;

public class Electrodomestico {
    protected double precioBase;
    protected Color color;
    protected String consumoEnergetico;
    protected double peso;


    public Electrodomestico(){
        this.color=Color.BLANCO;
        this.consumoEnergetico="F";
        this.precioBase=100;
        this.peso=5;
    }

    public Electrodomestico(double peso, double precioBase){
        this.color=Color.BLANCO;
        this.consumoEnergetico="F";
        this.precioBase=precioBase;
        setPeso(peso);
    }

    public Electrodomestico(double peso, double precioBase, Color color, String consumoEnergetico){
        this.color=color;
        this.consumoEnergetico=consumoEnergetico;
        this.precioBase=precioBase;
        setPeso(peso);
    }

    public double getPrecioFinal(){
        double precioFinal = 0;
        switch(this.consumoEnergetico){
            case "A":
                precioFinal=this.precioBase+100;
                break;
            case "B":
                precioFinal=this.precioBase+80;
                break;
            case "C":
                precioFinal=this.precioBase+60;
                break;
            case "D":
                precioFinal=this.precioBase+50;
                break;
            case "E":
                precioFinal=this.precioBase+30;
                break;
            case "F":
                precioFinal=this.precioBase+10;
                break;
        }
        if (this.peso>=0 && this.peso<=29){
            return precioFinal+10;
        } else if (this.peso>=30 && this.peso<=49){
            return precioFinal+60;
        } else if (this.peso>=50 && this.peso<=79){
            return precioFinal+80;
        } else {
            return precioFinal+100;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPeso(double peso) {
        if (peso>=0){
            this.peso = peso;
        }
    }

    public Color getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico { " +
                "Precio Base=" + precioBase +
                ", Color=" + color +
                ", ConsumoEnergetico='" + consumoEnergetico + '\'' +
                ", Peso=" + peso +
                ", Precio Final=" + getPrecioFinal() +
                '}';
    }

    public enum Color{
        BLANCO,
        NEGRO,
        ROJO,
        AZUL,
        GRIS,
    }
}
