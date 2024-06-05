package org.velazquez.U9_bases_de_datos.Practica.Entregable_2122;

import java.sql.Connection;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
        Connection con = ConexionBD.getConnection();

        Employee emp = new Employee(2000,"Marshton","John","x6000","jmarshton@classicmodels.com","1",1102,"Sales Rep");
        Customer cus1 = new Customer(5001, "Empresa Ejemplo Uno", "Garcia", "Juan", "+34 955 555 555", "Calle Ejemplo 1", "Edificio 1", "Sevilla", "Andalucia", "41001", "España", emp.getEmployeeNumber(), 21000.00);
        Customer cus2 = new Customer(5002, "Empresa Ejemplo Dos", "Martinez", "Ana", "+34 955 555 556", "Avenida Ejemplo 2", "Edificio 2", "Sevilla", "Andalucia", "41002", "España", emp.getEmployeeNumber(), 15000.00);
        try {
            EmployeeModel.insertarEmployee(emp);
            CustomerModel.insertarCustomer(cus1);
            CustomerModel.insertarCustomer(cus2);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                System.out.println("Error en el rollback.");
                for (StackTraceElement element : ex.getStackTrace()) {
                    System.out.println(element);
                }
            }
        }
    }
}
