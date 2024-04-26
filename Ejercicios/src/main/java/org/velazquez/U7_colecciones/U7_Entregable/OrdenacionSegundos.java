package org.velazquez.U7_colecciones.U7_Entregable;

import java.io.Serializable;
import java.util.Comparator;

public class OrdenacionSegundos implements Comparator<Atleta>, Serializable {

    public int compare(Atleta o1, Atleta o2) {
        return Integer.compare(o1.getSegundos(), o2.getSegundos());
    }
}
