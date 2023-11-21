package org.velazquez.U3_strings_arrays.tarea_3;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos = 5;
        int[] primer = {6, 8, 7, 4, 3};
        int[] segundo = {7, 6, 10, 4, 6};
        int[] tercero = {9, 7, 3, 9, 8};
        System.out.println("Ingrese el numero del alumno para hacer su media : (1-5)");
        int pos = sc.nextInt() - 1;
        int mediaAlumno = (primer[pos] + segundo[pos] + tercero[pos]) / 3;
        System.out.println("El alumno " + (pos + 1) + " tiene un " + mediaAlumno + " de media.");
        int mediaPrimer = 0;
        int mediaSegundo = 0;
        int mediaTercero = 0;
        for (int i = 0; i < numAlumnos; i++) {
            mediaPrimer = primer[i] + mediaPrimer;
            if (i == numAlumnos - 1) {
                mediaPrimer = mediaPrimer / numAlumnos;
            }
        }
        for (int i = 0; i < numAlumnos; i++) {
            mediaSegundo = segundo[i] + mediaSegundo;
            if (i == numAlumnos - 1) {
                mediaSegundo = mediaSegundo / numAlumnos;
            }
        }
        for (int i = 0; i < numAlumnos; i++) {
            mediaTercero = tercero[i] + mediaTercero;
            if (i == numAlumnos - 1) {
                mediaTercero = mediaTercero / numAlumnos;
            }
        }
        System.out.println("La media grupal del primer trimestre es de : " + mediaPrimer);
        System.out.println("La media grupal del segundo trimestre es de : " + mediaSegundo);
        System.out.println("La media grupal del tercer trimestre es de : " + mediaTercero);
        System.out.println(34 / 5);
    }
}
