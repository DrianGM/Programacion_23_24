package org.velazquez.U9_bases_de_datos.Practica.Entregable_2122;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {
        FiltroPrecio();
        InfoPagos();
        informeCategoria();
        ConexionBD.close();
    }

    public static void FiltroPrecio() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el precio : ");
        double precio = sc.nextDouble();

        Connection con = null;

        try {
            con = ConexionBD.getConnection();

            String sql = "Select * from products where buyPrice > ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setDouble(1, precio);

            ResultSet rs = statement.executeQuery();

            System.out.println("Productos cuyo precio es mayor que '" + precio + "' : ");
            System.out.println("---------------------------------------");
            while (rs.next()) {
                System.out.println("Nombre del Producto: " + rs.getString("productName"));
                System.out.println("Precio: " + rs.getDouble("buyPrice"));
                System.out.println("---------------------------------------");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static void InfoPagos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero del cliente : ");
        int customerNumber = sc.nextInt();

        Connection con = null;

        try {
            con = ConexionBD.getConnection();

            String sql = "SELECT c.customerName, p.checkNumber, p.paymentDate, p.amount FROM customers c INNER JOIN payments p ON c.customerNumber = p.customerNumber WHERE c.customerNumber = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, customerNumber);

            ResultSet rs = statement.executeQuery();
            System.out.println("Todos los pagos realizados por el cliente con numero de cliente " + customerNumber);
            System.out.println("---------------------------------------");
            while (rs.next()) {
                System.out.println("Nombre del cliente: " + rs.getString("customerName"));
                System.out.println("Numero del pago: " + rs.getString("checkNumber"));
                System.out.println("Fecha del pago: " + rs.getString("paymentDate"));
                System.out.println("Cantidad: " + rs.getDouble("amount"));
                System.out.println("---------------------------------------");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public static void informeCategoria() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la categoria : ");
        String productLine = sc.nextLine();

        Connection con = null;

        try {
            con = ConexionBD.getConnection();

            String sql = "SELECT p.productName, SUM(od.quantityOrdered) AS total, p.buyPrice FROM products p JOIN orderdetails od ON p.productCode = od.productCode WHERE p.productLine = ? GROUP BY p.productName";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, productLine);

            ResultSet rs = statement.executeQuery();
            System.out.println("Productos del productLine " + productLine);
            System.out.println("---------------------------------------");
            while (rs.next()) {
                System.out.println("Nombre del producto: " + rs.getString("productName"));
                System.out.println("Unidades vendidas: " + rs.getInt("total"));
                System.out.println("Precio por unidad: " + rs.getDouble("buyPrice"));
                System.out.println("---------------------------------------");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
