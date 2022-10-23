package homeworks;


import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {


        System.out.println("----------------- Task - 1 -----------------\n");


        int num1, num2, num3, num4, num5;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));


        System.out.println("----------------- Task - 2 -----------------\n");


        System.out.println("Please enter five numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        int maxNum = Math.max(Math.max(Math.max(num1, num2), Math.max(num3,num4)), num5);
        int minNum = Math.min(Math.min(Math.min(num1, num2), Math.min(num3,num4)), num5);

        System.out.println("Max value = " + maxNum);
        System.out.println("Min value = " + minNum);


        System.out.println("----------------- Task - 3 -----------------\n");


        int randomNumber1, randomNumber2, randomNumber3;

        randomNumber1 = (int) (Math.random() * 51 + 50);
        randomNumber2 = (int) (Math.random() * 51 + 50);
        randomNumber3 = (int) (Math.random() * 51 + 50);
        System.out.println("Number 1 = " + randomNumber1);
        System.out.println("Number 2 = " + randomNumber2);
        System.out.println("Number 3 = " + randomNumber3);
        System.out.println("The sum of numbers is = " + (randomNumber1 + randomNumber2 + randomNumber3));


        System.out.println("----------------- Task - 4 -----------------\n");


        double moneyAlex = 125.0;
        double moneyMike = 220.0;
        moneyAlex -= 25.5;
        moneyMike += 25.5;
        System.out.println("Alex's money: $" + moneyAlex);
        System.out.println("Mike's money: $" + moneyMike);


        System.out.println("----------------- Task - 5 -----------------\n");


        int bicycleInDays = (int) (390.0 / 15.6);
        System.out.println(bicycleInDays);


        System.out.println("----------------- Task - 6 -----------------\n");


        String s1, s2;
        int n1, n2;

        s1 = "5";
        s2 = "10";
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        System.out.println("-Sum of 5 and 10 is = " + (n1 + n2) +
                         "\n-Product of 5 and 10 is = " + n1 * n2 +
                         "\n-Division of 5 and 10 is = " + n1 / n2 +
                         "\n-Subtraction of 5 and 10 is = " + (n1 - n2) +
                         "\n-Remainder of 5 and 10 is = " + n1 % n2);


        System.out.println("----------------- Task - 7 -----------------\n");


        s1 = "200";
        s2 = "-50";
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        System.out.println("The greatest value is = " + Math.max(n1, n2) +
                         "\nThe smallest value is = " + Math.min(n1, n2) +
                         "\nThe average is = " + (n1 + n2)/2 +
                         "\nthe absolute difference is = " + Math.abs(n1-n2));


        System.out.println("----------------- Task - 8 -----------------\n");


        System.out.println((int) (24/.96) + " days");
        System.out.println((int) (168/.96) + " days");
        System.out.println("$" + .96 * 30 * 5);


        System.out.println("----------------- Task - 9 -----------------\n");


        System.out.println((int) (1250/62.5));


        System.out.println("----------------- Task - 10 -----------------\n");


        System.out.println("Option 1 will take " + (int) (14265/475.5) + " months");
        System.out.println("Option 2 will take " + 14265/951 + " months");


        System.out.println("----------------- Task - 11 -----------------\n");


        System.out.println("Please enter two numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println((double)number1/(double)number2);


        System.out.println("----------------- Task - 12 -----------------\n");


        randomNumber1 = (int) (Math.random() * 101);
        randomNumber2 = (int) (Math.random() * 101);
        randomNumber3 = (int) (Math.random() * 101);

        if (randomNumber1 > 25 & randomNumber2 > 25 & randomNumber3 > 25) System.out.println("true");
        else System.out.println("false");
        //System.out.println(randomNumber1 > 25 && randomNumber2 > 25 && randomNumber3 > 25);


        System.out.println("----------------- Task - 13 -----------------\n");


        System.out.println("Please enter a number in the range between 1 and 7");
        num1 = input.nextInt();
        if (num1 == 1) System.out.println("The number entered returns MONDAY");
        else if(num1 == 2) System.out.println("The number entered returns TUESDAY");
        else if(num1 == 3) System.out.println("The number entered returns WEDNESDAY");
        else if(num1 == 4) System.out.println("The number entered returns THURSDAY");
        else if(num1 == 5) System.out.println("The number entered returns FRIDAY");
        else if(num1 == 6) System.out.println("The number entered returns SATURDAY");
        else System.out.println("The number entered returns SUNDAY");


        System.out.println("----------------- Task - 14 -----------------\n");


        System.out.println("Tell me your exam results?");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        int examAverage = (num1 + num2 + num3)/3;

        if (examAverage >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");


        System.out.println("----------------- Task - 15 -----------------\n");


        System.out.println("Please enter 3 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if(num1 == num2 & num2 == num3) System.out.println("TRIPLE MATCH");
        else if(num1 == num2 & num1 != num3) System.out.println("DOUBLE MATCH");
        else if(num1 == num3) System.out.println("DOUBLE MATCH");
        else if(num2 == num3) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");

    }
}
