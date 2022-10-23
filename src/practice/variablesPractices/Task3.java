package practice.variablesPractices;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        Requirement:
        Write a program that asks user to enter 5 numbers between 1 and 10
        (1 and 10 are included)
        They will get some points based on numbers they entered.
        So, their points will be calculated as below
        1st number will be multiplied by 5 and added as points
        2nd number will be multiplied by 4 and added as points
        3rd number will be multiplied by 3 and added as points
        4th number will be multiplied by 2 and added as points
        5th number will be multiplied by 1 and added as points
        If user enters any number that is not in the range,
        then user will not get any points from that number
         */

        int num1, num2, num3, num4, num5, points;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1 and 10");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        points = num1>0 & num1<11 ? num1 * 5 : 0;
        points += num2>0 & num2<11 ? num2 * 4 : 0;
        points += num3>0 & num3<11 ? num3 * 3 : 0;
        points += num4>0 & num4<11 ? num4 * 2 : 0;
        points += num5>0 & num5<11 ? num5  : 0;
        System.out.println(points);


    }
}
