package org.velazquez.U5_herencia_interfaces.Practica_U5.Ex_Practica_19_20;

public abstract class Personaje implements Comparable<Personaje> {
    private String nombre;
    private int energia;
    private int ataque;
    private int defensa;
    private boolean encantado;

    public Personaje(String nombre, int energia, int ataque, int defensa, boolean encantado){
        this.nombre=nombre;
        setEnergia(energia);
        setAtaque(ataque);
        setDefensa(defensa);
        this.encantado=encantado;
    }
    public int compareTo(Personaje p2) {
        //No funciona debido a que se intenta ordenar un array que contiene valores null.
        // El método Arrays.sort() de Java no puede manejar valores null en el array que se está ordenando.
        // Cuando encuentra un valor null, intenta invocar el método compareTo() en él, lo que resulta en una NullPointerException.
        //Para solucionar este problema, filtra los valores null antes de ordenar el array.
        return this.getEnergia()-p2.getEnergia();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia>=0 && energia<=1000){
            this.energia = energia;
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque>=0 && ataque<=100){
            this.ataque=ataque;
        }
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        if (defensa>=0 && defensa<=100){
            this.defensa=defensa;
        }
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
