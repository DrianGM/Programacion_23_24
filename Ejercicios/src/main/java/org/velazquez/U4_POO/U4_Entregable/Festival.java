package org.velazquez.U4_POO.U4_Entregable;

public class Festival {
    public Concierto[] conciertos = new Concierto[0];


    public void mostrar_conciertos(){
        for (int i = 0; i < this.conciertos.length; i++) {
            System.out.println(this.conciertos[i].getNombreCon());
        }
    }

    public static Concierto[] agregar_concierto(Concierto conciertoNuevo, Concierto[] conciertos) {
        Concierto[] copia = new Concierto[conciertos.length + 1];
        System.arraycopy(conciertos, 0, copia, 0, conciertos.length);
        copia[conciertos.length] = conciertoNuevo;
        return copia;
    }

    public void setConciertos(Concierto[] conciertos) {
        this.conciertos = conciertos;
    }

    public Concierto[] getConciertos() {
        return conciertos;
    }
}
