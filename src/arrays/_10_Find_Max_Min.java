package arrays;

import java.util.Arrays;

public class _10_Find_Max_Min {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 4, 7, -5};
        printMaxAndMinWithoutSort(numbers);
        printMaxAndMinWithSort(numbers);

    }

    public static void printMaxAndMinWithoutSort(int[] numbers){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        if(numbers.length > 0) {
            for (int number : numbers) {
                if (number < min)
                    min = number;
                if (number > max)
                    max = number;
            }
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
        }
        else System.out.println("Array is empty");
    }
    public static void printMaxAndMinWithSort(int[] numbers){
        Arrays.sort(numbers);
        if(numbers.length > 0) {
            System.out.println("Max = " + numbers[numbers.length - 1]);
            System.out.println("Min = " + numbers[0]);
        }
        else System.out.println("Array is empty");
    }

}
