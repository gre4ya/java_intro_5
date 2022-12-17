package collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, -5, 10, 1, 2, 5})));
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, 1, 2, 5})));
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{})));
    }




    public static Integer[] removeDuplicates(Integer[] arr){
        return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]));
    }

    /*
    public static Integer[] removeDuplicates(Integer[] arr){
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer i : arr) {
            if(!uniques.contains(i)) uniques.add(i);
        }
        return uniques.toArray(new Integer[0]);
    }
     */
}
