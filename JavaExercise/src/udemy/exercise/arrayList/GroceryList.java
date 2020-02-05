package udemy.exercise.arrayList;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGrocery(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGrocery(String currentItem, String newItem) {
        int position = findItemInt(currentItem);
        if (position >= 0) {
            modifyGrocery(position, newItem);
        }
    }

    private void modifyGrocery(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item" + (position + 1) + "has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItemInt(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int item) {
        groceryList.remove(item);
    }

    public String findItemString(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

    private int findItemInt(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}