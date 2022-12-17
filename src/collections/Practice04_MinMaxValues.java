package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice04_MinMaxValues {

    /*
    Find the min from given numbers below
    [10, 100, 123, 507, 25] -> 10
    [12] -> 12
    [] -> null
     */

    public static void main(String[] args) {

        System.out.println(max(new Integer[]{10, 100, 123, 507, 25})); // 507
        System.out.println(max(new Integer[]{12})); // 12
        System.out.println(max(new Integer[]{})); // null

        System.out.println(min(new Integer[]{10, 100, 123, 507, 25})); // 10
        System.out.println(min(new Integer[]{12})); // 12
        System.out.println(min(new Integer[]{})); // null

        System.out.println(secondMax(new Integer[]{10, 100, 123, 507, 25})); // 123
        System.out.println(secondMax(new Integer[]{5, 5, 5, 5})); // null
        System.out.println(secondMax(new Integer[]{12})); // null
        System.out.println(secondMax(new Integer[]{})); // null


    }

    public static Integer max(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }
    public static Integer min(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollFirst();
    }
    public static Integer secondMax(Integer[] arr) {
        if (arr.length > 1) {
            try {
                TreeSet<Integer> arr1 = new TreeSet<>(Arrays.asList(arr));
                arr1.pollLast();
                return arr1.last();
            }catch (Exception e){
                return null;
            }
        }
        else return null;
    }


}
