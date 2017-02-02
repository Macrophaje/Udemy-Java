package com.duncan;

/**
 * Created by duncan.macleod on 5/5/16.
 */
public class BankAccount {

    private int accountnumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(12345, 0.0, "defaul name", "default email", "default phone number");
        System.out.println("Empty contructor called");
    }

    public BankAccount(int accountnumber, double balance, String customerName,
                       String email, String phoneNumber){
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountnumber(int accountnumber){
        this.accountnumber = accountnumber;
    }
    public int getAccountnumber(){
        return accountnumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double deposit){
        if(deposit <= 0){
            System.out.println("Invalid Ammount : $" + deposit);
        } else {
            this.balance += deposit;
            System.out.println("New Balance is $" + this.balance);
        }
    }

    public void withdrawFunds(double withdrawal){
        if(this.balance - withdrawal < 0){
            System.out.println("Insufficient Funds to withdraw $" + withdrawal);
        } else {
            this.balance -= withdrawal;
            System.out.println("New Balance is $" + this.balance);
        }
    }
}
