package org.velazquez.U1_intro_bucles_condicionales.Practica_bucles;

public class cartas_aleatorias {
    public static void main(String[] args) {
        int numeroMax = 4;
        int numeroMin = 1;
        int palo = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        switch (palo) {
            case 1:
                System.out.println("Palo - picas");
                break;
            case 2:
                System.out.println("Palo - corazones");
                break;
            case 3:
                System.out.println("Palo - diamantes");
                break;
            case 4:
                System.out.println("Palo - tréboles");
                break;
        }
        numeroMax = 13;
        int cartas = (int) (Math.random() * ((numeroMax + 1) - numeroMin)) + numeroMin;
        switch (cartas) {
            case 1:
                System.out.println("Carta : A");
                break;
            case 2:
                System.out.println("Carta : 2");
                break;
            case 3:
                System.out.println("Carta : 3");
                break;
            case 4:
                System.out.println("Carta : 4");
                break;
            case 5:
                System.out.println("Carta : 5");
                break;
            case 6:
                System.out.println("Carta : 6");
                break;
            case 7:
                System.out.println("Carta : 7");
                break;
            case 8:
                System.out.println("Carta : 8");
                break;
            case 9:
                System.out.println("Carta : 9");
                break;
            case 10:
                System.out.println("Carta : 10");
                break;
            case 11:
                System.out.println("Carta : J");
                break;
            case 12:
                System.out.println("Carta : Q");
                break;
            case 13:
                System.out.println("Carta : K");
                break;
        }
    }
}
