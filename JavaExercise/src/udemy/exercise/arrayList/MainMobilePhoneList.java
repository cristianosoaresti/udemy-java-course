package udemy.exercise.arrayList;

import java.util.Scanner;

public class MainMobilePhoneList {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhoneList contactList = new MobilePhoneList();

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
                    contactList.getContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
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
        System.out.println("\t 1 - To print the contact list");
        System.out.println("\t 2 - To add a contact in the list");
        System.out.println("\t 3 - To modify a contact");
        System.out.println("\t 4 - To remove a contact");
        System.out.println("\t 5 - To search for a contact");
        System.out.println("\t 6 - To exit");
    }

    public static void addContact(){
        System.out.print("Please inform the name of your contact: ");
        String name = scanner.nextLine();
        System.out.print("Now, inform the telephone number: ");
        long phone = scanner.nextLong();
        scanner.nextLine();
        boolean returnOk = contactList.addNewContact(name, phone);
        if (returnOk){
            System.out.println("Successfully added!");
        }else{
            System.out.println("Something went wrong, please try again!");
        }
    }

    public static void updateContact(){
        System.out.print("Please inform the name of your contact that you want to update: ");
        String oldName = scanner.nextLine();
        System.out.print("Now, inform the new name of your contact: ");
        String newName = scanner.nextLine();
        System.out.print("Now, inform the new/old telephone number: ");
        long phone = scanner.nextLong();
        scanner.nextLine();
        boolean returnOk = contactList.updateContact(oldName, newName, phone);
        if (returnOk){
            System.out.println("Successfully updated!");
        }else{
            System.out.println("The contact informed was not found!");
        }
    }

    public static void removeContact(){
        System.out.print("Please inform the name of your contact that you want to delete: ");
        String name = scanner.nextLine();
        boolean returnOk = contactList.removeContact(name);
        if (returnOk){
            System.out.println("Successfully deleted!");
        }else{
            System.out.println("The contact informed was not found!");
        }
    }

    public static void searchForContact(){
        System.out.print("Please inform the name of your contact: ");
        String name = scanner.nextLine();
        boolean returnOk = contactList.searchForContact(name);
        if (returnOk){
            System.out.println("We found " + name + " in the contact list!");
        }else{
            System.out.println("The contact informed was not found!");
        }
    }
}