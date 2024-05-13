package org.velazquez.U9_bases_de_datos.Practica.Entregable_2021;

import org.velazquez.U9_bases_de_datos.Entregable.CONEXIONBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {
//        FiltroPrecio();
//        InfoPagos();
        informeCategoria();
    }

    public static void FiltroPrecio() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el precio : ");
        int precio = sc.nextInt();

        Connection connection = null;

        try {
            connection = CONEXIONBD.getConnection();

            String consultaProductos = "Select * from products where buyPrice > " + precio;

            PreparedStatement pst = connection.prepareStatement(consultaProductos);

            ResultSet verificacion = pst.executeQuery();

            if (verificacion.next()) {
                System.out.println("Productos cuyo buyPrice es mayor que '" + precio + "' : ");

                PreparedStatement mostrarProductos = connection.prepareStatement(consultaProductos);

                ResultSet RSmostrarProductos = mostrarProductos.executeQuery();

                while (RSmostrarProductos.next()) {
                    System.out.println("Nombre del Producto: " + RSmostrarProductos.getString("productName"));
                    System.out.println("Precio de compra: " + RSmostrarProductos.getDouble("buyPrice"));
                    System.out.println("------------------------------------------------------------------------------");
                }

            } else {
                System.out.println("No se ha ingresado un precio valido. '" + precio + "' no es valido.");
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

    public static void InfoPagos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el customerNumber: ");
        int customerNumber = sc.nextInt();

        Connection connection = null;

        try {
            connection = org.velazquez.U9.CONEXIONBD.getConnection();

            String verificarCliente = "Select * from customers where customerNumber = " + customerNumber;

            PreparedStatement pst = connection.prepareStatement(verificarCliente);

            ResultSet verificacion = pst.executeQuery();

            if (verificacion.next()) {
                System.out.println("El cliente con numero '" + customerNumber + "' existe.");

                String sqlCLIENTES = "Select * from customers c join payments p on p.customerNumber = c.customerNumber where c.customerNumber = " + customerNumber;

                PreparedStatement mostrarProductos = connection.prepareStatement(sqlCLIENTES);

                ResultSet RSmostrarProductos = mostrarProductos.executeQuery();

                while (RSmostrarProductos.next()) {
                    System.out.println("Nombre del cliente: " + RSmostrarProductos.getString("customerName"));
                    System.out.println("checkNumber: " + RSmostrarProductos.getString("checkNumber"));
                    System.out.println("Fecha del pago: " + RSmostrarProductos.getString("paymentDate"));
                    System.out.println("Cantidad: " + RSmostrarProductos.getInt("amount") * RSmostrarProductos.getDouble("amount"));

                    System.out.println("------------------------------------------------------------------------------");
                }

            } else {
                System.out.println("El cliente con numero de identificacion '" + customerNumber + "' no existe.");
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
        String nombreCategoria = sc.next();

        Connection connection = null;

        try {
            connection = org.velazquez.U9.CONEXIONBD.getConnection();

            String verificarCategoria = "Select * from productlines where productLine = '" + nombreCategoria + "'";

            PreparedStatement pst = connection.prepareStatement(verificarCategoria);

            ResultSet verificacion = pst.executeQuery();

            if (verificacion.next()) {
                System.out.println("Productos de la categoria '" + nombreCategoria + "' :");

                String consultaSQL = "SELECT pl.productLine,p.productName,o.priceEach FROM productlines pl JOIN products p ON pl.productLine = p.productLine JOIN orderdetails o ON p.productCode = o.productCode WHERE pl.productLine = '" + nombreCategoria + "'";

                PreparedStatement mostrarProductos = connection.prepareStatement(consultaSQL);

                ResultSet RSmostrarProductos = mostrarProductos.executeQuery();

                while (RSmostrarProductos.next()) {
                    System.out.println("Nombre del producto: " + RSmostrarProductos.getString("productName"));
                    System.out.println("Precio de la unidad: " + RSmostrarProductos.getDouble("priceEach"));
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
