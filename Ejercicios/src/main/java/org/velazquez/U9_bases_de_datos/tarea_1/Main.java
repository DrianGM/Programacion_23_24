package org.velazquez.U9_bases_de_datos.tarea_1;

//Utilizando la base de datos que se proporciona como ejemplo, realizar las siguientes actividades:
//Configura la conexión para acceder a la base de datos
//Realiza las siguientes consultas y muéstralas por pantalla
//Listado de los "customers" que no tienen "state" (el campo "state" es nulo).
//Listado de los "payments" cuyo "amount" sea mayor de 30.000.
//Listado de los "employees" que dan cuenta (reportsTo) al empleado con Id = 1143


import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db"); // crear una conexión a base de datos
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); // establecer un tiempo máximo de respuesta a 30 segundos.
            ResultSet rs = statement.executeQuery("SELECT * FROM customers where state IS NULL");
            while (rs.next()) { // leer el ResultSet
                System.out.println("name = " + rs.getString("customerName"));
                System.out.println("id = " + rs.getInt("customerNumber"));
            }
            System.out.println("-----------------------------");
            rs = statement.executeQuery("SELECT * from payments where amount>30000");
            while (rs.next()) { // leer el ResultSet
                System.out.println("name = " + rs.getString("customerNumber"));
                System.out.println("id = " + rs.getInt("amount"));
            }
            System.out.println("-----------------------------");
            rs = statement.executeQuery("SELECT * from employees where reportsTo = 1143");
            while (rs.next()) { // leer el ResultSet
                System.out.println("name = " + rs.getString("firstName"));
                System.out.println("name = " + rs.getString("lastName"));
                System.out.println("id = " + rs.getInt("employeeNumber"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage()); // Si el mensaje de error es "out of memory", seguramente es que no se encuentra el fichero
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage()); // error al cerrar la conexión
            }
        }
    }
}