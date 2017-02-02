package com.duncan;

public class Main {

    public static void main(String[] args) {
//        BankAccount myBankAccount = new BankAccount(); //(246813579, 1000.00, "Duncan"
////        , "duncan@email.com", "321-654-0987");
//        System.out.println(myBankAccount.getAccountnumber());
//        System.out.println(myBankAccount.getCustomerName());
////        myBankAccount.setAccountnumber(24681359);
////        System.out.println("Bank Account number is " + myBankAccount.getAccountnumber());
////
////        myBankAccount.setBalance(1000.00);
////        System.out.println("Starting Balance is $" + myBankAccount.getBalance());
////
////        myBankAccount.setCustomerName("Duncan");
////        System.out.println("Account owned by " + myBankAccount.getCustomerName());
////
////        myBankAccount.setEmail("duncan@email.com");
////        System.out.println("Customer email: " + myBankAccount.getEmail());
////
////        myBankAccount.setPhoneNumber("321-654-0987");
////        System.out.println("Customer phone number: " + myBankAccount.getPhoneNumber());
//
//        myBankAccount.depositFunds(-5);
//        myBankAccount.depositFunds(1000);
//        myBankAccount.withdrawFunds(3000);
//        myBankAccount.withdrawFunds(1000);
//
//        BankAccount newAccout = new BankAccount("Bob", "bob@email.com", "123-456-7890");
//        System.out.println(newAccout.getCustomerName() + newAccout.getEmail());

        VipCustomer noInfo = new VipCustomer();
        VipCustomer noEmail = new VipCustomer("John", 2000);
        VipCustomer goodBoy = new VipCustomer("Marc", 10000, "marc@email.com");
    }
}
