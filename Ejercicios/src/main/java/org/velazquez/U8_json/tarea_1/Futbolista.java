package org.velazquez.U8_json.tarea_1;


import java.util.List;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private List<String> demarcaciones;
    private String equipo;

    public Futbolista(int dorsal, String nombre, List<String> demarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = demarcaciones;
        this.equipo = equipo;
    }

    public Futbolista(){

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDemarcaciones() {
        return demarcaciones;
    }

    public void setDemarcaciones(List<String> demarcaciones) {
        this.demarcaciones = demarcaciones;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", demarcaciones=" + demarcaciones +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
