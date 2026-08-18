package com.oop14;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;

    public void calcPrice(int price) {
        bonusPoint++;
    }

    public String showCustomerInfo() {
        return "고객 정보";
    }
}


class GoldCustomer extends Customer{

}


class VIPCustomer extends Customer {
    private int agentId;
    private double salesRatio;

    public int getAgentId() {
        return agentId;
    }
}
