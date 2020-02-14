package udemy.exercise.arrayList.allboxing;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank csBank = new Bank(7);

    public static void main(String[] args) {
        System.out.println("Hello to your CS-Bank: " +
                "\n What do you want to do today?");

        boolean quit = false;
        int choice = 1;

        printMenu();

        while (!quit) {
            System.out.println("Press the number of your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    createBranch();
                    break;
                case 3:
                    createCustomer();
                    break;
                case 4:
                    addTransactionToCustomer();
                    break;
                case 5:
                    printAllBranches();
                    break;
                case 6:
                    printAllCustomersOfBranch();
                    break;
                case 7:
                    printTransactionsOfCustomer();
                    break;
                case 9:
                    System.out.println("Bye");
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n Menu ");
        System.out.println("\t 1 - To print de menu");
        System.out.println("\t 2 - To create a new branch");
        System.out.println("\t 3 - To create/add a customer in a specific branch");
        System.out.println("\t 4 - To add a transaction to a specific customer");
        System.out.println("\t 5 - To print all the branches in CS-Bank");
        System.out.println("\t 6 - To print all customers in a specific branch");
        System.out.println("\t 7 - To print all the transactions of a specific customer");
        System.out.println("\t 9 - To exit");
    }

    public static void createBranch() {
        System.out.print("Please inform the number of the new branch: ");
        csBank.addBranch(scanner.nextInt());
    }

    public static void createCustomer() {
        System.out.print("Please inform the branch: ");
        int branch = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Now the name of the client: ");
        String name = scanner.nextLine();
        System.out.println("Now one transactions to initialize this customer: ");
        double transaction = scanner.nextDouble();
        scanner.nextLine();
        csBank.addCustomerToBranch(branch, name, transaction);
    }

    public static void addTransactionToCustomer() {
        System.out.print("Please inform the branch: ");
        int branch = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Now the name of the client: ");
        String name = scanner.nextLine();
        System.out.println("Now one transactions: ");
        double transaction = scanner.nextDouble();
        scanner.nextLine();
        csBank.addTransaction(branch, name, transaction);
    }

    public static void printAllBranches() {
        System.out.println("Branches on CS-Bank: ");
        csBank.printBranch();
    }

    public static void printAllCustomersOfBranch() {
        System.out.println("Please inform the branch: ");
        int branch = scanner.nextInt();
        csBank.printCustomers(branch);
    }

    public static void printTransactionsOfCustomer() {
        System.out.print("Please inform the branch: ");
        int branch = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Now the name of the client: ");
        String name = scanner.nextLine();
        csBank.printTransactionsOfClient(branch, name);
    }
}