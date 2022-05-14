/*
// You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions 
 */
package Section8Array.Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        Branch branchName = findBranch(name);
        if (branchName == null) {
            branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String nameBranch, String nameCustomer, double initialTansaction) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            return branch.newCustomer(nameCustomer, initialTansaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String CustomerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(CustomerName, transaction);
            
        }
        return false;

    }

    private Branch findBranch(String name) {
        String nameBranch;
        for (int i = 0; i < branches.size(); i++) {
            nameBranch = branches.get(i).getName();
            if (name.equals(nameBranch)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String nameBranch, boolean printTransaction) {
        Branch BranchName = findBranch(nameBranch);
        if (BranchName != null) {
            System.out.println("Customer details for branch " + BranchName.getName());

            ArrayList<Customer> customerDetails = BranchName.getCustomers();
            for (int j = 0; j < customerDetails.size(); j++) {
                Customer customerList = customerDetails.get(j);
                System.out.println("Customer: " + customerList.getName() + "[" + (j + 1) + "]");
                if (printTransaction) {

                    System.out.println("Transactions");
                    ArrayList<Double> transactionList = customerList.getTransactions();
                    for (int k = 0; k < transactionList.size(); k++) {
                        System.out.println("[" + (k + 1) + "] Amount " + transactionList.get(k));
                    }

                }

            }
            return true;
        }

        return false;
    }
}
