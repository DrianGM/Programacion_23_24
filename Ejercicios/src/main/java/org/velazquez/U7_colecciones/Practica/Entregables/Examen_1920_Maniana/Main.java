package org.velazquez.U7_colecciones.Practica.Entregables.Examen_1920_Maniana;

public class Main {
    public static void main(String[] args) {
        Concurso c1 = new Concurso("Concurso 2024","Albacete");
        Propietario pr1 = new Propietario("Juan","Jimenez", "Espinosa",200,"Ecuador");
        Propietario pr2 = new Propietario("Juana","Garcia", "Garcia",304,"Ecuador");
        Perro p1 = new Perro("Princesitilla",7,89,true,pr1,"Bulldog");
        Perro p2 = new Perro("Princesita",14,92,true,pr1,"Bulldog");
        Perro p3 = new Perro("Princesotis",7,90,true,pr1,"Chiwawa");
        Perro p4 = new Perro("Princesotes",14,96,true,pr2,"Chiwawa");
        c1.addDog(p1.getRaza(),p1);
        c1.addDog(p2.getRaza(),p2);
        c1.addDog(p3.getRaza(),p3);
        c1.addDog(p4.getRaza(),p4);
        c1.cargarPerros();
        c1.ownerDogs(pr1.getNumSocio());
        System.out.println("------------------------");
        c1.perrosporPeso(p1.getRaza());
        System.out.println("------------------------");
        c1.perrosporEdad(p3.getRaza());
        System.out.println("------------------------");
        c1.guardarPerros();
    }
}