package org.velazquez.U5_herencia_interfaces.U5_Examen;


import java.util.Arrays;
import java.util.Comparator;

public class Catalogo {
    private Multimedia[] multimedias = new Multimedia[0];

    public static void numero_de_elementos() {
        //Imprime la cantidad de objetos de este tipo que se han creado. (El contador)
        System.out.println("Existen " + Multimedia.getCantidadMultimedias() + " multimedias.");
    }

    public void add_multimedia(Multimedia multimedia) {
        //Mediante un array copia del nuestro que tiene un hueco más para almacenar, le agregamos el nuevo Objeto a almacenar.
        Multimedia[] copia = new Multimedia[multimedias.length + 1];
        for (int i = 0; i < multimedias.length; i++) {
            copia[i] = multimedias[i];
        }
        copia[multimedias.length] = multimedia;
        multimedias = copia;
    }

    public boolean eliminar_multimedia(Multimedia multimedia) {
        //Primero se comprueba si el Objeto multimedia existe en el array, para posteriormente eliminado.
        boolean eliminado = false;
        for (int i = 0; i < multimedias.length; i++) {
            if (multimedias[i] == (multimedia)) {
                eliminado = true;
            }
        }
        //Si existe, se procede a la eliminacion, mediante un array más corto con el mismo contenido excepto el objeto que queremos eliminar.
        //Al trabajar con arrays de distinta longitud, poseen distintos indices.
        if (eliminado) {
            Multimedia[] copia = new Multimedia[multimedias.length - 1];
            int k = 0;
            for (int i = 0; i < multimedias.length; i++) {
                if (multimedias[i] != multimedia) {
                    copia[k] = multimedias[i];
                    k++;
                }
            }
            multimedias = copia;
        }
        //Se devuelve true si el procedimiento de eliminacion se ha efectuado o false si no.
        return eliminado;
    }

    public void ordenar_por_id() {
        //He establecido la ordenacion por id como metodo por defecto de ordenacion de la clase id, por lo que al usar Arrays.sort sin establecer in Comparator se ordenará por id.
        Arrays.sort(multimedias);
        //Podría haber establecido la ordenacion por id mediante un Comparator de la siguiente forma :
//        Arrays.sort(
//                multimedias,
//                new Comparator<Multimedia>() {
//                    @Override
//                    public int compare(Multimedia m1, Multimedia m2) {
//                        if (m1.getIdMultimedia() < m2.getIdMultimedia()) {
//                            return -1;
//                        } else if (m1.getIdMultimedia() > m2.getIdMultimedia()) {
//                            return 1;
//                        }
//                        return 0;
//                    }
//                });
    }

    public void ordenar_por_titulo() {
        //Recibimos y comparamos los titulos (Strings)
        Arrays.sort(
                multimedias,
                new Comparator<Multimedia>() {
                    @Override
                    public int compare(Multimedia m1, Multimedia m2) {
                        return m1.getTitulo().compareTo(m2.getTitulo());
                    }
                });
    }

    public void ordenar_por_anio() {
        //Mediente el Comparator ordeno por anio de estreno, pero si se da el caso de que tengan las mismas fechas, se ordenará por id, que es el método por defecto.
        Arrays.sort(
                multimedias,
                new Comparator<Multimedia>() {
                    @Override
                    public int compare(Multimedia m1, Multimedia m2) {
                        if (m1.getAnioEstreno() < m2.getAnioEstreno()) {
                            return -1;
                        } else if (m1.getAnioEstreno() > m2.getAnioEstreno()) {
                            return 1;
                        }
                        return m1.compareTo(m2);
                    }
                });
    }

    public Multimedia[] getMultimedias() {
        return multimedias;
    }

    public void setMultimedias(Multimedia[] multimedias) {
        this.multimedias = multimedias;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "multimedias=" + Arrays.toString(multimedias) +
                '}';
    }
}
