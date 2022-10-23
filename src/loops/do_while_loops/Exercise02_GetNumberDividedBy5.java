package loops.do_while_loops;

import java.util.Scanner;

public class Exercise02_GetNumberDividedBy5 {
    public static void main(String[] args) {

        System.out.println("------do-while loop solution------");

        Scanner input = new Scanner(System.in);

        int num;
        int count = 1;

        do{
            if(count == 1) System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
            num = input.nextInt();
            if(num % 5 == 0) System.out.println("This number is dividable by 5");
            else System.out.println("This number is not dividable by 5");
            count++;
        }
        while(num % 5 != 0);

        System.out.println("------while loop solution------");

        System.out.println("Please enter a number");
        num = input.nextInt();

        while (num % 5 != 0) {
            System.out.println("This number is not dividable by 5");
            System.out.println("Please enter a new number");
            num = input.nextInt();
        }
        System.out.println("This number is dividable by 5");

        System.out.println("------fori loop solution------");

        for (;;) {
            System.out.println("Please enter a number");
            num = input.nextInt();
            if(num % 5 != 0) System.out.println("This number is not dividable by 5");
            else break;
        }
        System.out.println("This number is dividable by 5");

    }
}
