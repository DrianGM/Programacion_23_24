package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_19_20;

public class Orco extends Personaje implements Atacar{
    private int tonelaje;
    public Orco(String nombre, int energia, int ataque, int defensa, boolean encantado, int tonelaje) {
        super(nombre, energia, ataque, defensa, encantado);
        this.tonelaje=tonelaje;
    }

    @Override
    public String toString() {
        return "Orco{" +
                "tonelaje=" + tonelaje +
                ", nombre='" + getNombre() +
                ", energia=" + getEnergia() +
                ", ataque=" + getAtaque() +
                ", defensa=" + getDefensa() +
                ", encantado=" + isEncantado() +
                '}';
    }

    @Override
    public void atacarPersonaje(Personaje personaje) {
        System.out.println(this.getNombre()+" - ATACANDO");
        if (this!=personaje){
            int damage = this.getAtaque()-personaje.getDefensa();
            if (personaje.isEncantado()){
                damage=damage*2;
            }
            personaje.setEnergia(personaje.getEnergia()-damage);
        }
    }
}
