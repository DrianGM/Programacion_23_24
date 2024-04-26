package org.velazquez.U7_colecciones.U7_Entregable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Maraton maraton = new Maraton();
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        System.out.println("Elige una opcion : ");
        System.out.println("-----------------------------");
        System.out.println("1) Cargar atletas");
        System.out.println("2) Guardar atletas");
        System.out.println("3) Inscribir atleta");
        System.out.println("4) Guardar tiempo");
        System.out.println("5) Borrar atleta");
        System.out.println("6) Mostrar lista de finishers");
        System.out.println("7) Mostrar lista de atletas por categoría");
        System.out.println("8) Mostrar lista de participantes por pais");
        System.out.println("9) Salir del programa");
        System.out.println("-----------------------------");
        String respuesta = sc.nextLine();
        Atleta a1 = new Atleta("Pepe1", "Pepe", 100, Atleta.Categoria.SENIOR, true, 1);
        Atleta a2 = new Atleta("Pepe2", "Pepe", 90, Atleta.Categoria.SENIOR, true, 2);
        Atleta a3 = new Atleta("Pepe3", "Pepe", 80, Atleta.Categoria.SENIOR, true, 3);
        Atleta a4 = new Atleta("Pepe4", "Pepe", 70, Atleta.Categoria.SENIOR, true, 4);
        Atleta a5 = new Atleta("Pepe5", "Pepe", 60, Atleta.Categoria.SENIOR, true, 5);
        Atleta a7 = new Atleta("Pepe6", "Pepe", 50, Atleta.Categoria.JUNIOR, true, 6);
        Atleta a8 = new Atleta("Pepe7", "Pepe", 40, Atleta.Categoria.JUNIOR, true, 7);
        Atleta a9 = new Atleta("Pepe8", "Pepe", 30, Atleta.Categoria.JUNIOR, true, 8);
        Atleta a10 = new Atleta("Pepe9", "Pepe", 20, Atleta.Categoria.JUNIOR, true, 9);
        Atleta a11 = new Atleta("Pepe10", "Pepe", 10, Atleta.Categoria.JUNIOR, true, 10);
        //DEBIDO AL DISENIO DEL PROGRAMA, SI CREO ATLETAS DE ESTA FORMA EN VEZ DE CON LA FORMA NATURAL Y TIENEN ACABADO=FALSE, NO SE INSERTARAN BIEN (ES DEBIDO AL DISENIO DE LOS METODOS, QUE NO CONTEMPLABAN INSERTAR LOS ATLETAS ASI)
        //SI LOS INSERTAS DE FORMA NATURAL MEDIANTE 3) INGRESAR ATLETA, SE INSERTAN BIEN Y EL PROGRAMA FUNCIONARA CORRECTAMENTE
        Atleta a12 = new Atleta("Pepe11", "Pepe", 0, Atleta.Categoria.VETERANO, true, 11);
        Atleta a13 = new Atleta("Pepe12", "Pepe", 0, Atleta.Categoria.VETERANO, true, 12);
        Atleta a14 = new Atleta("Pepe13", "Pepe", 0, Atleta.Categoria.VETERANO, true, 13);
        Atleta a15 = new Atleta("Pepe14", "Pepe", 0, Atleta.Categoria.VETERANO, true, 14);
        Atleta a16 = new Atleta("Pepe15", "Pepe", 0, Atleta.Categoria.VETERANO, true, 15);
        maraton.agregarAtleta(a1);
        maraton.agregarAtleta(a2);
        maraton.agregarAtleta(a3);
        maraton.agregarAtleta(a4);
        maraton.agregarAtleta(a5);
        maraton.agregarAtleta(a7);
        maraton.agregarAtleta(a8);
        maraton.agregarAtleta(a9);
        maraton.agregarAtleta(a10);
        maraton.agregarAtleta(a11);
        maraton.agregarAtleta(a12);
        maraton.agregarAtleta(a13);
        maraton.agregarAtleta(a14);
        maraton.agregarAtleta(a15);
        maraton.agregarAtleta(a16);
        if (respuesta.equals("9")) {
            seguir = false;
        }
        while (seguir) {
            switch (respuesta) {
                case "1":
                    maraton.cargarAtletasBinario();
                    break;
                case "2":
                    maraton.guardarAtletasBinario();
                    System.out.println("Los atletas han sido cargados en el fichero maraton.dat");
                    break;
                case "3":
                    System.out.println("Ingrese el nombre del atleta :");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el pais del atleta :");
                    String pais = sc.nextLine();
                    int marca = 0;
                    System.out.println("Ingrese la categoria del atleta (SENIOR, JUNIOR, VETERANO) :");
                    String categ = sc.nextLine();
                    Atleta.Categoria categoria = Atleta.Categoria.valueOf(categ);
                    boolean acabado = false;
                    int dorsalProvisional = 0;
                    Atleta atleta = new Atleta(nombre, pais, marca, categoria, acabado, dorsalProvisional);
                    maraton.agregarAtleta(atleta);
                    break;
                case "4":
                    System.out.println("Ingrese dorsal del atleta :");
                    int dorsal = sc.nextInt();
                    maraton.guardarTiempo(dorsal);
                    break;
                case "5":
                    System.out.println("Ingrese el numero de dorsal del atleta que desea borrar: ");
                    dorsal = sc.nextInt();
                    maraton.borrarAtleta(dorsal);
                    break;
                case "6":
                    System.out.println("Atletas que han acabado por orden de tiempo: ");
                    maraton.MostrarListaFinishers();
                    break;
                case "7":
                    System.out.println("Ingrese la categoria del atleta (SENIOR, JUNIOR, VETERANO) :");
                    categ = sc.nextLine();
                    categoria = Atleta.Categoria.valueOf(categ);
                    maraton.MostrarListaCategoria(categoria);
                    break;
                case "8":
                    System.out.println("Ingresa el pais  :");
                    pais = sc.nextLine();
                    maraton.participantesPorPais(pais);
                    break;
                case "9":
                    seguir = false;
                    break;
                default:
                    System.out.println("Por favor, debe ingresar una opcion valida.");
            }
            if (seguir) {
                System.out.println("Elige una opcion : ");
                System.out.println("-----------------------------");
                System.out.println("1) Cargar atletas");
                System.out.println("2) Guardar atletas");
                System.out.println("3) Inscribir atleta");
                System.out.println("4) Guardar tiempo");
                System.out.println("5) Borrar atleta");
                System.out.println("6) Mostrar lista de finishers");
                System.out.println("7) Mostrar lista de atletas por categoría");
                System.out.println("8) Mostrar lista de participantes por país");
                System.out.println("9) Salir del programa");
                System.out.println("-----------------------------");
                respuesta = sc.nextLine();
            }
        }
    }
}