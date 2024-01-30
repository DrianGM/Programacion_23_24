package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_1_4;

public class Hora12 extends Hora {
    private Mediodia mediodia;

    protected enum Mediodia{
        AM,PM;
    }

    public Hora12(int hora, int minutos) {
        super(hora, minutos);
    }

    @Override
    public void setHora(int hora) {
        if (hora<12){
            super.setHora(hora);
            this.mediodia=Mediodia.AM;
        }
        else if (hora>12 && hora<24){
            super.setHora(hora-12);
            this.mediodia=Mediodia.PM;
        } else {
            this.mediodia=Mediodia.AM;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minutos + " " + mediodia;
    }
}
