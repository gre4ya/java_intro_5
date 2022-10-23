package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_SumOfNumbersByUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int howManyNumbers = ScannerHelper.getANumber();
        int sum = 0;
        for (int i = 1; i <= howManyNumbers ; i++) {
            System.out.println("Please enter number " + i);
            sum += input.nextInt();
        }
        System.out.println(sum);

        int howManyNumbers2 = ScannerHelper.getANumber();

        int sum2 = 0;
        int start = 1;

        while(start<=howManyNumbers2){
            System.out.println("Please enter number " + start);
            sum2 += input.nextInt();

        }
        System.out.println(sum2);
    }

}
