package org.velazquez.U7_colecciones.Practica.Examen_1920_Tarde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coronavirus {
    private String nombreCientifico = "COVID-19";
    private String localidad = "Wuhan";
    Map<Character, List<Paciente>> pacientesPorCepa = new HashMap<>();

    public void addPaciente(char cepa, Paciente paciente){
        if (paciente.getCepa()==cepa){
            if (!pacientesPorCepa.containsKey(cepa)){
                pacientesPorCepa.put(cepa, new ArrayList<>());
            }
            pacientesPorCepa.get(cepa).add(paciente);
        } else {
            System.out.println("La cepa del paciente ingresado no concuerda con la cepa ingresada.");
        }
    }

    public void darDeAltaPaciente(Paciente paciente){
        for (List<Paciente> pacientes : pacientesPorCepa.values()) {
            if (pacientes.remove(paciente)){
                return;
            }
        }
        System.out.printf("No se ha encontrado el paciente");
    }

    public void pacientesDeUnDoctor(){

    }
}
