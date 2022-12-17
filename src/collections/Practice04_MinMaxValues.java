package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        System.out.println(secondMin(new Integer[]{10, 100, 123, 507, 25})); // 25
        System.out.println(secondMin(new Integer[]{5, 5, 5, 5})); // null
        System.out.println(secondMin(new Integer[]{12})); // null
        System.out.println(secondMin(new Integer[]{})); // null

        System.out.println("\n-----------------------------\n");

        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10, 100, 123, 507, 25)), 3)); // 100
        System.out.println(nthMin(new ArrayList<>(Arrays.asList(10, 101, 123, 507, 25)), 3)); // 101
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100)), 3)); // null
        System.out.println(nthMax(new ArrayList<>(Arrays.asList()), 3)); // null
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(23, 25)), 3)); // null


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
    public static Integer secondMin(Integer[] arr) {
        if (arr.length > 1) {
            try {
                TreeSet<Integer> arr1 = new TreeSet<>(Arrays.asList(arr));
                arr1.pollFirst();
                return arr1.first();
            }catch (Exception e){
                return null;
            }
        }
        else return null;
    }

    public static Integer nthMax(List<Integer> numbers, int nth){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if(set.size() < nth) return null;

        //nth-1 time pollLast() and then return last()
        for (int i = 1; i <= nth-1; i++) {
            set.pollLast();
        }
        return set.last();
    }
    public static Integer nthMin(List<Integer> numbers, int nth){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if(set.size() < nth) return null;

        //nth-1 time pollFirst() and then return first()
        for (int i = 1; i <= nth-1; i++) {
            set.pollFirst();
        }
        return set.first();
    }




}
