package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise2_EvenAOrOdd {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a number.
        If the number entered is even, then print message “The number you entered is even!”
        If the number entered is odd, then print message “The number you entered is odd!”

        num % 2 == 0 ---> EVEN
        num % 2 != 1 ---> EVEN

        num % 2 == 1 ---> ODD
        num % 2 != 0 ---> ODD
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Hey user, enter a number");
        int number = input.nextInt();

        if ( number % 2 == 0){
            System.out.println("The number you entered is even!");
        }
        else{
            System.out.println("The number you entered is odd!");
        }
        System.out.println("End of the program!");
    }
}
