package org.velazquez.U7_colecciones.tarea_3;

import java.util.HashMap;
import java.util.Map;

public class ejercicio_1 {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(calcularClave("46221877D"),"Alberto");
        mapa.put(calcularClave("06331848V"),"Leandro");
        mapa.put(calcularClave("77926426B"),"Javier");
        mapa.put(calcularClave("60800259N"),"Mario");
        System.out.println(mapa);
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