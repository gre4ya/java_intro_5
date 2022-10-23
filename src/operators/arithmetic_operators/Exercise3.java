package operators.arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        double salary;

        Scanner inputSalary = new Scanner(System.in);
        System.out.println("Hey user, how much you make yearly?");
        salary = inputSalary.nextDouble();
        System.out.println("Your monthly payment is $" + salary / 12 + " then!");

        /*

        Scanner inputSalary = new Scanner(System.in);

        System.out.println("Hey user, how much you make yearly?");
        double salary = inputSalary.nextDouble();

        System.out.println("Your monthly payment is $" + salary / 12 + " then!");

        /////////////////////////////////////////////

        Scanner inputSalary = new Scanner(System.in);

        System.out.println("Hey user, how much you make yearly?");

        System.out.println("Your monthly payment is $" + inputSalary.nextDouble() / 12 + " then!");

         */
    }
}
