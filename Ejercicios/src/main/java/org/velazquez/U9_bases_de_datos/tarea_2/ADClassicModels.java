package org.velazquez.U9_bases_de_datos.tarea_2;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    public ADClassicModels(){

    }

    public List getEmpleados(){
        List<Employee> empleados = new ArrayList<>();

        try {
            Connection con = ConexionBD.getConnection();
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
            Connection con = ConexionBD.getConnection();
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
}
