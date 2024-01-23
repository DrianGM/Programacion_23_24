package org.velazquez.U4_POO.tarea_1.ejercicio_10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora reloj = new Hora();
        System.out.println("Set la hora");
        int var = sc.nextInt();
        reloj.setHora(var);
        System.out.println("Set los minutos");
        var = sc.nextInt();
        reloj.setMinuto(var);
        System.out.println("Set los segundos");
        var = sc.nextInt();
        reloj.setSegundo(var);
        System.out.println("Dame los segundos totales");
        int n = sc.nextInt();
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int cociente = 0;
        int cociente2 = 0;
        int resto = 0;
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
        System.out.println(reloj.getHora());
        System.out.println(reloj.getMinuto());
        System.out.println(reloj.getSegundo());
        System.out.println(horas+" horas");
        System.out.println(minutos+" minutos");
        System.out.println(segundos+" segundos");
        //FALTA EL SUMADOR DE HORAS, MINUTOS Y SEGUNDOS
    }
}
