package org.velazquez.U4_POO.tarea_1.ejercicio_6;

public class CuentaCorriente {
    private String nombre;
    private String dni;
    private long saldo;
    private long limit_descub;
    private Banco banco;

    public void informacion(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(saldo);
        System.out.println(limit_descub);
        System.out.println(banco.nombre);
        System.out.println(banco.capital);
        System.out.println(banco.direccion);
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

    public void cambiaBanco(Banco banco){
        this.banco=banco;
    }


    public CuentaCorriente(long saldo_inicial, Banco banco) {
        this.saldo = saldo_inicial;
        this.banco=banco;
        this.limit_descub= 0;
    }


    public CuentaCorriente(String nombre,String dni_titular,long saldo_inicial, long limite_descubierto, Banco banco) {
        this.saldo = saldo_inicial;
        this.banco=banco;
        this.limit_descub= limite_descubierto;
        this.dni = dni_titular;
        this.nombre=nombre;
    }
}
