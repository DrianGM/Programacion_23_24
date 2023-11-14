package org.velazquez.U3_strings_arrays.tarea_2;

public class tarea_9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Alabí Alixar");
        System.out.println("Capacidad inicial = " + sb.capacity());
        System.out.println("Longitud inicial = " + sb.length());
        sb.replace(0, sb.length(), "Chicharrones de Chiclana");
        System.out.println(sb);
        int num = 5000;
        sb.replace(0, sb.length(), "Hay " + num + " Chicharrones");
        System.out.println(sb);
        sb.insert(sb.length(), " en Chiclana");
        System.out.println(sb);
        String ultimosCuatro = sb.substring(sb.length() - 4, sb.length());
        System.out.println(ultimosCuatro);
        System.out.println("Capacidad final = " + sb.capacity());
        System.out.println("Longitud final = " + sb.length());
        System.out.println("----------");
        StringBuffer sbf = new StringBuffer("Alabí Alixar");
        System.out.println("Capacidad inicial = " + sbf.capacity());
        System.out.println("Longitud inicial = " + sbf.length());
        sbf.replace(0, sbf.length(), "Chicharrones de Chiclana");
        System.out.println(sbf);
        sbf.replace(0, sbf.length(), "Hay " + num + " Chicharrones");
        System.out.println(sbf);
        sbf.insert(sbf.length(), " en Chiclana");
        System.out.println(sbf);
        String ultimosCuatro2 = sbf.substring(sbf.length() - 4, sbf.length());
        System.out.println(ultimosCuatro2);
        System.out.println("Capacidad final = " + sbf.capacity());
        System.out.println("Longitud final = " + sbf.length());
    }
}