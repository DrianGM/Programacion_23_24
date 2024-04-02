package org.velazquez.U7_colecciones.tarea_4;

public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private double estatura;
    private double sueldo;

    public Empleado(String nombre, String dni, int edad, double estatura, double sueldo){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
        this.estatura=estatura;
        this.sueldo=sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", sueldo=" + sueldo +
                '}';
    }
}
