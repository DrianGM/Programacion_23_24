package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_19_20;

public class Enano extends Personaje implements Atacar {
    private float altura;
    public Enano(String nombre, int energia, int ataque, int defensa, boolean encantado,float altura) {
        super(nombre, energia, ataque, defensa, encantado);
        this.altura=altura;
    }

    @Override
    public String toString() {
        return "Enano{" +
                "altura=" + altura +
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
