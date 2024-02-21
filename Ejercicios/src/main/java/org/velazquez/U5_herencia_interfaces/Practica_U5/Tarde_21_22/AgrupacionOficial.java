package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;


public abstract class AgrupacionOficial extends Agrupacion {
    private Integrante[] integrantes = new Integrante[0];

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String disfraz) {
        super(nombre, autor, autorMusica, autorLetras, disfraz);
    }

    public void insertar_integrante(Integrante integrante){
        Integrante[] copia = new Integrante[integrantes.length + 1];
        for (int i = 0; i < integrantes.length; i++) {
            copia[i] = integrantes[i];
        }
        copia[integrantes.length] = integrante;
        integrantes = copia;
    }

    public boolean eliminar_integrante(Integrante integrante){
        boolean eliminado = false;
        for (int i = 0; i < integrantes.length; i++) {
            if (integrantes[i]==integrante){
                eliminado=true;
            }
        }
        if (eliminado){
            Integrante[] copia = new Integrante[integrantes.length - 1];
            int k = 0;
            for (int i = 0; i < integrantes.length; i++) {
                if (integrantes[i] != integrante) {
                    copia[k] = integrantes[i];
                    k++;
                }
            }
            integrantes = copia;
        }
        return eliminado;
    }

    public abstract void caminito_del_falla();
}
