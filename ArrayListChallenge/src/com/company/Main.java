package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("3038951640");

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        startPhone();
        printInstructions();
        while (!quit){
            System.out.println("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
            }
        }

    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print options");
        System.out.println("\t 1 - To print all contacts");
        System.out.println("\t 2 - To add a new Contact");
        System.out.println("\t 3 - To edit an existing contact");
        System.out.println("\t 4 - To delete a contact");
        System.out.println("\t 5 - To search for a contact");
        System.out.println("\t 6 - To shut down phone");
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void addContact() {
        System.out.println("Enter contact name");
        String contactName = scanner.nextLine();
        System.out.println("Enter contact number");
        String contactNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(contactName, contactNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact created. Name = " + contactName + ", number = " + contactNumber);
        } else {
            System.out.println("Contact " + contactName +  " already exists");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    private static void deleteContact() {
        System.out.println("Enter contact name to delete:");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Sucess");
        } else {
            System.out.println("Error");
        }
    }

    private static void findContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Contact:" + existingContact.getName() + ", Number: " + existingContact.getPhoneNumber());
    }
}
