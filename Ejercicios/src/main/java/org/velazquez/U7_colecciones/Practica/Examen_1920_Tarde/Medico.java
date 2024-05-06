package org.velazquez.U7_colecciones.Practica.Examen_1920_Tarde;

public class Medico {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String hospital;

    public Medico(String nombre, String apellido1, String apellido2, String hospital){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.hospital=hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getHospital() {
        return hospital;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", apellido1=" + apellido1 +
                ", apellido2=" + apellido2 +
                ", hospital=" + hospital;
    }
}
