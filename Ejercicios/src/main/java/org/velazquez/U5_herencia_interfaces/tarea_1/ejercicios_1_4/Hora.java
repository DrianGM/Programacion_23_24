package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_1_4;

public class Hora {
    protected int hora;
    protected int minutos;


    public Hora(int hora,int minutos) {
        setHora(hora);
        setMinutos(minutos);
    }

    public void inc(){
        if (minutos>=59){
            if (hora>=23){
                hora=0;
            } else {
                hora++;
            }
            minutos=0;
        } else {
            minutos++;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <=59){
            this.minutos=minutos;
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <=23){
            this.hora=hora;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minutos;
    }
}
