package org.velazquez.U5_herencia_interfaces.Practica_U5.Maniana_21_22;

public class Principal {
    public static void main(String[] args) {
        Vivienda l1 = new Vivienda(2012,"Villamarin",101,2,6,5,150000);
        Vivienda l2 = new Vivienda(2012,"Villamarin",102,2,6,5,150000);
        Vivienda l3 = new Vivienda(2012,"Villamarin",103,2,6,5,150000);
        Vivienda l4 = new Vivienda(2012,"Villamarin",104,2,6,5,150000);
        Persona p1 = new Persona("838383F","Paco");
        Persona p2 = new Persona("838383F","Pepito");
        Persona p3 = new Persona("838383F","Julio");
        Persona p4 = new Persona("838383F","Roberta");
        Persona p5 = new Persona("838383F","Jose");
        Persona p6 = new Persona("838383F","Manuela");
        l1.agregarPersona(p1);
        l1.agregarPersona(p2);
        l1.agregarPersona(p3);
        l1.agregarPersona(p4);
        l1.agregarPersona(p5);
        l1.mostrarPropiedad();
        l1.eliminarPersona(p3);
        l1.agregarPersona(p6);
        l1.mostrarPropiedad();
        l1.cantidadPropiedades();
        l1.mostrarPrecioVenta();
        System.out.println("------------------------");
        Registro r1 = new Registro();
        r1.agregarPropiedad(l1);
        r1.agregarPropiedad(l3);
        r1.agregarPropiedad(l4);
        r1.agregarPropiedad(l2);
        r1.informeSuperficie();
        //BUG AQUI
    }
}