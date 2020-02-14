package udemy.exercise.arrayList.allboxing;

import java.util.ArrayList;

public class Bank {

    private int bank;
    private ArrayList<Branch> arrayBranch = new ArrayList<>();

    public Bank(int bank) {
        this.bank = bank;
    }

    public void addBranch(int branch) {
        if (findBranch(branch) != -1) {
            System.out.println(branch + " already exist!");
        } else {
            arrayBranch.add(new Branch(branch));
            System.out.println(branch + " add with success!");
        }
    }

    private int findBranch(int branch) {
        for (int i = 0; i < arrayBranch.size(); i++) {
            if (arrayBranch.get(i).getBranch() == branch) {
                return i;
            }
        }
        return -1;
    }

    public void addCustomerToBranch(int branch, String name, double transaction) {
        int position = findBranch(branch);
        if (position == -1) {
            System.out.println(branch + " do not exist, please add the branch first!");
        } else {
            if (findCustomerInBranch(branch, name) != -1) {
                System.out.println(name + " already exist in this branch!");
            } else {
                Branch tempBranch;
                tempBranch = arrayBranch.get(position);
                tempBranch.addCustomer(name, transaction);
                arrayBranch.set(position, tempBranch);
                System.out.println(name + " add with success in the branch " + branch);
            }
        }
    }

    private int findCustomerInBranch(int branch, String name) {
        for (int i = 0; i < arrayBranch.size(); i++) {
            if (arrayBranch.get(i).getBranch() == branch) {
                for (int j = 0; j < arrayBranch.get(i).getArrayCustomer().size(); j++) {
                    if (arrayBranch.get(i).getArrayCustomer().get(j).getName().equals(name)) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }

    public void printCustomers(int branch) {
        int position = findBranch(branch);
        if (position == -1) {
            System.out.println(branch + " do not exist!");
        } else {
            Branch branch1 = arrayBranch.get(position);
            System.out.println("Branch " + branch1.getBranch());
            if (branch1.getArrayCustomer().size() > 0) {
                for (int i = 0; i < branch1.getArrayCustomer().size(); i++) {
                    System.out.println((i + 1) + ". " + branch1.getArrayCustomer().get(i).getName());
                }
            } else {
                System.out.println("No clients in this branch");
            }
        }
    }

    public void printBranch() {
        for (int i = 0; i < arrayBranch.size(); i++) {
            System.out.println((i + 1) + ". " + arrayBranch.get(i).getBranch());
        }
    }


    public boolean addTransaction(int branch, String name, double transaction) {
        int positionBranch = findBranch(branch);
        int positionCustomer = findCustomerInBranch(branch, name);
        if (positionBranch == -1) {
            System.out.println(branch + " do not exist, please add the branch first!");
            return false;
        } else {
            if (positionCustomer == -1) {
                System.out.println(name + " do not exist in this branch, please add the customer first!");
                return false;
            } else {
                Branch tempBranch;
                tempBranch = arrayBranch.get(positionBranch);
                tempBranch.addTransactionToCustomer(positionCustomer, transaction);
                arrayBranch.set(positionBranch, tempBranch);
                return true;
            }
        }
    }

    public void printTransactionsOfClient(int branch, String name) {
        int positionBranch = findBranch(branch);
        int positionCustomer = findCustomerInBranch(branch, name);
        if (positionBranch == -1) {
            System.out.println(branch + " do not exist, please add the branch first!");
        } else {
            if (positionCustomer == -1) {
                System.out.println(name + " do not exist in this branch, please add the customer first!");
            } else {
                Branch tempBranch;
                tempBranch = arrayBranch.get(positionBranch);
                tempBranch.printTransactionOfCustomer(positionCustomer);
            }
        }
    }
}