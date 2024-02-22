package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_19_20;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {
    private Personaje[] personajes = new Personaje[10];

    public void agregarPersonaje(Personaje personaje) {
        if(!(personaje.getEnergia()<=0)){
            boolean check = true;
            for (int i = 0; i < personajes.length; i++) {
                if (personajes[i]==personaje){
                    check=false;
                    break;
                }
            }
            if (check){
                for (int i = 0; i < personajes.length; i++) {
                    if (personajes[i]==null){
                        personajes[i]=personaje;
                        break;
                    }
                }
            }
        }
    }

    public void eliminarPersonaje(Personaje personaje) {
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i]==personaje){
                personajes[i]=null;
                break;
            }
        }

    }

    public void borrarMuertos(){
        for (int i = 0; i < personajes.length; i++) {
            if (!(personajes[i].getEnergia()<=0)){
                personajes[i]=null;
                break;
            }
        }
    }

    public void mostrarEstado(){
        //Arrays.sort(personajes);
        Arrays.sort(
                personajes,
                new Comparator<Personaje>() {
                    @Override
                    public int compare(Personaje p1, Personaje p2) {
                        if (p1 != null && p2 != null) {
                            if (p1.getEnergia() < p2.getEnergia()) {
                                return -1;
                            } else if (p1.getEnergia() > p2.getEnergia()) {
                                return 1;
                            }
                        }
                        return 0;
                    }
                });
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }

//    public void mostrarEstado(){
//        // Crear un array temporal para almacenar los personajes no nulos
//        Personaje[] temp = new Personaje[personajes.length];
//        int count = 0;
//
//        // Copiar los personajes no nulos al array temporal
//        for (Personaje personaje : personajes) {
//            if (personaje != null) {
//                temp[count++] = personaje;
//            }
//        }
//
//        // Crear un nuevo array con el tamaño correcto
//        Personaje[] personajesNoNulos = new Personaje[count];
//        System.arraycopy(temp, 0, personajesNoNulos, 0, count);
//
//        // Ordenar el array filtrado
//        Arrays.sort(personajesNoNulos);
//
//        // Imprimir los personajes
//        for (Personaje personaje : personajesNoNulos) {
//            System.out.println(personaje);
//        }
//    }

    public void mostrarxAtaque(){
        Arrays.sort(
                personajes,
                new Comparator<Personaje>() {
                    @Override
                    public int compare(Personaje p1, Personaje p2) {
                        if (p1 != null && p2 != null) {
                            if (p1.getAtaque() < p2.getAtaque()) {
                                return -1;
                            } else if (p1.getAtaque() > p2.getAtaque()) {
                                return 1;
                            }
                        }
                        return 0;
                    }
                });
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }

    public void mostrarxDefensa(){
        Arrays.sort(
                personajes,
                new Comparator<Personaje>() {
                    @Override
                    public int compare(Personaje p1, Personaje p2) {
                        if (p1 != null && p2 != null) {
                            if (p1.getDefensa() < p2.getDefensa()) {
                                return -1;
                            } else if (p1.getDefensa() > p2.getDefensa()) {
                                return 1;
                            }
                        }
                        return 0;
                    }
                });
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }

    public void hayGanador(){
        int jugadoresRestantes = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i]!=null){
                jugadoresRestantes++;
            }
        }
        if (jugadoresRestantes==1){
            for (int i = 0; i < personajes.length; i++) {
                if (personajes[i]!=null){
                    System.out.println(personajes[i].getNombre()+" es el ganador.");
                    System.out.println(personajes[i]);
                }
            }
        } else {
            System.out.println("Todavía hay "+jugadoresRestantes+" personajes vivos.");
        }
    }

    @Override
    public String toString() {
        return "RPG{" +
                "personajes=" + Arrays.toString(personajes) +
                '}';
    }
}
