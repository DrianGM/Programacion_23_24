package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

import org.velazquez.U5_herencia_interfaces.U5_Entregable.Pais;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Vivienda extends Propiedad {
    private int numBanios;
    private int numHabitaciones;
    private int capacidadMax;
    private float precio;
    private Persona[] personas;

    public Vivienda(int anioConstruccion, String direccion, float metrosCuadrados,int numBanios,int numHabitaciones, int capacidadMax, float precio){
        super(anioConstruccion,direccion,metrosCuadrados);
        this.numBanios=numBanios;
        this.numHabitaciones=numHabitaciones;
        this.capacidadMax=capacidadMax;
        this.precio=precio;
        personas = new Persona[capacidadMax];
    }

    @Override
    public void mostrarPropiedad() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = ahora.format(formato);
        System.out.println("Fecha y hora actual: " + fechaFormateada);
        //Falta mostrar los atributos
    }

    public void agregarPersona(Persona persona) {
//        if (personas[personas.length-1]==null){
//            Persona[] copia = new Persona[personas.length + 1];
//            for (int i = 0; i < personas.length; i++) {
//                copia[i] = personas[i];
//            }
//            boolean check = true;
//            for (int i = 0; i < copia.length; i++) {
//                if (persona==copia[i]){
//                    check=false;
//                }
//            }
//            if (check){
//                copia[personas.length] = persona;
//                personas = copia;
//            }
//        }
        boolean check = true;
        if (personas[personas.length-1]==null){
            for (int i = 0; i < personas.length; i++) {
                if (personas[i]==persona){
                    check=false;
                    break;
                }
            }
            if (check){
                for (int i = 0; i < personas.length; i++) {
                    if (personas[i]==null){
                        personas[i]=persona;
                    }

                }
            }
        }
    }

    public void eliminarPersona(Persona persona) {
        Persona[] copia = new Persona[personas.length - 1];
        int k = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != persona) {
                copia[k] = personas[i];
                k++;
            }
        }
        personas = copia;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numBanios=" + numBanios +
                ", numHabitaciones=" + numHabitaciones +
                ", capacidadMax=" + capacidadMax +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }
}
