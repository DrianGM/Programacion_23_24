package org.velazquez.U7_colecciones.tarea_3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class Traductor {
    private HashMap<String,String> diccionario = new HashMap();

    public Traductor(String ubi) {
        diccionario.put(ponerClave(ubi),ponerValor(ubi));
        diccionario.put(ponerClave(ubi),ponerValor(ubi));
        diccionario.put(ponerClave(ubi),ponerValor(ubi));
        diccionario.put(ponerClave(ubi),ponerValor(ubi));
    }

    private String ponerClave(String ubi){
        String clave = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(ubi));
            String linea = in.readLine();
            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt(i)!=','){
                    clave+=linea.charAt(i);
                } else {
                    break;
                }
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return clave;
    }

    private String ponerValor(String ubi){
        String valor = "";
        boolean check = false;
        try {
            BufferedReader in = new BufferedReader(new FileReader(ubi));
            String linea = in.readLine();
            for (int i = 0; i < linea.length(); i++) {
                if (check){
                    valor+=linea.charAt(i);
                }
                if (linea.charAt(i)==','){
                    check = true;
                }
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Path ruta = Path.of(ubi);
        try {
            List<String> lines = Files.readAllLines(ruta);
            if (!lines.isEmpty()) {
                lines.remove(0);
            }
            Files.write(ruta, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valor;
    }

    public String traduccion(String palabra){
        return diccionario.get(palabra);
    }
}
