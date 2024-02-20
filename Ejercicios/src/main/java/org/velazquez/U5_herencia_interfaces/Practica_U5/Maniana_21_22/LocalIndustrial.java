package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalIndustrial extends Local {
    private consumEnergetico consumo;

    public LocalIndustrial(int anioConstruccion, String direccion, float metrosCuadrados,consumEnergetico consumo) {
        super(anioConstruccion, direccion, metrosCuadrados);
        this.consumo=consumo;
    }

    @Override
    public void mostrarPropiedad() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = ahora.format(formato);
        System.out.println("Fecha y hora actual: " + fechaFormateada);
        System.out.println(cantidadPropiedades);
        //Falta mostrar los atributos
    }
}
