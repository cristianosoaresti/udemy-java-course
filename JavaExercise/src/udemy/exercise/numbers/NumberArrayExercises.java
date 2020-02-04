package udemy.exercise.numbers;

import java.util.Scanner;

// This class is a general one to work if number and array methods to test my knowledge

public class NumberArrayExercises {

    private static Scanner scanner = new Scanner(System.in);

    //responsible for reading numbers of the console until the "numberOfTime" given.
    public int[] readIntegers(int numberOfTime) {
        int[] arrayInt = new int[numberOfTime];

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < numberOfTime; i++) {
            try {
                int aux = scanner.nextInt();
                scanner.nextLine();
                arrayInt[i] = aux;
            } catch (Exception e) {
                i = 99999999;
                arrayInt[0] = 99999999;
                System.out.println("Invalid information, try again!");
            }
        }
        return arrayInt;
    }

    //responsible for finding the lowest number on an array given
    public int findMin(int[] array) {
        int minValue = array[0];

        if (array.length == 2) {
            if (array[0] > array[1]) {
                minValue = array[1];
            }
        } else {
            for (int i = 1; i < array.length; i++) {
                if (minValue > array[i]) {
                    minValue = array[i];
                }
            }
        }
        return minValue;
    }

    // responsible for reversing an array given
    public void reverseArray(int[] array) {

        System.out.println("Normal array");
        printContext(array);

        int position = 0;
        int[] arrayAux = array.clone();

        for (int i = arrayAux.length - 1; i >= 0; i--) {
            array[position] = arrayAux[i];
            position++;
        }
        System.out.println("Reversed Array");
        printContext(array);
    }

    // responsible for printing out the array given.
    private void printContext(int[] array) {
        for (int value : array)
            System.out.print(value);
    }

    //responsible for checking if the given number is odd
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    //sum only the odd's number inside the range given
    public static int sumOdd(int start, int end) {

        int sum = 0;

        if (start < 1 || end < 1) {
            sum = -1;
        } else if (end < start) {
            sum = -1;
        } else {
            for (int i = start; i <= end; i++) {
                boolean result = isOdd(i);
                if (result) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    //responsible for calculating the radius area
    public static double radiusArea(double radius) {

        double areaCalculated = 0d;
        double auxPI = 3.14159d;

        if (radius < 0) {
            areaCalculated = -1.0;
        } else {
            areaCalculated = radius * radius * auxPI;
        }

        return areaCalculated;
    }

    // responsible for calculating the area
    public static double area(double x, double y) {

        double areaCalculated = 0d;

        if (x < 0 || y < 0) {
            areaCalculated = -1.0;
        } else {
            areaCalculated = x * y;
        }

        return areaCalculated;
    }

    //responsible for comparing if the numbers are equal using (max) 3 decimal after the last integer
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        double aux1 = d1 * 1000;
        double aux2 = d2 * 1000;
        int aux3 = (int) aux1;
        int aux4 = (int) aux2;

        if (aux3 == aux4) {
            return true;
        } else {
            return false;
        }
    }

    // responsible for checking if the sum of the first two numbers are equal to the third one
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int aux1 = num1 + num2;

        if (aux1 == num3) return true;
        else return false;
    }

    // responsible for checking if some of the given ages are between 13 and 19
    public static boolean hasTeen(int num1, int num2, int num3) {

        if (((num1 >= 13) && (num1 <= 19)) || ((num2 >= 13) && (num2 <= 19)) || ((num3 >= 13) && (num3 <= 19)))
            return true;
        else return false;
    }

    // responsible for checking if the given numbers are equal
    public static void printEqual(int num1, int num2, int num3) {

        if ((num1 < 0) || (num2 < 0) || (num3 < 0)) {
            System.out.println("Invalid Value");
        } else {
            if ((num1 == num2) && (num2 == num3)) {
                System.out.println("All numbers are equal");
            } else {
                if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
                    System.out.println("Neither all are equal or different");
                } else {
                    System.out.println("All numbers are different");
                }
            }
        }
    }

    // responsible for converting a number in his corresponding string
    public static void printNumberInWord(int number) {

        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}