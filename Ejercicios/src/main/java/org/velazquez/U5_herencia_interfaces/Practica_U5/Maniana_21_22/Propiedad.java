package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

public abstract class Propiedad {
    private int anioConstruccion;
    private String direccion;
    private float metrosCuadrados;

    protected static int cantidadPropiedades = 0;

    public Propiedad(int anioConstruccion, String direccion, float metrosCuadrados){
        this.anioConstruccion=anioConstruccion;
        this.direccion=direccion;
        this.metrosCuadrados=metrosCuadrados;
        cantidadPropiedades++;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "anioConstruccion=" + anioConstruccion +
                ", direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }

    public abstract void mostrarPropiedad();
}
