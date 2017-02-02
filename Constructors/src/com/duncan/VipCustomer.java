package com.duncan;

/**
 * Created by duncan.macleod on 5/5/16.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Defaul Name", 1000.00, "defaulemail@email.com");
        System.out.println("Defaul Account");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "defaulemail@email.com");
        System.out.println("No email provided");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Account Details: " + this.name + " " + this.creditLimit
                + " " + this.email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
