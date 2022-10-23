package homeworks;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        System.out.println("----------Task-1----------");

        String str = "";
        for (int i = 1; i <= 100 ; i++) {
            if(i % 7 == 0)
                str += i + " - ";
        }
        System.out.println(str.substring(0, str.length()-3));

        System.out.println("\n----------Task-2----------");

        str = "";

        for (int i = 1; i <= 50 ; i++) {
            if(i % 6 == 0)
                str += i + " - ";
        }
        System.out.println(str.substring(0, str.length()-3));

        System.out.println("\n----------Task-3----------");

        str = "";

        for (int i = 100; i >= 50 ; i--) {
            if(i % 5 == 0)
                str += i + " - ";
        }
        System.out.println(str.substring(0, str.length()-3));

        System.out.println("\n----------Task-4----------");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i * i));
        }

        System.out.println("\n----------Task-5----------");

        int sum = 0;

        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n----------Task-6----------");


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int num = input.nextInt();

        input.nextLine();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        System.out.println("\n----------Task-7----------");

        System.out.println("Please enter your full name");
        String fullName = input.nextLine();

        fullName = fullName.toLowerCase();
        int count = 0;

        for (int i = 0; i < fullName.length(); i++) {
            if(fullName.charAt(i) == 'a' ||
               fullName.charAt(i) == 'e' ||
               fullName.charAt(i) == 'i' ||
               fullName.charAt(i) == 'o' ||
               fullName.charAt(i) == 'u')
               count++;
        }
        System.out.println("There are " + count + " vowel letters in this full name");

        System.out.println("\n----------Task-8----------");

        sum = 0;
        int number;
        do{
            System.out.println("Please enter a number");
            number = input.nextInt();
            input.nextLine();
            sum += number;

            if(number >= 100) System.out.println("This number is already more than 100");
            else if(sum >= 100) System.out.println("Sum of the entered numbers is at least 100");
        }
        while(sum < 100);

        System.out.println("\n----------Task-9----------");
/*
        int number1 = 37; // number of numbers in the Fibonacci sequence

        if (number1 == 1) System.out.println("0");
        else if (number1 == 2) System.out.println("0 - 1");
        else if (number1 >= 3) {
            int previous = 0;
            int next = 1;
            String fibonacci = "";
            int count1 = 2;
            for (;;) {

                int random = RandomNumberGenerator.getARandomNumber(0, 2000000000);
                if (random == previous + next) {

                    fibonacci += random + " - ";
                    previous = next;
                    next = random;
                    count1++;
                    if (count1 == number1) break;
                }
            }
            System.out.println("0 - 1 - " + fibonacci.substring(0, fibonacci.length() - 3));
        }

 */
      number = 35;
        if (number == 1) System.out.println("0");
        else if (number == 2) System.out.println("0 - 1");
        else if (number >= 3) {

            long a = 0;
            long b = 1;
            long sum1 = 0;

            String fibonacci = "";

            for (int i = 1; i <= number - 2; i++) {
                sum1 = a + b;
                a = b;
                b = sum1;
                fibonacci += sum1 + " - ";
            }
            System.out.println("0 - 1 - " + fibonacci.substring(0, fibonacci.length() - 3));
        }

        System.out.println("\n----------Task-10----------");

        String name;

        do {
            System.out.println("Please enter a name");
            name = input.nextLine();

            if(name.charAt(0) == 'J' || name.charAt(0) == 'j' ) {
                System.out.println("End of the program");
                break;
            }
        }
        while(name.charAt(0) != 'J' || name.charAt(0) != 'j' );

    }
}