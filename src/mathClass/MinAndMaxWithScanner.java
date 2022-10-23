package mathClass;

import java.util.Scanner;

public class MinAndMaxWithScanner {
    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        System.out.println("Hey user give me a number");
        num1 = input.nextInt();
        System.out.println("Hey user give me another number");
        num2 = input.nextInt();
        System.out.println("Max of your numbers is " + Math.max(num1, num2));
        System.out.println("Min of your numbers is " + Math.min(num1, num2));

        System.out.println("------------------Next Task--------------------");

        System.out.println("Hey user give me a number");
        num1 = input.nextInt();
        System.out.println("Hey user give me another number");
        num2 = input.nextInt();
        System.out.println("Hey user give the last number");
        num3 = input.nextInt();
        System.out.println("Max of your numbers is " + Math.max(Math.max(num1, num2), num3));
        System.out.println("Min of your numbers is " + Math.min(Math.min(num1, num2), num3));

    }
}
