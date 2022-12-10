package exeption_handling.custom_exeptions;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPermission {
    public static void main(String[] args) {

        int age = ScannerHelper.getAnAge();
        try {if (Permission.isAgeValid(age)) System.out.println("You can get DL");}
        catch (Exception e) {e.printStackTrace();}
        finally {System.out.println("you are " + age + ".");}

        /*
        Write a program to ask user to enter the day
        Let user know the check in hours
        In case of any error, catch it and print the error
        Finally, print the current date - day
         */

        int day = ScannerHelper.getANumber();
        try{System.out.println(Permission.getCheckInHours(day));}
        catch (Exception e) {e.printStackTrace();}
        finally {
            Date date = new Date(); // Sat Dec 10 14:53:59 CST 2022
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE"); // Saturday
            System.out.println("The current date is " + dayFormat.format(date));
        }
    }
}
