package org.velazquez.U9_bases_de_datos.Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Consultas {
    public static void main(String[] args) {
        empleadosOficinaMayor();
        productosNoVendidos();
        informeCategoria();
    }

    public static void empleadosOficinaMayor() {

        Connection connection = null;

        try {
            connection = org.velazquez.U9_bases_de_datos.Entregable.CONEXIONBD.getConnection();


            System.out.println("Clientes que trabajan en la oficiona que tiene mas empleados :");

//            String sqlCLIENTES = "SELECT * FROM employees WHERE OfficeCode IN (SELECT COUNT(OfficeCode) FROM employees GROUP BY OfficeCode LIMIT 1)";
            String sqlCLIENTES = "SELECT e.* FROM employees e WHERE e.officeCode = (SELECT o.officeCode FROM offices o JOIN employees e ON o.officeCode = e.officeCode GROUP BY o.officeCode ORDER BY COUNT(e.officeCode) DESC LIMIT 1)";

            PreparedStatement mostrarProductos = connection.prepareStatement(sqlCLIENTES);

            ResultSet RSmostrarProductos = mostrarProductos.executeQuery();

            while (RSmostrarProductos.next()) {
                System.out.println("Numero del empleado: " + RSmostrarProductos.getInt("employeeNumber"));
                System.out.println("lastName: " + RSmostrarProductos.getString("lastName"));
                System.out.println("firstName: " + RSmostrarProductos.getString("firstName"));
                System.out.println("extension: " + RSmostrarProductos.getString("extension"));
                System.out.println("email: " + RSmostrarProductos.getString("email"));
                System.out.println("officeCode: " + RSmostrarProductos.getString("officeCode"));
                System.out.println("reportsTo: " + RSmostrarProductos.getInt("reportsTo"));
                System.out.println("jobTitle: " + RSmostrarProductos.getString("jobTitle"));
                System.out.println("------------------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.getMessage();
            }

        }
    }

    public static void productosNoVendidos() {

        Connection connection = null;

        try {
            connection = org.velazquez.U9_bases_de_datos.Entregable.CONEXIONBD.getConnection();

            System.out.println("Productos que no han sido incluidos en ningun pedido :");

            String sqlCLIENTES = "SELECT * FROM products WHERE productCode NOT IN (SELECT productCode FROM orderdetails)";

            PreparedStatement mostrarProductos = connection.prepareStatement(sqlCLIENTES);

            ResultSet RSmostrarProductos = mostrarProductos.executeQuery();

            while (RSmostrarProductos.next()) {
                System.out.println("productCode: " + RSmostrarProductos.getString("productCode"));
                System.out.println("productName: " + RSmostrarProductos.getString("productName"));
                System.out.println("productLine: " + RSmostrarProductos.getString("productLine"));
                System.out.println("productScale: " + RSmostrarProductos.getString("productScale"));
                System.out.println("productVendor: " + RSmostrarProductos.getString("productVendor"));
                System.out.println("productDescription: " + RSmostrarProductos.getString("productDescription"));
                System.out.println("quantityInStock: " + RSmostrarProductos.getInt("quantityInStock"));
                System.out.println("buyPrice: " + RSmostrarProductos.getDouble("buyPrice"));
                System.out.println("MSRP: " + RSmostrarProductos.getDouble("MSRP"));

                System.out.println("------------------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }

    public static void informeCategoria() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la categoria : ");
        String nombreCategoria = sc.nextLine();

        Connection connection = org.velazquez.U9_bases_de_datos.Entregable.CONEXIONBD.getConnection();

        try {

            String verificarCategoria = "Select * from productlines where productLine = '" + nombreCategoria + "'";

            PreparedStatement pst = connection.prepareStatement(verificarCategoria);

            ResultSet verificacion = pst.executeQuery();

            if (verificacion.next()) {
                System.out.println("Productos de la categoria '" + nombreCategoria + "' :");

                String consultaSQL = "SELECT p.productName, o.quantityOrdered, SUM(p.buyPrice) FROM products p JOIN orderdetails o ON p.productCode = o.productCode WHERE p.productLine LIKE ? GROUP BY p.productName";

                PreparedStatement mostrarProductos = connection.prepareStatement(consultaSQL);

                mostrarProductos.setString(1, nombreCategoria);

                ResultSet RSmostrarProductos = mostrarProductos.executeQuery();

                while (RSmostrarProductos.next()) {
                    System.out.println("Nombre del producto: " + RSmostrarProductos.getString("productName"));
                    System.out.println("quantityOrdered: " + RSmostrarProductos.getInt("quantityOrdered"));
                    System.out.println("Total: " + RSmostrarProductos.getFloat("SUM(p.buyPrice)"));
                    System.out.println("------------------------------------------------------------------------------");
                }

            } else {
                System.out.println("La categoria '" + nombreCategoria + "' no existe en la base de datos.");
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
}
