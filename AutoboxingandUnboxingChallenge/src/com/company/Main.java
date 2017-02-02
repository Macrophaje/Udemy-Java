package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printChoices();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printChoices();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    printCustomers();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void printChoices() {
        System.out.println("Press: ");
        System.out.println("\t 0 - Print the list of choices");
        System.out.println("\t 1 - Create a new branch");
        System.out.println("\t 2 - Add a new customer");
        System.out.println("\t 3 - Add new transaction");
        System.out.println("\t 4 - Print a list of customers and their transactions");
        System.out.println("\t 5 - Quit program");
    }

    private static void addBranch() {
        System.out.println("Enter new branch Name:");
        String branchName = scanner.nextLine();
        if (bank.addBranch(branchName)){
            System.out.println("Branch added successfully");
        } else {
            System.out.println("Branch already exists");
        }
    }

    private static void addCustomer() {
        System.out.println("Enter new customer's name:");
        String newCustomer = scanner.nextLine();
        System.out.println("Enter initial deposit amount:");
        double deposit = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Which branch will the customer bank at?");
        String branchName = scanner.nextLine();
        if (bank.newCustomer(branchName, newCustomer, deposit)){
            System.out.println("Customer added!");
        } else {
            return;
        }
    }

    private static void addTransaction() {
        System.out.println("Which branch?");
        String branch = scanner.nextLine();
        System.out.println("Which customer?");
        String customer = scanner.nextLine();
        System.out.println("Enter new transaction amount");
        double transaction = scanner.nextDouble();
        scanner.nextLine();

        if (bank.newDeposit(branch, customer, transaction)) {
            System.out.println("Transaction successful");
        } else {
            System.out.println("Error");
        }
    }

    private static void printCustomers() {
        System.out.println("Which branch do you wish print?");
        String branch = scanner.nextLine();

        bank.printCustomers(branch);
    }
}
