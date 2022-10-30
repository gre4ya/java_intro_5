package arraylist_linkedlist_vectors;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise01_countElements {
    public static void main(String[] args) {

        /*
         Create an ArrayList and store below colors
         Blue, Brown, Pink, Yellow, Red, Purple
         Print the ArrayList
         Print the size
         Print each element separately
         EXPECTED:
         [Blue, Brown, Pink, Yellow, Red, Purple]
         6
         Blue
         Brown
         Pink
         Yellow
         Red
         Purple
          */
        // ArrayList<String> colours = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));

        System.out.println("-----------Task-1-----------");

        ArrayList<String> colors = new ArrayList<>();

          colors.add("Blue");
          colors.add("Brown");
          colors.add("Pink");
          colors.add("Yellow");
          colors.add("Red");
          colors.add("Purple");

        System.out.println(colors);
        System.out.println(colors.size());
        for (String color : colors) {
            System.out.println(color);
        }

        // count elements that has length of 6

        System.out.println("-----------Task-2-----------");

        int count = 0;
        for (String color : colors) {
            if(color.length() == 6)
                count++;
        }
        System.out.println(count);
    }
}
