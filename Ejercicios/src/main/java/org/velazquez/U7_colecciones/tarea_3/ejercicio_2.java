package org.velazquez.U7_colecciones.tarea_3;

//Añada al programa anterior la siguiente funcionalidad. El programa pedirá al usuario un dni, calculará la clave que ha de consultar, comprobará que dicha clave existe, y, en tal caso, mostrará el valor asociado a esa clave en el HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(calcularClave("46221877D"),"Alberto");
        mapa.put(calcularClave("06331848V"),"Leandro");
        mapa.put(calcularClave("77926426B"),"Javier");
        mapa.put(calcularClave("60800259N"),"Mario");
        System.out.println("Ingrese un DNI :");
        Scanner sc = new Scanner(System.in);
        String dni = sc.nextLine();
        Integer clave = calcularClave(dni);
        if (mapa.get(clave)!=null){
            System.out.println("El valor de esta clave es : "+mapa.get(clave));
        } else {
            System.out.println("Esta clave no existe en el mapa.");
        }
    }

    public static Integer calcularClave(String dni){
        int suma = 0;
        for (int i=0;i<dni.length();i++){
            if(Character.isDigit(dni.charAt(i))){
                int num = Character.getNumericValue(dni.charAt(i));
                suma = suma + num;
            }
        }
        return suma;
    }
}