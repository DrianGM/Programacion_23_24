package org.velazquez.U5_herencia_interfaces.U5_Entregable;


import java.util.Arrays;
import java.util.Comparator;

public class Juegos {
    private int anio;
    private String sede;
    private Deporte[] deportes = new Deporte[1];
    private Pais[] paises = new Pais[0];


    public Juegos(int anio, String sede) {
        setAnio(anio);
        this.sede = sede;
    }

    public void setAnio(int anio) {
        if (anio % 4 == 0) {
            this.anio = anio;
        }
    }

    public void agregarPais(Pais pais) {
        Pais[] copia = new Pais[paises.length + 1];
        for (int i = 0; i < paises.length; i++) {
            copia[i] = paises[i];
        }
        copia[paises.length] = pais;
        paises = copia;
    }

    public void eliminarPais(Pais pais) {
        Pais[] copia = new Pais[paises.length - 1];
        int k = 0;
        for (int i = 0; i < paises.length; i++) {
            if (paises[i] != pais) {
                copia[k] = paises[i];
                k++;
            }
        }
        paises = copia;
    }

    public void agregarDeporte(Deporte deporte) {
        Deporte[] copia = new Deporte[paises.length + 1];
        for (int i = 0; i < deportes.length; i++) {
            copia[i] = deportes[i];
        }
        copia[paises.length] = deporte;
        deportes = copia;
    }

    public void eliminarDeporte(Deporte deporte) {
        Deporte[] copia = new Deporte[paises.length - 1];
        int k = 0;
        for (int i = 0; i < deportes.length; i++) {
            if (deportes[i] != deporte) {
                copia[k] = deportes[i];
                k++;
            }
        }
        deportes = copia;
    }

    public void mostrarPaises() {
        Arrays.sort(paises,
                new Comparator<Pais>() {
                    @Override
                    public int compare(Pais pais1, Pais pais2) {
                        if (pais1.getParticipantes() < pais2.getParticipantes()) {
                            return -1;
                        } else if (pais1.getParticipantes() > pais2.getParticipantes()) {
                            return 1;
                        }
                        return pais1.compareTo(pais2);
                    }
                });
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i].nombre + "," + paises[i].participantes);
        }
    }

    public void mostrarPaisesParaCeremonia() {
        Arrays.sort(this.paises);
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i].nombre + "," + paises[i].participantes);
        }
    }

}
