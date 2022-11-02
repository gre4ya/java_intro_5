package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_forEach {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Red", "Brown", "Pink", "Yellow", "Black"));
        System.out.println(colors);

        System.out.println("---------Iterating-with-fori-loop---------");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("---------Iterating-with-for-each-loop---------");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("---------Iterating-with-forEach---------");

        colors.forEach(System.out::println);
    }
}
