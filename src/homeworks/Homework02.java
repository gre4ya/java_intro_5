package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {


        System.out.println("\n---------------Task-1------------------\n");

        int num1, num2, num3, num4, num5;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = input.nextInt();

        System.out.println("Please enter second number: ");
        num2 = input.nextInt();

        System.out.println("The number 1 entered by user is = " + num1 +
                "\nThe number 2 entered by user is = " + num2 +
                "\nThe sum of number 1 and 2 entered by user is = " + (num1 + num2));

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-2------------------\n");

        System.out.println("Please enter first number: ");
        num1 = input.nextInt();

        System.out.println("Please enter second number: ");
        num2 = input.nextInt();

        System.out.println("The product of the given 2 numbers is: " + num1 * num2);

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-3------------------\n");

        double number1, number2;


        System.out.println("Please enter first number: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();

        System.out.println("The sum of the given numbers is = " + (number1 + number2) +
                "\nThe product of the given numbers is = " + number1 * number2 +
                "\nThe subtraction of the given numbers is = " + (number1 - number2) +
                "\nThe division of the given numbers is = " + number1 / number2 +
                "\nThe remainder of the given numbers is = " + number1 % number2);

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-4------------------\n");


        System.out.println("1. \t\t" + (-10 + 7*5) +
                         "\n2. \t\t" + ((72+24)%24) +
                         "\n3. \t\t" + (10 + -3*9/9) +
                         "\n4. \t\t" + (5 + 18/3*3-(6%3)));

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-5------------------\n");


        System.out.println("Please enter first number: ");
        num1 = input.nextInt();

        System.out.println("Please enter second number: ");
        num2 = input.nextInt();

        System.out.println("The average of the given numbers is: " + (num1 + num2)/2);

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-6------------------\n");


        System.out.println("Please enter first number: ");
        num1 = input.nextInt();

        System.out.println("Please enter second number: ");
        num2 = input.nextInt();

        System.out.println("Please enter third number: ");
        num3 = input.nextInt();

        System.out.println("Please enter fourth number: ");
        num4 = input.nextInt();

        System.out.println("Please enter fifth number: ");
        num5 = input.nextInt();

        System.out.println("The average of the given numbers is: " + ((num1 + num2 + num3 + num4 + num5)/5));

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-7------------------\n");


        System.out.println("Please enter first number: ");
        num1 = input.nextInt();

        System.out.println("Please enter second number: ");
        num2 = input.nextInt();

        System.out.println("Please enter third number: ");
        num3 = input.nextInt();

        System.out.println("The " + num1 + " multiplied with " + num1 + " is = " + num1 * num1 +
                         "\nThe " + num2 + " multiplied with " + num2 + " is = " + num2 * num2 +
                         "\nThe " + num3 + " multiplied with " + num3 + " is = " + num3 * num3);

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-8------------------\n");


        System.out.println("Please enter the side of a square: ");
        num1 = input.nextInt();

        System.out.println("Perimeter of the square = " + num1 * 4 +
                         "\nArea of the square = " + num1 * num1);

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-9------------------\n");

        double number3 = 90_000;

        System.out.println("A Software Engineer in Test can earn $" + number3 * 3 + " in 3 years.");

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-10------------------\n");

        String favBook, favColor;
        int favNumber;
        input.nextLine();

        System.out.println("Please enter the name of your favorite book: ");
        favBook = input.nextLine();

        System.out.println("Please enter your favorite color: ");
        favColor = input.nextLine();

        System.out.println("Please enter your favorite number: ");
        favNumber = input.nextInt();

        System.out.println("User’s favorite book is: " + favBook +
                         "\nUser’s favorite color is: " + favColor +
                         "\nUser’s favorite number is: " + favNumber);

        /////////////////////////////////////////////////////////////////////

        System.out.println("\n---------------Task-11------------------\n");

        String firstName, lastName, eMail, phoneNumber, address;
        int age;
        input.nextLine();

        System.out.println("Please enter your first name: ");
        firstName = input.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = input.nextLine();

        System.out.println("Please enter your age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your email address: ");
        eMail = input.nextLine();

        System.out.println("Please enter your phone number: ");
        phoneNumber = input.nextLine();

        System.out.println("Please enter your address: ");
        address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". " +
                firstName + "'s age is\n" + age + ". " + firstName + "'s email address is " +
                eMail + ", phone number\nis " + phoneNumber + ", and address is " + address + ".");


    }
}
