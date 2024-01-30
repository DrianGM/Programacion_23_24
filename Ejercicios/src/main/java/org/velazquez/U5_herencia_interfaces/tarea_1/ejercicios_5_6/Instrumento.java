package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_5_6;

import java.util.Arrays;

public class Instrumento {

    protected enum NotasMusicales{
        Do, Re, Mi, Fa, Sol, La, Si
    }

    private NotasMusicales[] notas = new NotasMusicales[100];

    public void add(NotasMusicales nota){
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]==null){
                notas[i]=nota;
                break;
            }
        }
    }

    public void interpretar(){

    }

    @Override
    public String toString() {
        return Arrays.toString(notas);
    }
}
