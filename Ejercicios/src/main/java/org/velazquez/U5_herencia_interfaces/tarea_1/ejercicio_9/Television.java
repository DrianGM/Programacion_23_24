package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicio_9;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        super();
        this.resolucion =20;
        this.sintonizadorTDT=false;
    }

    public Television(double peso, double precioBase){
        super(peso,precioBase);
        this.resolucion =20;
        this.sintonizadorTDT=false;
    }

    public Television(double peso, double precioBase, Color color, String consumoEnergetico, int resolucion, boolean sintonizadorTDT){
        super(peso,precioBase,color,consumoEnergetico);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

    public double getPrecioFinal() {
        double precioFinal=super.getPrecioFinal();
        if (resolucion>40){
            precioFinal=precioFinal*1.3;
        }
        if (sintonizadorTDT){
            precioFinal=precioFinal+50;
        }
        return precioFinal;
    }


    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Television { " +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico='" + consumoEnergetico + '\'' +
                ", peso=" + peso +
                ", Precio Final=" + this.getPrecioFinal() +
                '}';
    }
}