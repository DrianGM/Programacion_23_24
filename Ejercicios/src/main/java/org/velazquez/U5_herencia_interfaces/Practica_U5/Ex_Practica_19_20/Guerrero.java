package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_19_20;

public class Guerrero extends Hombre implements Atacar{
    private int edad;
    public Guerrero(String nombre, int energia, int ataque, int defensa, boolean encantado,int edad) {
        super(nombre, energia, ataque, defensa, encantado);
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "edad=" + edad +
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
