package org.velazquez.U5_herencia_interfaces.U5_Examen;

public class Principal {
    public static void main(String[] args) {
        Catalogo c1 = new Catalogo();
        Pelicula p1 = new Pelicula("Cars", 2077, "Obama", 102, "Universal", "Uzbekistan");
        Serie s1 = new Serie("Ave Maria", 2014, "Koto Matamoros", 4);
        Libro l1 = new Libro("La Biblia", 1945, "Platon", "IVREA", "12345", 100);
        System.out.println("----------------------");
        System.out.println("Testeo la cantidad de multimedias creados | Testeo de add/eliminar capitulos a una Serie | Testeo el dar por finalizado un Objeto Multimedia");
        Catalogo.numero_de_elementos();
        String st1 = "S01E01";
        String st2 = "S01E02";
        String st3 = "S01E03";
        s1.add_Capitulo(st1);
        s1.add_Capitulo(st2);
        s1.add_Capitulo(st3);
        boolean check = s1.eliminar_capitulo(st2);
        System.out.println(p1);
        System.out.println("Capitulo eliminado : " + check);
        System.out.println(s1);
        l1.dar_por_finalizado();
        System.out.println(l1);
        System.out.println("----------------------");
        System.out.println("Testeo los metodos de la Interfaz Reproducible");
        p1.play();
        p1.pause();
        p1.stop();
        s1.play();
        s1.pause();
        s1.stop();
        System.out.println("----------------------");
        System.out.println("Testeo agregar/eliminar multimedias a un catalogo.");
        c1.add_multimedia(l1);
        c1.add_multimedia(s1);
        c1.add_multimedia(p1);
        check = c1.eliminar_multimedia(l1);
        System.out.println(c1);
        System.out.println("Multimedia eliminada : " + check);
        System.out.println("----------------------");
        System.out.println("Testeo la ordenacion. 1.Sin orden 2.Por id 3.Por titulo 4.Por anio");
        c1.add_multimedia(l1);
        System.out.println(c1);
        c1.ordenar_por_id();
        System.out.println(c1);
        c1.ordenar_por_titulo();
        System.out.println(c1);
        c1.ordenar_por_anio();
        System.out.println(c1);
    }
}
