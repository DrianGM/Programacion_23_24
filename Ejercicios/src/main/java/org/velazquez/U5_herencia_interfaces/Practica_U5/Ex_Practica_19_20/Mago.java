package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_19_20;

public class Mago extends Hombre implements Magia{
    private float longitudBarba;
    public Mago(String nombre, int energia, int ataque, int defensa, boolean encantado,float longitudBarba) {
        super(nombre, energia, ataque, defensa, encantado);
        this.longitudBarba=longitudBarba;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "longitudBarba=" + longitudBarba +
                ", nombre='" + getNombre() +
                ", energia=" + getEnergia() +
                ", ataque=" + getAtaque() +
                ", defensa=" + getDefensa() +
                ", encantado=" + isEncantado() +
                '}';
    }

    @Override
    public void encantar(Personaje personaje) {
        personaje.setEncantado(true);
    }

    @Override
    public void desencantar(Personaje personaje) {
        personaje.setEncantado(false);
    }
}
