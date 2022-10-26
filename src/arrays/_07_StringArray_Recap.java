package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {

        String[] words = new String[4];
        System.out.println(Arrays.toString(words));

        words[0] = "Apple";
        words[3] = "Kiwi";

        System.out.println(Arrays.toString(words));

        words[1] = "Grapes";
        words[2] = "Orange";

        System.out.println(Arrays.toString(words));

        System.out.println("Reassigning values:");
        words[2] = "Apple";
        words[3] = "Apple";

        System.out.println(Arrays.toString(words));




    }
}
