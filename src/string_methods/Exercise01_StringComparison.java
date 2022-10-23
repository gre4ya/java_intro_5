package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sting");
        String str1 = input.nextLine();
        System.out.println("Please enter another sting");
        String str2 = input.nextLine();

        System.out.println(str1.equals(str2) ? "These strings are equal" : "These strings are not equal");
         */

        String s1 = ScannerHelper.getAString();
        String s2 = ScannerHelper.getAString();

        if(s1.equals(s2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");

        // System.out.println(ScannerHelper.getAString().equals(ScannerHelper.getAString()) ?
        //      "These strings are equal" : "These strings are not equal");


    }
}
