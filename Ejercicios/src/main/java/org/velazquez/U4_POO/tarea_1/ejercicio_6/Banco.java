package org.velazquez.U4_POO.tarea_1.ejercicio_6;

public class Banco {
    public String nombre;
    public long capital;
    public String direccion;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.capital = 5200000; // Capital por defecto
    }

    public Banco(String nombre, long capital, String direccion) {
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public String mostrarNombre() {
        return nombre;
    }

    public double mostrarCapital() {
        return capital; }

    public String mostrarDireccion() {
        return direccion;
    }

    public void modificarCapital(long capital) {
        this.capital = capital;
    }

    public void modificarDireccion(String direccion) {
        this.direccion = direccion;
    }
}
