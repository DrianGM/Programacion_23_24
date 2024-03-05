package org.velazquez.U6_ficheros.tarea_1.ejercicio_6;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese true para leer el libro de firmas, false para agregar un nuevo nombre");
        boolean operacion = sc.nextBoolean();
        if (operacion){
            System.out.println("Toma el libro de firmas");
            String texto = "";
            try {
                boolean primeraLetra = true;
                BufferedReader in = new BufferedReader(new FileReader("src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_6/firmas.txt"));
                String linea = in.readLine();
                while (linea != null) {
                    if (primeraLetra){
                        texto += linea;
                        primeraLetra=false;
                    } else {
                        texto += " " + linea;
                    }
                    linea = in.readLine();
                }
                in.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(texto);
        } else {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Ingresa el nuevo nombre :");
            String nombre = sc2.nextLine();
            String texto = "";
            boolean escrito = false;
            boolean primeraLetra = true;
            try {
                BufferedReader in = new BufferedReader(new FileReader("src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_6/firmas.txt"));
                String linea = in.readLine();
                while (linea != null) {
                    if (primeraLetra){
                        texto += linea;
                        primeraLetra=false;
                    } else {
                        texto += " " + linea;
                    }
                    linea = in.readLine();
                }
                in.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            String palabra = "";
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i)!=' '){
                    palabra+=texto.charAt(i);
                } else {
                    if (palabra.equals(nombre)){
                        escrito=true;
                    } else {
                        palabra = "";
                    }
                }
            }
            if (!escrito){
                if (palabra.equals(nombre)){
                    escrito=true;
                }
            }
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("src/main/java/org/velazquez/U6_ficheros/tarea_1/ejercicio_6/firmas.txt"));
                if (!escrito){
                    out.write(texto + " " + nombre);
                } else {
                    out.write(texto);
                }
                out.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
