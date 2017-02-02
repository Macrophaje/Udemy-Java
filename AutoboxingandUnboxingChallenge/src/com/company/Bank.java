package com.company;

import java.util.ArrayList;

/**
 * Created by duncan.macleod on 9/14/16.
 */
public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public boolean addBranch (String branchName) {
        if (getBranch(branchName) != null) {
            return false;
        }
        Branch branch = new Branch(branchName);
        this.branches.add(branch);
        return true;
    }

    private Branch getBranch(String name) {
        for (int i=0; i<this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(name)){
                return branch;
            }
        }
        System.out.println("Branch does not exist");
        return null;
    }

    public boolean newCustomer (String branchName, String customerName, double deposit) {
        Branch branch = getBranch(branchName);
        if (branch != null) {
             return branch.addNewCustomer(customerName, deposit);
        }
        return false;
    }

    public boolean newDeposit (String branchName, String customerName, double deposit) {
        Branch branch = getBranch(branchName);
        if (branch != null) {
            return branch.addTransaction(customerName, deposit);
        }
        return false;
    }

    public void printCustomers (String branchName) {
        Branch branch = getBranch(branchName);
        if (branch != null) {
            branch.printCustomers();
        }
    }
}
