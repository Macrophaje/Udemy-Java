package com.company;

import java.util.ArrayList;

/**
 * Created by duncan.macleod on 9/14/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transactions;
    }

    public void deposit(double deposit){
        transactions.add(deposit);
    }
}
