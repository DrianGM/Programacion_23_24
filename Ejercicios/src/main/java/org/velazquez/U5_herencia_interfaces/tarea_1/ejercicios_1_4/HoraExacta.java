package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_1_4;


public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos,int segundos) {
        super(hora, minutos);
        setSegundos(segundos);
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <=59){
            this.segundos=segundos;
        }
    }

    public void inc(){
        if (segundos>=59){
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
            segundos=0;
        } else {
            segundos++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return this.segundos==that.segundos && this.minutos==that.minutos && this.hora==that.hora;
    }


    @Override
    public String toString() {
        return hora + ":" + minutos + ":" + segundos;
    }
}
