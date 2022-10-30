package arraylist_linkedlist_vectors;

import java.util.*;

public class _08_ConvertingAnArrayToArrayList {
    public static void main(String[] args) {
        System.out.println("--------WAY-1 with Arrays.asList() method---------");

        String[] arr1 = {"Tokyo", "Berlin", "Kyiv", "Denver"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(cities);

        System.out.println("--------WAY-2 with loops - MANUAL WAY---------");

        char[] arr2 = {'A', '#', '5', '+'};
        LinkedList<Character> characters = new LinkedList<>();
        for (Character c : arr2) {
            characters.add(c);
        }
        System.out.println(characters);

        System.out.println("--------WAY-3 with Collections.addAll() method---------");

        Integer[] arr3 = {1, 2, 2, 7, 10};
        Vector<Integer> numbers = new Vector<>();
        Collections.addAll(numbers, arr3);

        System.out.println(numbers);







    }
}
