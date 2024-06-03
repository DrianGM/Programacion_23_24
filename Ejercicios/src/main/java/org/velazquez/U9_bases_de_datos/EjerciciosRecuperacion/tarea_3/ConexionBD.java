package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con=null;

    public static Connection getConnection(){
        try{
            if( con == null ){
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3336/empresa?user=root&password=XXXXX");
                System.out.println("Conexion abierta.");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
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
            e.printStackTrace();
        }
    }

}
