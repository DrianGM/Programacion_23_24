package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_2;

import java.util.ArrayList;
import java.util.List;

public class Transacciones {
    public static void main(String[] args) {
        Office office = new Office("8","Seville","+34 666 87 15 94","5 Calle Manzana","4A","Andalucia","Spain","41933","Europe");
        Employee employee1 = new Employee(2001,"Marshton","John","x500","jmarshton@classicmodels.com",office.getOfficeCode(),1002,"Sales Rep");
        Employee employee2 = new Employee(2002,"Morgan","Arthur","x1000","amorgan@classicmodels.com","90",1002,"Sales Rep");
       List<Employee> empleados = new ArrayList<>();
        empleados.add(employee1);
        empleados.add(employee2);
        OfficeModel.insertarOficinas(office,empleados);
        Customer customer = new Customer(500,"El Pepe","Haaland","Erling","+30 654 72 98 90","CheChe 12", "15B","Manchester","England","1000B","UK",employee1.getEmployeeNumber(),110000);
        CustomerModel.insertarClientes(customer,employee1);
        Order order = new Order(11000,"2005-02-10","2005-02-14","2005-02-15","Shipped","Piola",customer.getCustomerNumber());
        OrderDetails od = new OrderDetails(order.getOrderNumber(),"S10_1678",400,300,20);
        OrderModel.insertarPedidos(order,od);
    }
}