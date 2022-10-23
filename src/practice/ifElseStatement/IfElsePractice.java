package practice.ifElseStatement;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
        int myInt = input.nextInt();

        /*
        if(myInt >= 0 && myInt <= 24) System.out.println("first quoter");
        else if (myInt >= 25 && myInt <= 49) System.out.println("second quoter");
        else if (myInt >= 50 && myInt <= 74) System.out.println("third quoter");
        else System.out.println("the number is out of range");
         */

        if (myInt >= -50 && myInt < 0) System.out.println("number is in negative part");
        else if (myInt > 0 && myInt <= 50) System.out.println("number is in positive part");
        else if (myInt == 0) System.out.println("number is zero");
        else System.out.println("the number is out of range");

        }
}
