package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_4_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartamentoDAOImpl implements DepartamentoDAO {
    private Connection con = null;

    public DepartamentoDAOImpl(){
        this.con = ConexionBD.getConnection();
    }

    @Override
    public int create(Departamento departamento){
        int filas = 0;
        try{
            con.setAutoCommit(false);
            String sql = "INSERT INTO departamentos (dep_no, dnombre, loc) VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,departamento.getDep_no());
            statement.setString(2,departamento.getDnombre());
            statement.setString(3, departamento.getLoc());
            filas = statement.executeUpdate();
            con.commit();
            return filas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filas;
    }

    @Override
    public Departamento read(int dep_no) throws SQLException {
        String sql = "SELECT * FROM departamentos WHERE dep_no = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1,dep_no);
        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            Departamento departamento = new Departamento();
            departamento.setDep_no(rs.getInt("dep_no"));
            departamento.setDnombre(rs.getString("dnombre"));
            departamento.setLoc(rs.getString("loc"));
            return departamento;
        } else {
            return null;
        }
    }

    @Override
    public int update(int dep_no, Departamento departamento) throws SQLException {
        String sql = "UPDATE departamentos SET dnombre = ?, loc = ? WHERE dep_no = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,departamento.getDnombre());
        statement.setString(2,departamento.getLoc());
        statement.setInt(3,departamento.getDep_no());
        return statement.executeUpdate();
    }

    @Override
    public int delete(int dep_no) throws SQLException {
        String sql = "DELETE FROM departamentos WHERE dep_no = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1,dep_no);
        return statement.executeUpdate();
    }




}
