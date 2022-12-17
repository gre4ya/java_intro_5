package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice02_FindClosestToN {
    public static void main(String[] args) {

        System.out.println(findClosest(new ArrayList<Integer>(Arrays.asList(3, 5, 6, 10)), 7));
        System.out.println(findClosest(new ArrayList<Integer>(Arrays.asList(3, 5, 6, 8)), 7));
        //System.out.println(findClosest(new ArrayList<Integer>(Arrays.asList()), 7)); // RuntimeException
        System.out.println(findClosest(new ArrayList<Integer>(Arrays.asList(3)), 7)); // 3
        //System.out.println(findClosest(new ArrayList<Integer>(Arrays.asList(7)), 7)); // RuntimeException
        //System.out.println(findClosest(new ArrayList<Integer>(Arrays.asList(7, 7)), 7)); // RuntimeException
        System.out.println(findClosest(new ArrayList<Integer>(Arrays.asList(7, 7)), 2)); // 7

    }

    /*
    Assume you are given a collection of numbers a number called as n
    Find the closest number to n in given collection
    [8, 10, 12], 10 -> 8
    [4, 4], 4 -> throw exception
    empty -> [], 5 -> throw exception
    having one element ->
    having one element and its n -> [3], 3 -> throw exception
     */

    public static int findClosest(List<Integer> nums, int n){
        TreeSet<Integer> set = new TreeSet<>(nums);
        if(set.isEmpty() || (set.size() == 1 && set.first() == n))
            throw new RuntimeException("There is no close number to " + n + ".");
        else if(set.size() == 1) return set.first();
        else {
            try {
                int lowerNumber = set.lower(n);
            }catch (NullPointerException e){
                return set.higher(n);
            }
            try{
                int higherNumber = set.higher(n);
            }catch (NullPointerException e){
                return set.lower(n);
            }
        }
       int lower = set.lower(n), higher = set.higher(n);

        return n - lower <= higher - n ? lower : higher;
    }
}
