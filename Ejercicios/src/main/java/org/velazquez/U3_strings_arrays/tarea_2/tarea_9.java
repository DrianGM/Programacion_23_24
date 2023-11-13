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
    }
}
//WORK IN PROGRESS
//FALTA HACER EL MISMO EJERCICIO PERO CON LA CLASE STRINGBUFFER
