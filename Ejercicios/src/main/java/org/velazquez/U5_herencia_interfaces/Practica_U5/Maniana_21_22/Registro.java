package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;


import java.util.Arrays;
import java.util.Comparator;

public class Registro {
    private Propiedad[] propiedades = new Propiedad[0];

    public void agregarPropiedad(Propiedad propiedad) {
        Propiedad[] copia = new Propiedad[propiedades.length + 1];
        for (int i = 0; i < propiedades.length; i++) {
            copia[i] = propiedades[i];
        }
        copia[propiedades.length] = propiedad;
        propiedades = copia;
    }

    public boolean eliminarPropiedad(Propiedad propiedad) {
        boolean eliminado = false;
        for (int i = 0; i < propiedades.length; i++) {
            if (propiedades[i]==propiedad){
                eliminado=true;
            }
        }
        if (eliminado){
            Propiedad[] copia = new Propiedad[propiedades.length - 1];
            int k = 0;
            for (int i = 0; i < propiedades.length; i++) {
                if (propiedades[i] != propiedad) {
                    copia[k] = propiedades[i];
                    k++;
                }
            }
            propiedades = copia;
        }
        return eliminado;
    }

    public void informeSuperficie(){
        Arrays.sort(
                propiedades,
                new Comparator<Propiedad>() {
                    @Override
                    public int compare(Propiedad p1, Propiedad p2) {
                        if (p1.metrosCuadrados < p2.metrosCuadrados) {
                            return -1;
                        } else if (p1.metrosCuadrados > p2.metrosCuadrados) {
                            return 1;
                        }
                        return 0;
                    }
                });
        for (int i = 0; i < propiedades.length; i++) {
            System.out.println(propiedades[i]);
        }
    }

    public void informeAntiguedad () {
        Arrays.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad o1, Propiedad o2) {
                if (o1.anioConstruccion > o2.anioConstruccion) {
                    return -1;
                } else if (o1.anioConstruccion < o2.anioConstruccion) {
                    return 1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        for (int i = 0; i < propiedades.length; i++) {
            System.out.println(propiedades[i]);
        }
    }
}
