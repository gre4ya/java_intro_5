package loops.do_while_loops;


import java.util.Scanner;

public class Exercise01_Get10FromUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 1;

        do{
            if(count == 1) System.out.println("Please enter a number");
            else System.out.println("Please enter a new number");
            number = input.nextInt();
            if(number < 10) System.out.println("This number is not more than or equal to 10");
            count++;
        }
        while(number < 10);

        System.out.println("This number is more than or equal to 10");


        System.out.println("------while loop solution------");


        System.out.println("Please enter a number");

        int num1 = input.nextInt();

        while(num1 < 10) {
            System.out.println("This number is not more than or equal to 10");
            System.out.println("Please enter a new number");
            num1 = input.nextInt();
        }
        System.out.println("This number is not more than or equal to 10");
    }
}
