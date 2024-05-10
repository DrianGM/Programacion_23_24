package org.velazquez.U9_bases_de_datos.tarea_3;


import org.velazquez.U9_bases_de_datos.tarea_2.ConexionBD;
import org.velazquez.U9_bases_de_datos.tarea_2.Employee;
import org.velazquez.U9_bases_de_datos.tarea_2.Office;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {
    private Connection con;

    public ADClassicModels(){
        ConexionBD connec = new ConexionBD();
        con=connec.getConnection();
    }

    public List getEmpleados(){
        List<Employee> empleados = new ArrayList<>();

        try {
            Statement stmt;
            ResultSet rs;
            stmt = con.createStatement();
            stmt.setQueryTimeout(30);
            rs = stmt.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmployeeNumber(rs.getInt("employeeNumber"));
                emp.setLastName(rs.getString("lastName"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setExtension(rs.getString("extension"));
                emp.setEmail(rs.getString("email"));
                emp.setOfficeCode(rs.getString("officeCode"));
                emp.setReportsTo(rs.getInt("reportsTo"));
                emp.setJobTitle(rs.getString("jobTitle"));
                empleados.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleados;
    }

    public List getOffices(){
        List<Office> offices = new ArrayList<>();

        try {
            Statement stmt;
            ResultSet rs;
            stmt = con.createStatement();
            stmt.setQueryTimeout(30);
            rs = stmt.executeQuery("SELECT * FROM offices");
            while (rs.next()) {
                Office office = new Office();
                office.setOfficeCode(rs.getString("officeCode"));
                office.setCity(rs.getString("city"));
                office.setPhone(rs.getString("phone"));
                office.setAddressLine1(rs.getString("addressLine1"));
                office.setAddressLine2(rs.getString("addressLine2"));
                office.setState(rs.getString("state"));
                office.setCountry(rs.getString("country"));
                office.setPostalCode(rs.getString("postalCode"));
                office.setTerritory(rs.getString("territory"));
                offices.add(office);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return offices;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
