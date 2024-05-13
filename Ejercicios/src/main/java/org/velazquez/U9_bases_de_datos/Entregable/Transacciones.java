package org.velazquez.U9_bases_de_datos.Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transacciones {
    public static void main(String[] args) {
        insertarClientePagos();
    }

    public static void insertarClientePagos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el Numero del empleado: ");
        int employeeNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el lastName:");
        String lastName = sc.nextLine();
        System.out.println("Ingresa el firstName:");
        String fistName = sc.nextLine();
        System.out.println("Ingresa el extension:");
        String extension = sc.nextLine();
        System.out.println("Ingresa el email:");
        String email = sc.nextLine();
        System.out.println("Ingresa el officeCode:");
        String officeCode = sc.nextLine();
        System.out.println("Ingresa el reportsTo:");
        int reportsTo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el jobTitle:");
        String jobTitle = sc.nextLine();

        Connection con = org.velazquez.U9_bases_de_datos.Entregable.CONEXIONBD.getConnection();

        try {
            con.setAutoCommit(false);

            String sql = "INSERT INTO offices VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setInt(1, employeeNumber);
            sentencia.setString(2, lastName);
            sentencia.setString(3, fistName);
            sentencia.setString(4, extension);
            sentencia.setString(5, email);
            sentencia.setString(6, officeCode);
            sentencia.setInt(7, reportsTo);
            sentencia.setString(8, jobTitle);


        } catch (SQLException e) {
            System.err.println(e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.getMessage();
            }
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void oficinaYempleados() {

    }
}