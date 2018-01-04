package com.company;

public class Main {

    public static void main(String[] args) {
        Account duncansAccount = new Account("Duncan");

        duncansAccount.deposit(1000);
        duncansAccount.withdraw(500);
        duncansAccount.withdraw(-200);
        duncansAccount.deposit(-20);
        duncansAccount.calculateBalance();
        //duncansAccount.balance = 5000;


        System.out.println("Balance on account is " + duncansAccount.getBalance());
       // duncansAccount.transactions.add(2500);
        duncansAccount.calculateBalance();
    }
}
