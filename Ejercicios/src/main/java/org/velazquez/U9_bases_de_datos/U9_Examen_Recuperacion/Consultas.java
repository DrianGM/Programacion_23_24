package org.velazquez.U9_bases_de_datos.U9_Examen_Recuperacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Consultas {

    public static void consulta1() {
        Connection con = null;

        try {
            con = ConexionBD.getConnection();

            String sql = "SELECT c.customerName, e.firstName, o.city FROM customers c JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber JOIN offices o ON e.officeCode = o.officeCode";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Nombre del cliente: " + rs.getString("customerName"));
                System.out.println("Nombre del empleado: " + rs.getString("firstName"));
                System.out.println("Ciudad: " + rs.getString("city"));
                System.out.println("---------------------------------------");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static void consulta2() {
        Connection con = null;

        try {
            con = ConexionBD.getConnection();

            String sql = "SELECT c.customerName, o.orderDate, o.status, p.productName, od.quantityOrdered, od.priceEach FROM customers c JOIN orders o ON c.customerNumber = o.customerNumber JOIN orderdetails od ON o.orderNumber = od.orderNumber JOIN products p ON od.productCode = p.productCode";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Nombre del cliente: " + rs.getString("customerName"));
                System.out.println("Fecha del pedido: " + rs.getString("orderDate"));
                System.out.println("Estado del pedido: " + rs.getString("status"));
                System.out.println("Nombre del producto: " + rs.getString("productName"));
                System.out.println("Cantidad: " + rs.getInt("quantityOrdered"));
                System.out.println("Precio: " + rs.getDouble("priceEach"));
                System.out.println("---------------------------------------");
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                    System.out.println("Conexion cerrada.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
