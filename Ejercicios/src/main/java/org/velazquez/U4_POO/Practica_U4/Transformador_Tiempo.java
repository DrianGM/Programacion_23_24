package org.velazquez.U4_POO.Practica_U4;

import java.util.Scanner;

public class Transformador_Tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int cociente = 0;
        int cociente2 = 0;
        int resto = 0;
        int n = sc.nextInt();
            if (segundos+n<=59){
                segundos=segundos+n;
            } else {
                cociente=(n+segundos)/60;
                resto=(n+segundos)%60;
                segundos=resto;
                if (minutos+cociente<=59){
                    minutos=minutos+cociente;
                } else {
                    cociente2=(minutos+cociente)/60;
                    minutos=(minutos+cociente)%60;
                    horas=horas+cociente2;
                }
            }
            System.out.println(horas+" horas");
            System.out.println(minutos+" minutos");
            System.out.println(segundos+" segundos");
            n = sc.nextInt();
    }
}