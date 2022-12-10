package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {

        // 1. create an int array and store 0, -5, 2, 10, 5, 2, -1, 0
        int[] numbers = {0, -5, 2, 10, 5, 2 , -1, 0};
        System.out.println(Arrays.toString(numbers));
        String str = Arrays.toString(numbers);
        str = str.replaceAll(",","").replaceAll(" ", "").replaceAll("\\[", "").replaceAll("\\]","");
        System.out.println(str);

        // 2. print the array
        System.out.println(Arrays.toString(numbers)); // [0, -5, 2, 10, 5, 2, -1, 0]
        System.out.println(Arrays.toString(numbers).substring(1, Arrays.toString(numbers).length() - 1)); // 0, -5, 2, 10, 5, 2, -1, 0

        // 3. iterate the array - print each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for each loop way - enhanced for loop
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
