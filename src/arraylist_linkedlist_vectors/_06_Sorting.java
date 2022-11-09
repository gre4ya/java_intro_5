package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class _06_Sorting {
    public static void main(String[] args) {

        /*
         Create below LinkedList to store data

         1 -> 10, -3, 5, 15
         2 -> Remote, Phone, Laptop

         Print the LinkedLists
         Sort the LinkedLists and print them again

         EXPECTED:
         [10, -3, 5, 15]
         [Remote, Phone, Laptop]
         [-3, 5, 10, 15]
         [Laptop, Phone, Remote]
          */

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        LinkedList<String> words = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println("--------Before-Sort--------");

        System.out.println(numbers); // [10, -3, 5, 15]
        System.out.println(words);   // [Remote, Phone, Laptop]

        Collections.sort(numbers);
        Collections.sort(words);

        System.out.println("--------After-Sort--------");

        System.out.println(numbers);  // [-3, 5, 10, 15]
        System.out.println(words);    // [Laptop, Phone, Remote]
    }
}
