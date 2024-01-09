package org.velazquez.U4_POO.tarea_1.ejercicio_4;

public class CuentaCorriente {
    private String nombre;
    private String dni;
    private long saldo;
    private long limit_descub;
    static String nombre_banco;


    public void informacion(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(saldo);
        System.out.println(limit_descub);
        System.out.println(nombre_banco);
    }

    public void ingresar(int cantidad){
        saldo = saldo+cantidad;
    }

    public boolean sacar(int cantidad){
        if (cantidad<saldo+limit_descub){
            saldo=saldo-cantidad;
            System.out.println("Ha sido posible");
            return true;
        } else {
            System.out.println("No ha sido posible");
            return false;
        }
    }

    public CuentaCorriente(String nombre, String dni){
        this.saldo=0;
        this.limit_descub=-50;
        this.nombre=nombre;
        this.dni=dni;
    }

    public static void setNombreBanco(String banco) {
        nombre_banco = banco;
    }

}