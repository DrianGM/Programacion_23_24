package org.velazquez.U9_bases_de_datos.U9_Examen_Recuperacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Transacciones {

    public static void Transacciones() {
        Connection con = ConexionBD.getConnection();

        Office off = new Office("8", "Sevilla", "+1 666 66 66 64", "Calle Manzana", "Piso 3", "Andalucia", "Spain", "41010", "Spain");
        Employee emp1 = new Employee(2000, "Marshton", "John", "x6000", "jmarshton@classicmodels.com", "1000", 1102, "Sales Rep");
        Employee emp2 = new Employee(2001, "Morgan", "Arthur", "x3000", "amorgan@classicmodels.com", "1000", 1102, "Sales Rep");

        Customer cus = new Customer(500, "Kings League", "Garcia", "Juan", "+34 955 555 555", "Calle Pera", "Edificio 1", "Sevilla", "Andalucia", "41001", "España", emp1.getEmployeeNumber(), 21000.00);

        Product pr1 = new Product("S101_1111", "La Kawasaki", "Motorcycles", "1:20", "Motos Juan", "Una moto todoterreno de colores.", 500, 500, 80);
        Product pr2 = new Product("S101_1222", "Motito Chikitita", "Motorcycles", "1:30", "Juan Alberto Motors", "Una moto todoterreno chiquita.", 100, 250, 30);
        Order or = new Order(10501, "2024-06-07", "2024-06-10", "2024-06-09", "Shipped", "Pedido entregado.", cus.getCustomerNumber());
        OrderDetails od1 = new OrderDetails(or.getOrderNumber(), pr1.getProductCode(), 1, 500, 3);
        OrderDetails od2 = new OrderDetails(or.getOrderNumber(), pr2.getProductCode(), 1, 250, 3);

        List<Employee> empleados = new ArrayList<>();
        List<OrderDetails> orderDetails = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);
        orderDetails.add(od1);
        orderDetails.add(od2);

        try {
            con.setAutoCommit(false);

            OfficeModel.insertarOficina(off, empleados);
            System.out.println("Oficina y empleados insertados.");

            CustomerModel.insertarCustomer(cus, emp1);
            System.out.println("Cliente insertado.");

            ProductModel.insertarProduct(pr1);
            ProductModel.insertarProduct(pr2);
            System.out.println("Productos insertados.");

            OrderModel.insertarPedido(or, orderDetails);
            System.out.println("Pedido y los detalles insertados.");

            con.commit();
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback();
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error en el rollback.");
                for (StackTraceElement element : ex.getStackTrace()) {
                    System.out.println(element);
                }
            }
        }
    }
}
