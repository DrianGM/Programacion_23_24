package org.velazquez.U4_POO.tarea_1.ejercicio_3;

public class CuentaCorriente {
    public String nombre;
    String dni;
    private long saldo;
    private long limit_descub;

    public void informacion(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(saldo);
        System.out.println(limit_descub);
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

    public CuentaCorriente(long saldo_inicial) {
        this.saldo = saldo_inicial;
        this.limit_descub= 0;
    }

    public CuentaCorriente(long saldo_inicial, long limite_descubierto, String dni_titular) {
        this.saldo = saldo_inicial;
        this.limit_descub= limite_descubierto;
        this.dni = dni_titular;
    }


}
