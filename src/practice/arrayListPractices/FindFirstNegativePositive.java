package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        firstNegativePositive(numbers);
    }
        /*
        Create a public static method which will take an arraylist and it will find the
        first positive and first negative number and print them.

        Example:
            ArrayList -> [0, -4, -7, 0, 5, 10, 45]

        Output:
            First positive number is: 5
            First negative number is: -4
         */
    public static void firstNegativePositive(ArrayList<Integer> numbers){

        int firstNegative = 0;
        int firstPositive = 0;
        boolean isFirstNegative = false;
        boolean isFirstPositive = false;

        for (Integer number : numbers) {
            if (number < 0 && !isFirstNegative) {
                firstNegative = number;
                isFirstNegative = true;
            }
            if(number > 0 && !isFirstPositive) {
                firstPositive = number;
                isFirstPositive = true;
            }
        }
        System.out.println("First positive number is: " + firstPositive);
        System.out.println("First negative number is: " + firstNegative);
    }
    public static void firstNegativePositive2(ArrayList<Integer> numbers){

        int firstNegative = 0;
        int firstPositive = 0;

        for (Integer number : numbers) {
            if (number < 0 && firstNegative == 0)
                firstNegative = number;
            if(number > 0 && firstPositive == 0)
                firstPositive = number;
        }
        System.out.println("First positive number is: " + firstPositive);
        System.out.println("First negative number is: " + firstNegative);
    }



}
