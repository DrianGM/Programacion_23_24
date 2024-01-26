package org.velazquez.U4_POO.U4_Entregable;

public class Principal {
    public static void main(String[] args) {
        Festival festival = new Festival();
        Concierto concierto1 = new Concierto("Full Bambo","02/02/24");
        Concierto concierto2 = new Concierto("Rock&Roll","04/02/24");
        festival.conciertos=Festival.agregar_concierto(concierto1,festival.conciertos);
        festival.conciertos=Festival.agregar_concierto(concierto2,festival.conciertos);
        System.out.println("Conciertos del festival :");
        festival.mostrar_conciertos();
        Escenario escenario1 = new Escenario("La Rosaleda","Málaga",30000);
        Escenario escenario2 = new Escenario("Benito Villamarin","Sevilla",60000);
        concierto1.escenarios=Concierto.agregar_escenario(escenario1,concierto1.escenarios);
        concierto2.escenarios=Concierto.agregar_escenario(escenario2,concierto2.escenarios);
        System.out.println("Cartelera de los conciertos :");
        concierto1.mostrar_informacion();
        concierto2.mostrar_informacion();
        Cantante cantante1 = new Cantante("Marco","Batman",19,"Gotham City");
        Cantante cantante2 = new Cantante("Fernando","Nano",33,"Oviedo");
        Cantante cantante3 = new Cantante("Javier","Rumano",33,"Sevilla");
        Cantante cantante4 = new Cantante("Christian","Chan",33,"Murcia");
        escenario1.cantantes=Escenario.agregar_cantante(cantante1,escenario1.cantantes);
        escenario1.cantantes=Escenario.agregar_cantante(cantante2,escenario1.cantantes);
        escenario2.cantantes=Escenario.agregar_cantante(cantante3,escenario2.cantantes);
        escenario2.cantantes=Escenario.agregar_cantante(cantante4,escenario2.cantantes);
        System.out.println("Cantantes de los escenarios :");
        escenario1.mostrar_cantantes();
        escenario2.mostrar_cantantes();
        Cancion cancioneta1 = new Cancion("La Macarena",300, Cancion.Genero.NEOPERREO,cantante1);
        Cancion cancioneta2 = new Cancion("Polaris",267, Cancion.Genero.TRAP,cantante1);
        Cancion cancioneta3 = new Cancion("Nana",312, Cancion.Genero.EMORAP,cantante2);
        Cancion cancioneta4 = new Cancion("Sabe",189, Cancion.Genero.NEOPERREO,cantante2);
        Cancion cancioneta5 = new Cancion("Darling",245, Cancion.Genero.TRAP,cantante3);
        Cancion cancioneta6 = new Cancion("Como Camaron",401, Cancion.Genero.EMORAP,cantante3);
        Cancion cancioneta7 = new Cancion("En llamas",273, Cancion.Genero.NEOPERREO,cantante4);
        Cancion cancioneta8 = new Cancion("Volando",280, Cancion.Genero.TRAP,cantante4);
        cantante1.canciones=Cantante.agregar_cancion(cancioneta1,cantante1.canciones);
        cantante1.canciones=Cantante.agregar_cancion(cancioneta2,cantante1.canciones);
        cantante2.canciones=Cantante.agregar_cancion(cancioneta3,cantante2.canciones);
        cantante2.canciones=Cantante.agregar_cancion(cancioneta4,cantante2.canciones);
        cantante3.canciones=Cantante.agregar_cancion(cancioneta5,cantante3.canciones);
        cantante3.canciones=Cantante.agregar_cancion(cancioneta6,cantante3.canciones);
        cantante4.canciones=Cantante.agregar_cancion(cancioneta7,cantante4.canciones);
        cantante4.canciones=Cantante.agregar_cancion(cancioneta8,cantante4.canciones);
        System.out.println("Lista de canciones de los cantantes :");
        cantante1.mostrarlista();
        cantante2.mostrarlista();
        cantante3.mostrarlista();
        cantante4.mostrarlista();
    }
}
