package org.velazquez.U8_xml_json.tarea_1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Futbolista> seleccion = new ArrayList<>();
        //Crear el ArrayList y llenarlo de objetos de la clase Futbolista
        seleccion.add(new Futbolista(1, "Casillas", Arrays.asList("Portero"), "Real Madrid"));
        seleccion.add(new Futbolista(15, "Ramos", Arrays.asList("Lateral derecho", "Medio centro"), "Real Madrid"));
        seleccion.add(new Futbolista(3, "Pique", Arrays.asList("Central"), "FC Barcelona"));
        seleccion.add(new Futbolista(5, "Puyol", Arrays.asList("Central"), "FC Barcelona"));
        seleccion.add(new Futbolista(11, "Capdevila", Arrays.asList("Lateral izquierdo"), "Villareal"));
        seleccion.add(new Futbolista(14, "Xabi Alonso", Arrays.asList("Defensa mediocampo", "Mediocampo"), "Real Madrid"));
        seleccion.add(new Futbolista(16, "Busquets", Arrays.asList("Defensa mediocampo"), "FC Barcelona"));
        seleccion.add(new Futbolista(8, "Xavi Hernandez", Arrays.asList("Mediocampo"), "FC Barcelona"));
        seleccion.add(new Futbolista(18, "Pedrito", Arrays.asList("Extremo izquierdo", "Falso extremo"), "FC Barcelona"));
        seleccion.add(new Futbolista(6, "Iniesta", Arrays.asList("Extremo derecho", "Mediocampo"), "FC Barcelona"));
        seleccion.add(new Futbolista(7, "Villa", Arrays.asList("Delantero centro"), "FC Barcelona"));
        //Crear el Gson y imprimir el ArrayList en un String en formato json

        Gson gson = new Gson();
        String json = gson.toJson(seleccion);

        System.out.println("------------------------");
        System.out.println("String en formato json :");
        System.out.println(json);
        System.out.println("------------------------");


        //Consigo el tipo del ArrayList para usarlo posteriormente
        Type tipoListaFutbolistas = new TypeToken<ArrayList<Futbolista>>(){}.getType();
        //Creo un nuevo ArrayList dado el String en formato json y el tipo del ArrayList anterior
        ArrayList<Futbolista> listaFutbolistas = gson.fromJson(json, tipoListaFutbolistas);

        System.out.println("ArrayList de futbolistas :");
        System.out.println(listaFutbolistas.toString());
        System.out.println("------------------------");


        List<String> demarcacionesRamos = new ArrayList<>();
        for (Futbolista futbolista : listaFutbolistas){
            if (futbolista.getNombre().equals("Ramos")){
                demarcacionesRamos = futbolista.getDemarcaciones();
            }
        }
        System.out.println("Demarcaciones de Ramos :");
        System.out.println(demarcacionesRamos.toString());
    }
}