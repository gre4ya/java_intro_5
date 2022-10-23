package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1. Declare a String array called as countries and assign size of 3
        String[] countries = new String[3];

        // 2. assigning values to specific indexes
        countries[1] = "Spain";

        // 3. print specific index from any array
        System.out.println(countries[0]);  // null
        System.out.println(countries[1]); // Spain

        // 4. printing an array
        System.out.println(Arrays.toString(countries)); // [null, Spain, null]

        // 5. assign Belgium to index of 2 and print the array
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries)); // [null, Spain, Belgium]

        // 6. update existing element
        countries[1] = "France";
        System.out.println(Arrays.toString(countries)); // [null, France, Belgium]

        // 7. getting the length of an array -> how many elements -> 3
        System.out.println(countries.length); // 3

        // 8. printing all elements from the new line
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Country of index " + i + " is " + countries[i]);
        }
    }
}
