package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

public abstract class Propiedad {
    protected int anioConstruccion;
    protected String direccion;
    protected float metrosCuadrados;

    protected static int cantidadPropiedades = 0;

    public Propiedad(int anioConstruccion, String direccion, float metrosCuadrados){
        this.anioConstruccion=anioConstruccion;
        this.direccion=direccion;
        this.metrosCuadrados=metrosCuadrados;
        cantidadPropiedades++;
    }


    public abstract void mostrarPropiedad();

    public void cantidadPropiedades(){
        System.out.println(cantidadPropiedades);
    }

    public int compareTo(Propiedad otra) {
        if (this.metrosCuadrados < otra.metrosCuadrados) {
            return -1;
        } else if (this.metrosCuadrados > otra.metrosCuadrados) {
            return 1;
        }
        return 0;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public static int getCantidadPropiedades() {
        return cantidadPropiedades;
    }
}
