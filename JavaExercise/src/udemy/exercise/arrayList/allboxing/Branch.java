package udemy.exercise.arrayList.allboxing;

import java.util.ArrayList;

public class Branch {

    private int branch;
    private ArrayList<Customer> arrayCustomer = new ArrayList<>();

    public Branch(int branch) {
        this.branch = branch;
    }

    public Branch(int branch, String name, double initTransaction) {
        this.branch = branch;
        arrayCustomer.add(new Customer(name, initTransaction));
        System.out.println("Client: " + name + " add with success at the branch: " + branch);
    }

    public Branch() {
    }

    public int getBranch() {
        return branch;
    }

    public ArrayList<Customer> getArrayCustomer() {
        return arrayCustomer;
    }

    public boolean addCustomer(String name, double iTransaction) {
        arrayCustomer.add(new Customer(name, iTransaction));
        return true;
    }

    public void addTransactionToCustomer(int position, double transaction) {
        Customer customer = arrayCustomer.get(position);
        customer.addTransaction(transaction);
        arrayCustomer.set(position, customer);
        System.out.println("Transaction added with success!");
    }

    public void printTransactionOfCustomer(int position) {
        Customer customer = arrayCustomer.get(position);
        System.out.println("Customer: " + customer.getName());
        if (customer.getTransactions().size() > 0) {
            for (int i = 0; i < customer.getTransactions().size(); i++) {
                System.out.println((i+1) + ". " + customer.getTransactions().get(i));
            }
        } else {
            System.out.println("No transactions for this client in this branch");
        }
    }
}