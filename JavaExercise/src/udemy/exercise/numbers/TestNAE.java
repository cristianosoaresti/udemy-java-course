package udemy.exercise.numbers;

import java.util.Scanner;

public class TestNAE {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        NumberArrayExercises an = new NumberArrayExercises();

        //int[] arrayTest = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        //an.reverseArray(arrayTest);

        int arraySize;

        System.out.println("Please, let me know the size of your array ");
        try {
            arraySize = scanner.nextInt();
            scanner.nextLine();

            if (arraySize > 0) {
                int[] arrayFiled = an.readIntegers(arraySize);
                if
                (arrayFiled[0] != 99999999) {
                    int minNumber = an.findMin(arrayFiled);
                    System.out.println("Minimum value of your array: " + minNumber);
                }
            } else {
                System.out.println("The number must be great than zeros!");
            }
        } catch
        (Exception e) {
            System.out.println("Please, you must inform a number!");
        }
    }
}