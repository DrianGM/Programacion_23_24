package org.velazquez.U9_bases_de_datos.Entregable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEXIONBD {
    private static Connection con = null;

    public static Connection getConnection() {

        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX";
                String pwd = "XXXXX";
                String usr = "root";
                con = DriverManager.getConnection(url, usr, pwd);
                System.out.println("Conexion establecida.");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        return con;
    }

    public static void close() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                con = null;
                System.out.println("Conexion cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
