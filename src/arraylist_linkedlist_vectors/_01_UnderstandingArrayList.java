package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        //1. Declaring an array vs ArrayList
        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); // default capacity = 10

        //2. Getting the size of array vs ArrayList
        System.out.println("\n--------Size of array vs ArrayList--------\n");
        System.out.println("The size of the array = " + names1.length); // 3
        System.out.println("The size of the ArrayList = " + names2.size()); // 0

        //3. Printing an array vs ArrayList
        System.out.println("\n--------Printing an array vs ArrayList--------\n");
        System.out.println("The array = " + Arrays.toString(names1)); // [null, null, null]
        System.out.println("The ArrayList = " + names2); // []

        //4. Adding elements to specific index
        names1[0] = "Alex";
        names2.add(0, "John"); // names2.add("John");
        System.out.println("\n--------Adding elements to specific index--------\n");
        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, null, null]
        System.out.println("The ArrayList = " + names2); // [John]

        System.out.println("\n-------------------------------------------------\n");

        names1[1] = "Ali";
        names1[2] = "Andrii";
        names2.add("Joe");
        names2.add("Jane");
        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, Ali, Andrii]
        System.out.println("The ArrayList = " + names2); // [John, Joe, Jane]
        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");
        System.out.println("The ArrayList = " + names2);
        // [John, Joe, Jane, Abdallah, Vlad, Saeed, Suzanne, Hazal, Yildiz, Samir]

        System.out.println("The size of ArrayList = " + names2.size()); // 10

        //5. Updating an existing element in array vs ArrayList
        names1[1] = "Mike";
        names2.set(1, "Olena");
        System.out.println("The array = " + Arrays.toString(names1)); // [Alex, Mike, Andrii]
        System.out.println("The ArrayList = " + names2);
        // [John, Olena, Jane, Abdallah, Vlad, Saeed, Suzanne, Hazal, Yildiz, Samir]

    }
}
