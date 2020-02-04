package udemy.exercise.interaction;

import java.util.Scanner;

public class QuestionExercises {

    // responsible for interacting if a person
    public static void infoPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, could you tell me your name?");
        String name = scanner.nextLine();

        System.out.println("And now, could we know your year of birth?");
        int year = scanner.nextInt();


        System.out.println("Thanks " + name + ". Your age is " + (2020 - year) + " years old!");

        scanner.close();
    }
}
