package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoDAOImpl implements EmpleadoDAO {
    private Connection con = null;

    public EmpleadoDAOImpl() {
        this.con = ConexionBD.getConnection();
    }

    @Override
    public int create(Empleado empleado) {
        int filas = 0;
        try{
            con.setAutoCommit(false);
            String sql = "INSERT INTO empleados (emp_no, apellido, oficio, dir, fecha_alt, salario, comision, dep_numero) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,empleado.getEmp_no());
            statement.setString(2, empleado.getApellido());
            statement.setString(3, empleado.getOficio());
            statement.setInt(4, empleado.getDir());
            statement.setString(5, empleado.getFecha_alt());
            statement.setFloat(6, empleado.getSalario());
            statement.setFloat(7, empleado.getComision());
            statement.setInt(8, empleado.getDep_numero());
            filas = statement.executeUpdate();
            con.commit();
            return filas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filas;
    }

    @Override
    public Empleado read(int emp_no) throws SQLException {
        String sql = "SELECT * FROM empleados WHERE emp_no = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, emp_no);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Empleado empleado = new Empleado();
            empleado.setEmp_no(rs.getInt("emp_no"));
            empleado.setApellido(rs.getString("apellido"));
            empleado.setOficio(rs.getString("oficio"));
            empleado.setDir(rs.getInt("dir"));
            empleado.setFecha_alt(rs.getString("fecha_alt"));
            empleado.setSalario(rs.getFloat("salario"));
            empleado.setComision(rs.getFloat("comision"));
            empleado.setDep_numero(rs.getInt("dep_numero"));
            return empleado;
        } else {
            return null;
        }
    }

    @Override
    public int update(int emp_no, Empleado empleado) throws SQLException {
        String sql = "UPDATE empleados SET apellido = ?, oficio = ?, dir = ?, fecha_alt = ?, salario = ?, comision = ?, dep_numero = ? WHERE emp_no = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, empleado.getApellido());
        stmt.setString(2, empleado.getOficio());
        stmt.setInt(3, empleado.getDir());
        stmt.setString(4, empleado.getFecha_alt());
        stmt.setFloat(5, empleado.getSalario());
        stmt.setFloat(6, empleado.getComision());
        stmt.setInt(7, empleado.getDep_numero());
        stmt.setInt(8, emp_no);
        return stmt.executeUpdate();
    }

    @Override
    public int delete(int emp_no) throws SQLException {
        String sql = "DELETE FROM empleados WHERE emp_no = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, emp_no);
        return stmt.executeUpdate();
    }
}
