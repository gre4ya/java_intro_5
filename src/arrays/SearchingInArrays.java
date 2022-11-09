package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        // Search for 7 in array and return true if it exists and false otherwise
        int[] numbers = {3, 5, 8, 10};
        boolean hasSeven = false;
        for (int number : numbers) {
            if(number == 7) {
                hasSeven = true;
                break;
            }
        }
        System.out.println(hasSeven); //false


        boolean has5 = false;
        for (int number : numbers) {
            if(number == 5) {
                has5 = true;
                break;
            }
        }
        System.out.println(has5);

        System.out.println("-----------Binary search in array-----------");

        //NOTE: Binary search can be used if array is sorted ONLY, otherwise you will get wrong result
        // Binary search return the index of the element if found
        // if there are more than 1 element in array, it returns the index of last element

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 7)); // if result is < 0 result is wrong

    }
}