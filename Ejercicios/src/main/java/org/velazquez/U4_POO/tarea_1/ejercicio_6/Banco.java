package org.velazquez.U4_POO.tarea_1.ejercicio_6;

public class Banco {
    private String nombre;
    private long capital;
    private String direccion;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.capital = 5200000; // Capital por defecto
    }

    public Banco(String nombre, long capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
