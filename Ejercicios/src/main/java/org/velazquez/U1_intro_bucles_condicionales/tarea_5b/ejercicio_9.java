package org.velazquez.U1_intro_bucles_condicionales.tarea_5b;

import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un dia del mes : ");
        int dia = teclado.nextInt();
        System.out.println("Ingrese un mes con la primera letra en mayúscula : ");
        String mes = teclado.next();
        switch (mes) {
            case "Enero":
                if (dia > 31) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 19) {
                    System.out.println("Eres Capricornio");
                } else {
                    System.out.println("Eres Acuario");
                }
                break;
            case "Febrero":
                if (dia > 28) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 18) {
                    System.out.println("Eres Acuario");
                } else {
                    System.out.println("Eres Piscis");
                }
                break;
            case "Marzo":
                if (dia > 31) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 20) {
                    System.out.println("Eres Piscis");
                } else {
                    System.out.println("Eres Aries");
                }
                break;
            case "Abril":
                if (dia > 30) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 19) {
                    System.out.println("Eres Aries");
                } else {
                    System.out.println("Eres Tauro");
                }
                break;
            case "Mayo":
                if (dia > 31) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 20) {
                    System.out.println("Eres Tauro");
                } else {
                    System.out.println("Eres Géminis");
                }
                break;
            case "Junio":
                if (dia > 30) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 20) {
                    System.out.println("Eres Géminis");
                } else {
                    System.out.println("Eres Cáncer");
                }
                break;
            case "Julio":
                if (dia > 31) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 22) {
                    System.out.println("Eres Cáncer");
                } else {
                    System.out.println("Eres Leo");
                }
                break;
            case "Agosto":
                if (dia > 31) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 22) {
                    System.out.println("Eres Leo");
                } else {
                    System.out.println("Eres Virgo");
                }
                break;
            case "Septiembre":
                if (dia > 30) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 22) {
                    System.out.println("Eres Virgo");
                } else {
                    System.out.println("Eres Libra");
                }
                break;
            case "Octubre":
                if (dia > 31) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 22) {
                    System.out.println("Eres Libra");
                } else {
                    System.out.println("Eres Escorpio");
                }
                break;
            case "Noviembre":
                if (dia > 30) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 21) {
                    System.out.println("Eres Escorpio");
                } else {
                    System.out.println("Eres Sagitario");
                }
                break;
            case "Diciembre":
                if (dia > 31) {
                    System.out.println("Error : Este mes no tiene ese día.");
                }
                if (dia <= 21) {
                    System.out.println("Eres Sagitario");
                } else {
                    System.out.println("Eres Capricornio");
                }
                break;
            default:
                System.out.println("Ese no es ningún mes válido. (Ingrese un mes válido con la primera letra en mayúscula)");
                break;

        }
    }
}
