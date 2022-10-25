package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {

        double[] numbers = {1.5, 2.3, -1.3, -3.7};

        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(numbers)); // [1.5, 2.3, -1.3, -3.7]
        System.out.println("The length of the array is " + numbers.length);

        Arrays.sort(numbers);
        System.out.println("Array after sorting -> " + Arrays.toString(numbers)); // [-3.7, -1.3, 1.5, 2.3]

        System.out.println("-----printing-array-with-fori-loop-----");
        // when you need to use increment numbers or indexes
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("-----printing-array-with-for-each-loop-----");
        // when you don't need to use increment numbers or indexes
        for (double number: numbers) {
            System.out.println(number);
        }
        System.out.println("------printing-two-arrays------");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(numbers[i] + " - " + chars[i]);
        }





    }
}
