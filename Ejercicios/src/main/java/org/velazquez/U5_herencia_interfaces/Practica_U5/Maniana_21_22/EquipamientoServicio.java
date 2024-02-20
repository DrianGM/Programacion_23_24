package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EquipamientoServicio extends Propiedad {
    private Servicio servicio;

    public EquipamientoServicio(int anioConstruccion, String direccion, float metrosCuadrados) {
        super(anioConstruccion, direccion, metrosCuadrados);
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
        System.out.println("Servicio :"+servicio);
    }
}
