package org.velazquez.U4_POO.tarea_1.ejercicio_5;

public class Texto {
    private String cadena;
    private int max_long;

    public Texto(int max_long) {
        this.cadena = "";
        this.max_long = max_long;
    }

    public void mostrarCadena(){
        System.out.println(cadena);
    }

    public void agregarCaracter(char caracter, String posicion) {
        if (posicion.equals("inicio") && this.cadena.length() < this.max_long) {
            this.cadena = caracter + this.cadena;
        } else if (posicion.equals("final") && this.cadena.length() < this.max_long) {
            this.cadena = this.cadena + caracter;
        }
    }

    public void agregarCadena(String cadena, String posicion) {
        if (posicion.equals("inicio") && this.cadena.length() + cadena.length() <= this.max_long) {
            this.cadena = cadena + this.cadena;
        } else if (posicion.equals("final") && this.cadena.length() + cadena.length() <= this.max_long) {
            this.cadena = this.cadena + cadena;
        }
    }

    public int contarVocales() {
        int contador = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            char caracter = this.cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                contador++;
            }
        }
        return contador;
    }
}

