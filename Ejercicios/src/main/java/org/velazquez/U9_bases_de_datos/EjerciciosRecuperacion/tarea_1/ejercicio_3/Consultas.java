package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_3;

import org.velazquez.U9_bases_de_datos.tarea_2.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public static void main(String[] args) {
        MostrarOficinas();
    }


    public static List<Office> MostrarOficinas(){
        List<Office> listaOficinas = new ArrayList<>();
        Connection con = null;
        try {
            con = ConexionBD.getConnection();
            String sql = "select * from offices";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String officeCode = rs.getString("officeCode");
                String city = rs.getString("city");
                String phone = rs.getString("phone");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine1");
                String state = rs.getString("state");
                String country = rs.getString("country");
                String postalCode = rs.getString("postalCode");
                String territory = rs.getString("territory");
                Office office = new Office(officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory);
                listaOficinas.add(office);
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
        for (Office office : listaOficinas){
            System.out.println(office);
            System.out.println("-------------------------");
        }
        return listaOficinas;
    }
}
