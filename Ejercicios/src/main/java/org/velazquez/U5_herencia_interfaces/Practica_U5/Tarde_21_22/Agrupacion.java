package org.velazquez.U5_herencia_interfaces.Practica_U5.Tarde_21_22;


public abstract class Agrupacion implements Comparable<Agrupacion>{
    protected String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    protected String disfraz;
    private static int cantidadAgrupaciones = 0;

    public Agrupacion(String nombre,String autor,String autorMusica,String autorLetras,String disfraz){
        this.nombre=nombre;
        this.autor=autor;
        this.autorMusica=autorMusica;
        this.autorLetras=autorLetras;
        this.disfraz=disfraz;
        cantidadAgrupaciones++;
    }


    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();

    public void cantidad_Agrupaciones(){
        System.out.println("Se han creado "+cantidadAgrupaciones+" agrupaciones.");
    }


    public int compareTo(Agrupacion otra) {
        return this.nombre.compareTo(otra.nombre);
    }
}
