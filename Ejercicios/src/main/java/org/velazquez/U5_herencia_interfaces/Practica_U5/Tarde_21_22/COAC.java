package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;

public class COAC {
    private AgrupacionOficial[] agrupacionesOficiales;

    public void inscribir_agrupacion(AgrupacionOficial agrupacion){
        AgrupacionOficial[] copia = new AgrupacionOficial[agrupacionesOficiales.length + 1];
        for (int i = 0; i < agrupacionesOficiales.length; i++) {
            copia[i] = agrupacionesOficiales[i];
        }
        copia[agrupacionesOficiales.length] = agrupacion;
        agrupacionesOficiales = copia;
    }
    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion){
        boolean eliminado = false;
        for (int i = 0; i < agrupacionesOficiales.length; i++) {
            if (agrupacionesOficiales[i]==agrupacion){
                eliminado=true;
            }
        }
        if (eliminado){
            AgrupacionOficial[] copia = new AgrupacionOficial[agrupacionesOficiales.length - 1];
            int k = 0;
            for (int i = 0; i < agrupacionesOficiales.length; i++) {
                if (agrupacionesOficiales[i] != agrupacion) {
                    copia[k] = agrupacionesOficiales[i];
                    k++;
                }
            }
            agrupacionesOficiales = copia;
        }
        return eliminado;
    }
    public void ordenar_por_puntos(){

    }
    public void ordenar_por_nombre(){

    }
    public void ordenar_por_autor(){

    }
}
