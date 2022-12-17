package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {
        /*
        - they preserve insertion order
        - they allow duplicates
        - they allow null elements

        - performance
        - memory
        - initial capacity
        - load
        - the way they store the data
         */
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits); // [Apple, Apple, Orange, , , null, null]

        LinkedList<String> fruits1 = new LinkedList<>();
        fruits1.add("Apple");
        fruits1.offer("Orange");
        fruits1.offerFirst("Pineapple");
        System.out.println(fruits1.element()); // Pineapple
        System.out.println(fruits1.getFirst()); // Pineapple
        System.out.println(fruits1);

        /*
        fruits1.clear();
        System.out.println(fruits1.poll()); // null
        System.out.println(fruits1.remove()); // NoSuchElementException
        */

    }
}
