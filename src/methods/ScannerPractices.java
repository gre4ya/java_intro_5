package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter their name and age and print  the info in a format
        {name}'s age is {age}.

        Scanner inout = new Scanner(System.in);

        System.out.println("Hey, user enter your name: ");
        String name = inout.nextLine();

        System.out.println("Hey, user enter your age: ");
        int age = inout.nextInt();


         */

        System.out.println(ScannerHelper.getAName()  + "'s age is " + ScannerHelper.getAnAge() + "." +
        "\nAddress is " + ScannerHelper.getAnAddress());


    }
}
