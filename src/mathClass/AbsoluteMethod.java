package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args) {

        System.out.println("Difference between your numbers is = " + Math.abs(10 - 14));      // 4
        System.out.println("Difference between your numbers is = " + Math.abs(-10 - -14));     // 4

        int num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        num1 = input.nextInt();

        System.out.println("Please enter another age");
        num2 = input.nextInt();

        System.out.println("Difference between your ages is = " + Math.abs(num1 - num2));
        System.out.println("Biggest age is " + Math.max(num1, num2));
        System.out.println("Smallest age is " + Math.min(num1, num2));
    }
}
