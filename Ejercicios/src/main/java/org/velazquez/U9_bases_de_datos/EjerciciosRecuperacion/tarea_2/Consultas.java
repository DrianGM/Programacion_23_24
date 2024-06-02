package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {
    public static void main(String[] args) {
        consulta1();
        consulta2();
    }

    public static void consulta1(){
        Connection con = null;
        try {
            con = ConexionBD.getConnection();
            String sql = "SELECT c.customerName,e.firstName,o.city FROM customers c JOIN employees e ON c.salesRepEmployeeNumber=e.employeeNumber JOIN offices o ON o.officeCode=e.officeCode";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String customerName = rs.getString("customerName");
                String firstName = rs.getString("firstName");
                String city = rs.getString("city");
                System.out.println("Nombre del cliente : " + customerName);
                System.out.println("Nombre del empleado : " + firstName);
                System.out.println("Ciudad : " + city);
                System.out.println("-------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void consulta2(){
        Connection con = null;
        try {
            con = ConexionBD.getConnection();
            String sql = "SELECT c.customerName, o.orderDate, o.status, p.productName, od.quantityOrdered, p.buyPrice FROM customers c JOIN orders o ON c.customerNumber = o.customerNumber JOIN orderdetails od ON o.orderNumber = od.orderNumber JOIN products p ON od.productCode = p.productCode;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String customerName = rs.getString("customerName");
                String firstName = rs.getString("orderDate");
                String status = rs.getString("status");
                String productName = rs.getString("productName");
                String quantityOrdered = rs.getString("quantityOrdered");
                String buyPrice = rs.getString("buyPrice");
                System.out.println("Nombre del cliente : " + customerName);
                System.out.println("Nombre del empleado : " + firstName);
                System.out.println("Estado : " + status);
                System.out.println("Nombre del producto : " + productName);
                System.out.println("Cantidad : " + quantityOrdered);
                System.out.println("Precio de venta : " + buyPrice);
                System.out.println("-------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
