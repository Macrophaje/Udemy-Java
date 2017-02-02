package com.company;

import java.util.ArrayList;

/**
 * Created by duncan.macleod on 9/14/16.
 */
public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean addNewCustomer(String name, double transaction){
        if (findCustomer(name)) {
            System.out.println("Customer already exists");
            return false;
        }
        Customer customer = new Customer(name, transaction);
        this.customers.add(customer);
        return true;
    }

    private boolean findCustomer(String name) {
        return (getCustomer(name) != null);
    }

    private Customer getCustomer (String name) {
        for (int i=0; i<this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)){
                return customer;
            }

        }
        System.out.println("Customer does not exist.");
        return null;
    }

    public boolean addTransaction (String name, double transaction) {
        if (findCustomer(name)){
            getCustomer(name).deposit(transaction);
            return true;
        }
        return false;
    }

    public void printCustomers () {
        if (this.customers.size()<=0){
            System.out.println("No customers at this branch");
            return;
        }
        System.out.println("Customers: ");
        for (int i=0; i<this.customers.size(); i++) {
            double total = 0;
            System.out.print((i+1) + ". " + this.customers.get(i).getName() + " ---> ");
            for (int y=0; y<this.customers.get(i).getTransaction().size(); y++) {
                double money = this.customers.get(i).getTransaction().get(y).doubleValue();
                total += money;
                System.out.print((y > 0 ? ", " : "") + money);
            }
            System.out.println("\nTotal: " + total);
        }
    }
}
