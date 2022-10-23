package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        int[] numbers = {5, -1, 3, 10};
        String[] objects = {"remote", "computer", "Cup", "Phone"};

        System.out.println("-------Before sort-------");

        System.out.println(Arrays.toString(numbers));// [5, -1, 3, 10]
        System.out.println(Arrays.toString(objects));// [remote, computer, Cup, Phone]

        System.out.println("-------After sort-------");

        Arrays.sort(numbers);
        Arrays.sort(objects);
        System.out.println(Arrays.toString(numbers));// [-1, 3, 5, 10]
        System.out.println(Arrays.toString(objects));// [Cup, Phone, computer, remote]

    }
}
