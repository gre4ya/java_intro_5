package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Practice03_SubSet {
    public static void main(String[] args) {
        /*
        Create a collection to store below numbers
        3, 2, 7, 10, 15, 20, 7, 5

        Find all the elements more than 7 -> [10, 15, 20]
        Find all the elements less than or equal to 5 -> [2, 3, 5]
        Find all the elements between 5 and 15 both inclusive -> [5, 7, 10, 15]
         */

        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(3, 2, 7, 10, 15, 20, 7, 5));
        System.out.println(nums.tailSet(7, false)); // [10, 15, 20]
        System.out.println(nums.headSet(5, true)); // [2, 3, 5]
        System.out.println(nums.subSet(5, true, 15, true)); // [5, 7, 10, 15]

    }
}
