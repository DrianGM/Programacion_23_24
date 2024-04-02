package org.velazquez.U7_colecciones.tarea_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Empleado> mapa = new HashMap<>();
        boolean seguirIngresando = true;
        System.out.println("Vamos a ingresar los datos del primer empleado :");
        Scanner sc = new Scanner(System.in);
        while (seguirIngresando){
            System.out.println("Ingrese el nombre :");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el DNI:");
            String dni = sc.nextLine();
            System.out.println("Ingrese el edad :");
            int edad = sc.nextInt();
            System.out.println("Ingrese el estatura :");
            double estatura = sc.nextDouble();
            System.out.println("Ingrese el sueldo :");
            double sueldo = sc.nextDouble();
            Empleado emp = new Empleado(nombre,dni,edad,estatura,sueldo);
            mapa.put(dni,emp);
            System.out.println("¿Quiere ingresar los datos del siguiente empleado? S/N");
            String respuesta = sc.nextLine();
            if (respuesta.equals("N")){
                seguirIngresando=false;
            }
        }
        System.out.println(mapa);
        //WORK IN PROGRESS
    }
}
