package org.velazquez.U7_colecciones.tarea_4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Empleado> mapa = new LinkedHashMap<>();
        boolean seguirIngresando = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a ingresar los datos del primer empleado :");
        while (seguirIngresando){
            System.out.println("Ingrese el nombre :");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el DNI:");
            String dni = sc.nextLine();
            System.out.println("Ingrese el edad :");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estatura :");
            double estatura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el sueldo :");
            double sueldo = sc.nextDouble();
            sc.nextLine();
            Empleado emp = new Empleado(nombre,dni,edad,estatura,sueldo);
            mapa.put(dni,emp);
            System.out.println("¿Quiere ingresar los datos del siguiente empleado? S/N");
            String respuesta = sc.nextLine();
            if (respuesta.equals("N")){
                seguirIngresando=false;
            }
        }
        boolean seguirOperando = true;
        while(seguirOperando){
            System.out.println("¿Qué desea hacer?");
            System.out.println("Ingrese A para Visualizar los datos de todos los empleados");
            System.out.println("Ingrese B para Borrar empleados");
            System.out.println("Ingrese C para Visualizar un empleado en concreto");
            System.out.println("Ingrese D para Modificar un empleado en concreto");
            System.out.println("Ingrese E para Insertar empleados");
            System.out.println("Ingrese F para Cerrar el programa");
            String respuesta = sc.nextLine();
            switch (respuesta) {
                case "A":
                    System.out.println("Datos de los empleados por orden de inserción :");
                    for (Map.Entry<String, Empleado> entry : mapa.entrySet()) {
                        System.out.println("DNI: " + entry.getKey() + ", Datos del Empleado: " + entry.getValue());
                    }
                    break;
                case "B":
                    boolean seguirBorrando = true;
                    while (seguirBorrando){
                        System.out.println("Ingrese el DNI del empleado que desea borrar :");
                        String clave = sc.nextLine();
                        boolean existeDNI = mapa.containsKey(clave);
                        if (existeDNI){
                            mapa.remove(clave);
                            System.out.println("Se ha borrado con exito.");
                            System.out.println(mapa);
                        } else {
                            System.out.println("No se ha encontrado a ningún empleado con ese DNI.");
                        }
                        System.out.println("¿Quiere seguir borrando? S/N");
                        respuesta=sc.nextLine();
                        if (respuesta.equals("N")){
                            seguirBorrando=false;
                        }
                    }
                    break;
                case "C":
                    System.out.println("Ingrese el DNI del empleado que desea visualizar sus datos :");
                    String clave = sc.nextLine();
                    boolean existeDNI = mapa.containsKey(clave);
                    if (existeDNI){
                        System.out.println(mapa.get(clave));
                    } else {
                        System.out.println("No se ha encontrado a ningún empleado con ese DNI.");
                    }
                    break;
                case "D":
                    System.out.println("Ingrese el DNI del empleado que desea modificar :");
                    String clave2 = sc.nextLine();
                    boolean existeDNI2 = mapa.containsKey(clave2);
                    if (existeDNI2){
                        System.out.println("Ingrese el nombre :");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese el edad :");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el estatura :");
                        double estatura = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Ingrese el sueldo :");
                        double sueldo = sc.nextDouble();
                        sc.nextLine();
                        Empleado emp = new Empleado(nombre,clave2,edad,estatura,sueldo);
                        mapa.put(clave2,emp);
                        
                    } else {
                        System.out.println("No se ha encontrado a ningún empleado con ese DNI.");
                    }
                    break;
                case "E":
                    seguirIngresando=true;
                    while (seguirIngresando){
                        System.out.println("Ingrese el nombre :");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese el DNI:");
                        String dni = sc.nextLine();
                        System.out.println("Ingrese el edad :");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el estatura :");
                        double estatura = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Ingrese el sueldo :");
                        double sueldo = sc.nextDouble();
                        sc.nextLine();
                        Empleado emp = new Empleado(nombre,dni,edad,estatura,sueldo);
                        mapa.put(dni,emp);
                        System.out.println("¿Quiere ingresar los datos del siguiente empleado? S/N");
                        respuesta = sc.nextLine();
                        if (respuesta.equals("N")){
                            seguirIngresando=false;
                        }
                    }
                    System.out.println(mapa);
                    break;
                case "F":
                    seguirOperando=false;
                    break;
                default:
                    System.out.println("Por favor, debe ingresar una opción válida (A,B,C,D,E)");
            }
            if (seguirOperando){
                System.out.println("¿Quiere seguir operando? S/N");
                respuesta=sc.nextLine();
                if (respuesta.equals("N")){
                    seguirOperando=false;
                }
            }
        }
    }
}
