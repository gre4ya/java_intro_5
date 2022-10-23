package projects;

import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {

        System.out.println("-------------------Task-1---------------------\n");

        int number1, number2, number3;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        System.out.println("The product of the numbers entered is = " + number1 * number2 * number3);


        System.out.println("\n-------------------Task-2---------------------\n");

        input.nextLine();

        String firstName, lastName;
        System.out.println("What is your name?");
        firstName = input.nextLine();
        System.out.println("What is your last name?");
        lastName = input.nextLine();
        System.out.println("What is your year of birth?");
        int birthYear = input.nextInt();

        System.out.println(firstName + " " + lastName + "'s age is = " + (2022 - birthYear) + ".");


        System.out.println("\n-------------------Task-3---------------------\n");

        input.nextLine();

        System.out.println("What is your full name?");
        String fullName = input.nextLine();
        System.out.println("What is your weight?");
        int weight = input.nextInt();
        input.nextLine();

        System.out.println(fullName + "'s weight is = " + weight * 2.205 + " lbs.");


        System.out.println("\n-------------------Task-4---------------------\n");

        String fullName1, fullName2, fullName3;
        int age1, age2, age3;

        System.out.println("What is your full name?");
        fullName1 = input.nextLine();
        System.out.println("What is your age?");
        age1 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        fullName2 = input.nextLine();
        System.out.println("What is your age?");
        age2 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name?");
        fullName3 = input.nextLine();
        System.out.println("What is your age?");
        age3 = input.nextInt();
        input.nextLine();

        System.out.println(fullName1 + "'s age is " + age1 + ".\n" +
                fullName2 + "'s age is " + age2 + ".\n" +
                fullName3 + "'s age is " + age3 + ".\n" +
                "The average age is " + (age1 + age2 + age3) / 3 + ".\n" +
                "The eldest age is " + Math.max(Math.max(age1, age2), age3) + ".\n" +
                "The youngest age is " + Math.min(Math.min(age1, age2), age3) + ".");

    }
}
