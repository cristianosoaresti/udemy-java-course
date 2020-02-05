package udemy.exercise.arrayList;

import java.util.Scanner;

public class MainGroceryList {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Please select one of the options below: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print de menu");
        System.out.println("\t 1 - To print the grocery list");
        System.out.println("\t 2 - To add a item in the grocery list");
        System.out.println("\t 3 - To modify the grocery list");
        System.out.println("\t 4 - To remove a item from the grocery list");
        System.out.println("\t 5 - To search in the grocery list");
        System.out.println("\t 6 - To exit");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGrocery(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Please enter the item from the grocery list: ");
        String currentItem = scanner.nextLine();
        System.out.print("Please inform the new item do replace the choose one: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGrocery(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Please enter the item from the grocery list: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Item for search for :");
        String searchFor = scanner.nextLine();
        if (groceryList.findItemString(searchFor) != null) {
            System.out.println("Found " + searchFor + " in the grocery list");
        } else {
            System.out.println(searchFor + " was not found in the grocery list");
        }
    }
}