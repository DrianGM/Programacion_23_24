package org.velazquez.U5_herencia_interfaces.tarea_1.ejercicios_7_8;

public enum Unidades {
    CENTIMETROS("cm"),
    METROS("m");

    private String simbolo;

    Unidades(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
