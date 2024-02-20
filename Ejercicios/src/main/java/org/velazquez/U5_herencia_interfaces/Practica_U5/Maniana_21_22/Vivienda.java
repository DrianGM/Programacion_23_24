package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

import org.velazquez.U5_herencia_interfaces.U5_Entregable.Pais;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Vivienda extends Propiedad implements PrecioVenta {
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
        System.out.println("Anio de construccion : "+anioConstruccion);
        System.out.println("Direccion :"+direccion);
        System.out.println("Metros cuadrados :"+metrosCuadrados);
        System.out.println("Numero de banios :"+numBanios);
        System.out.println("Numero de habitaciones :"+numHabitaciones);
        System.out.println("Capacidad maxima de personas :"+capacidadMax);
        System.out.println("Precio :"+precio);
        for (int i = 0; i < personas.length; i++) {
            if (personas[i]!=null){
                System.out.println(personas[i].nombreCompleto);
            } else {
                System.out.println("null");
            }
        }
    }

    public void agregarPersona(Persona persona) {
            boolean check = true;
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
                        break;
                    }
                }
            }
    }

    public void eliminarPersona(Persona persona) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i]==persona){
                personas[i]=null;
                break;
            }
        }

    }


    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima "+capacidadMax+" y valgo "+precio);
    }
}
