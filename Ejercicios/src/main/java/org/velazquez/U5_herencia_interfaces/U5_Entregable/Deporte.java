package org.velazquez.U5_herencia_interfaces.U5_Entregable;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Deporte {
    private String nombre;
    private String pabellon;
    private Participante[] participantes = new Participante[1];

    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
    }

    public Deporte() {

    }

    public void agregarParticipante(Participante participante) {
        Participante[] copia = new Participante[participantes.length + 1];
        for (int i = 0; i < participantes.length; i++) {
            copia[i] = participantes[i];
        }
        copia[participantes.length] = participante;
        participantes = copia;
    }

    public void eliminarPais(Participante participante) {
        Participante[] copia = new Participante[participantes.length - 1];
        int k = 0;
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] != participante) {
                copia[k] = participantes[i];
                k++;
            }
        }
        participantes = copia;
    }

    public void mostrarParticipantes() {
        Arrays.sort(participantes,
                new Comparator<Participante>() {
                    @Override
                    public int compare(Participante p1, Participante p2) {
                        if (p1.getEdad() < p2.getEdad()) {
                            return -1;
                        } else if (p1.getEdad() > p2.getEdad()) {
                            return 1;
                        }
                        return p1.compareTo(p2);
                    }
                });
        for (int i = 0; i < participantes.length; i++) {
            System.out.println(participantes[i].nombre + "," + participantes[i].edad);
        }
    }
}
