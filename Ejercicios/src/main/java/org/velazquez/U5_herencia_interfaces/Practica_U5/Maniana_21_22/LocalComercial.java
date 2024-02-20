package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalComercial extends Local {
    private String descripcion;

    public LocalComercial(int anioConstruccion, String direccion, float metrosCuadrados,String descripcion) {
        super(anioConstruccion, direccion, metrosCuadrados);
        this.descripcion=descripcion;
    }

    @Override
    public void mostrarPropiedad() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = ahora.format(formato);
        System.out.println("Fecha y hora actual: " + fechaFormateada);
        //Falta mostrar los atributos
    }
}
