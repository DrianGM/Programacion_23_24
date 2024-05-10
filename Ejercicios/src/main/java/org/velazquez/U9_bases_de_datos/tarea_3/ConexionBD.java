package org.velazquez.U9_bases_de_datos.tarea_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private Connection con=null;

    public Connection getConnection(){
        try{
            if( con == null ){
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");
                System.out.println("Connection succesful");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }

    public void close() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
