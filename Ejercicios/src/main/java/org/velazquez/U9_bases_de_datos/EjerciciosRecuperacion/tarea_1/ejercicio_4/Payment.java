package org.velazquez.U9_bases_de_datos.EjerciciosRecuperacion.tarea_1.ejercicio_4;

public class Payment {
    private int CustomerNumber;
    private String checkNumber;
    private String paymentDate;
    private double amount;

    public Payment(int customerNumber, String checkNumber, String paymentDate, double amount) {
        CustomerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        CustomerNumber = customerNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "CustomerNumber=" + CustomerNumber +
                ", checkNumber='" + checkNumber + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", amount=" + amount +
                '}';
    }
}
