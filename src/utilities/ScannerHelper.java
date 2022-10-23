package utilities;

import java.util.Scanner;

public class ScannerHelper {
    /*
    Create a method to ask user to enter a name and RETURN it
     */
    static Scanner input = new Scanner(System.in);

    public static String getAName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        return name;

    }
    public static int getAnAge(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }

    public static String getAnAddress(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full address:");
        String address = input.nextLine();

        return address;
    }

    public static String getAString(){
        System.out.println("Please enter a String");
        return input.nextLine();
    }

    public static String get4FavColors(){
        System.out.println("Please enter your four favourite colors");
        return input.nextLine();
    }

    public static int getANumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        input.nextLine();

        return number;
    }
}
