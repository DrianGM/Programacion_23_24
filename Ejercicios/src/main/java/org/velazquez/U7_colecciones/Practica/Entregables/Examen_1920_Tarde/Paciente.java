package org.velazquez.U7_colecciones.Practica.Entregables.Examen_1920_Tarde;

public class Paciente {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunado;
    private Medico medico;
    private char cepa;

    public Paciente(String nombre, int edad, double peso, boolean vacunado, Medico medico, char cepa){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.vacunado=vacunado;
        this.medico=medico;
        this.cepa=cepa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public Medico getMedico() {
        return medico;
    }

    public char getCepa() {
        return cepa;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                ", medico=" + medico +
                ", cepa=" + cepa;
    }
}
