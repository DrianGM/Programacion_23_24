package org.velazquez.U7_colecciones.Examen_1920;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concurso {
    private String nombre;
    private String localidad;
    Map<String, List<Perro>> perrosPorRaza = new HashMap<>();


    public void addDog(String raza, Perro perro){
        if(perro.getRaza().equals(raza)){
            if (!perrosPorRaza.containsKey(raza)){
                perrosPorRaza.put(raza, new ArrayList<>());
            }
            perrosPorRaza.get(raza).add(perro);
        } else {
            System.out.println("El perro que ha ingresado no es de la raza "+raza);
        }
    }

    public void disqualifyDog(Perro perro){
        for (List<Perro> perros : perrosPorRaza.values()) {
            if (perros.remove(perro)) {
                return;
            }
        }
        System.out.println("Perro no inscrito");
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Map<String, List<Perro>> getPerrosPorRaza() {
        return perrosPorRaza;
    }
}
