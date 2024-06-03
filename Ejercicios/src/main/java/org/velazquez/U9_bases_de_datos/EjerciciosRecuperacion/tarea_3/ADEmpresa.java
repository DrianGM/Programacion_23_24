package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_3;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ADEmpresa {

    public List<Empleado> getEmpleados(){
        List<Empleado> listaEmpleados = new ArrayList<>();
        Connection con = null;
        try {
            con = ConexionBD.getConnection();
            String sql = "select * from empleados";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int emp_no = rs.getInt("emp_no");
                String apellido = rs.getString("apellido");
                String oficio = rs.getString("oficio");
                int dir = rs.getInt("dir");
                String fecha_alt = rs.getString("fecha_alt");
                float salario = rs.getFloat("salario");
                float comision = rs.getFloat("comision");
                int dep_numero = rs.getInt("dep_numero");
                Empleado empleado = new Empleado(emp_no,apellido,oficio,dir,fecha_alt,salario,comision,dep_numero);
                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }

    public List<Departamento> getDepartamentos(){
        List<Departamento> listaDepartamentos = new ArrayList<>();
        Connection con = null;
        try {
            con = ConexionBD.getConnection();
            String sql = "select * from departamentos";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int dep_no = rs.getInt("dep_no");
                String d_nombre = rs.getString("dnombre");
                String loc = rs.getString("loc");
                Departamento departamento = new Departamento(dep_no,d_nombre,loc);
                listaDepartamentos.add(departamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaDepartamentos;
    }
}
