package operators.arithmetic_operators;

public class UnderstandingArithmeticOperators {
    public static void main(String[] args) {
        /*
        Find the result of below expressions
        3 + 5 = 8
        5 - 2 = 3
        10 / 2 = 5
        2 * 4 = 8
        10 % 3 = 1
         */

        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(10 / 2);
        System.out.println(2 * 4);
        System.out.println(10 % 3);

        /*
        Create 2 int variables called as num1 and num2
        And store 6 and 4 in these variables respectively
        Find their
        sum
        subtraction
        product
        division
        remainder
         */

        int num1 = 6;
        int num2 = 4;
        System.out.println("\nThe sum of these numbers is = " + (num1 + num2)); // The sum of these numbers is = 10
        System.out.println("The subtraction of these numbers is = " + (num1 - num2)); // The subtraction of these numbers is = 2
        System.out.println("The product of these numbers is = " + num1 * num2); // The product of these numbers is = 24
        System.out.println("The division of these numbers is = " + num1 / num2); // The division of these numbers is = 1
        System.out.println("The remainder of these numbers is = " + num1 % num2); // The remainder of these numbers is = 2



    }
}
